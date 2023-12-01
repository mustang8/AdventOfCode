package de.hatice.day01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day01 {
    public static void main(String[] args) {
        ArrayList<String> totalDigits = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Data1.txt"))) {
            String line = br.readLine();

            while (line != null) {
                ArrayList<String> allDigits = new ArrayList<>();
                for (char character : line.toCharArray()) {
                    if (Character.isDigit(character)) {
                        allDigits.add(String.valueOf(character));
                    }
                }
                String calibrationLine = allDigits.get(0) + allDigits.get(allDigits.size() - 1);
                totalDigits.add(calibrationLine);
                line = br.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int total = 0;
        for (String totalDigit : totalDigits) {
            total += Integer.parseInt(totalDigit);
        }
        System.out.println(total);
    }
}
