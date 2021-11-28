package com.pb.glushnyak.hw10;

public class NumBox <T extends Number> {
    private final T[] number;


    public NumBox(int size) {
        number = (T[]) new Number[size];
    }
    public void add(T num) throws ArrayIndexOutOfBoundsException {
      int  j = 0;
      for (T some: number){
          if (some != null){
              j++;
          }
      }
        number[j] = num;
    }

    public T get(int index) {
       return number[index];
    }

    public int length() {
        int j = 0;
        for (T some : number) {
            if (some != null) {
                j++;
            }
        }
        return j;
    }

    public double average() {
            int  j = 0;
            double sum = 0;
            for (T some: number){
                if (some != null) {
                    j++;
                    sum = sum + some.doubleValue();
                }
        }
            return (sum/j);
    }

    public double sum() {
        double sum = 0;
        for (T some: number){
            if (some != null) {
                sum = sum + some.doubleValue();
            }
        }
        return sum;
    }

    public T max() {
        T k = number[0];
        for (T some: number) {
            if (some != null) {
                if (some.doubleValue() > k.doubleValue()) {
                    k = some;
                }
            }
        }
        return k;
    }
    }
