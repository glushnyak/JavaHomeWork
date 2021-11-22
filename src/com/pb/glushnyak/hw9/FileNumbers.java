package com.pb.glushnyak.hw9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileNumbers {
    public static void main(String[] args) {
        createNumbersFile();
        createOddNumbersFile();

    }
    public static void createNumbersFile(){
        Random rand = new Random();
        int[][] mass = new int[10][10];
        for (int i = 0; i < mass.length; i++){
            for (int y = 0; y < mass.length; y++){
                mass[i][y] = rand.nextInt(100);
            }
        }

        String[] stroka = new String[10];
        for (int k = 0; k < mass.length; k++){
            String result = "";
            for (int l = 0; l < mass.length; l++){
                result += mass[k][l] + " ";
            }
            stroka[k] = result;
        }

        Path path = Paths.get("src/com/pb/glushnyak/hw9/numbers.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (int t = 0; t < stroka.length; t++){
                writer.write(stroka[t]);
                writer.newLine();
            }
        } catch (Exception ex) {
            System.out.println("Some Error");
        }
    }


    public static void createOddNumbersFile(){
        String[] stroka2 = new String[10];
        Path path = Paths.get("src/com/pb/glushnyak/hw9/numbers.txt");
        try (BufferedReader reader = Files.newBufferedReader(path)) {

            String newLine;
            int s = 0;
            while((newLine = reader.readLine()) != null) {
                String masss = "";
                String[] arr = newLine.split(" ");
                for (int i = 0; i < arr.length; i++){
                    if(Integer.parseInt(arr[i])%2 == 0){
                        masss += + 0 + " ";
                    }else {
                        masss +=  arr[i] + " ";
                    }
                }
                stroka2[s] = masss;
                s++;
            }
        } catch (Exception ex) {
            System.out.println("Some Error" + ex);
        }

        Path path1 = Paths.get("src/com/pb/glushnyak/hw9/odd-numbers.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path1)) {
            for (int q = 0; q < stroka2.length; q++){
                writer.write(stroka2[q]);
                writer.newLine();
            }
        } catch (Exception e) {
            System.out.println("Some Error ");
        }

    }
}
