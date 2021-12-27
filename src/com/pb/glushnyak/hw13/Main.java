package com.pb.glushnyak.hw13;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static class Producer extends Thread {
        private final Object locks;
        private final Queue<Integer> someQueue;

        public Producer(Object locks, Queue<Integer> someQueue) {
            this.locks = locks;
            this.someQueue = someQueue;
        }

        @Override
        public void run() {
            int numb = 1;

            for (int i = 0; i < 30; i++) {

                if (someQueue.size() < 5) {
                    numb += i;
                    synchronized (locks) {
                        someQueue.add(numb);
                        locks.notify();

                        if (someQueue.size() >= 5) {
                            try {
                                locks.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }

    public static class Сonsumer extends Thread {
        private final Object locks;
        private final Queue<Integer> someQueue;

        public Сonsumer(Object locks, Queue<Integer> someQueue) {
            this.locks = locks;
            this.someQueue = someQueue;
        }

        @Override
        public void run() {
            Integer numb = 1;

            while (true) {
                if (!someQueue.isEmpty()) {

                    synchronized (locks) {
                        System.out.println(numb);
                        numb = someQueue.remove();
                        locks.notify();

                        if (someQueue.isEmpty()) {
                            try {
                                locks.wait(5000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        Object locks = new Object();
        Queue<Integer> someQueue = new PriorityQueue<>();
        Producer producer = new Producer(locks, someQueue);
        Сonsumer consumer = new Сonsumer(locks, someQueue);

        producer.start();
        consumer.start();

        while (true) {
            if (!producer.isAlive() && someQueue.isEmpty()) {
                System.exit(0);
            }
        }
    }
}