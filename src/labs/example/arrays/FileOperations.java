/*
@author: DeAndre Colston
@date: 03/27/2026
@purpose: Week 11 Lab
*/

import java.io.*;
import java.util.Arrays;

public class FileOperations {
    public static void main(String[] args) {
        
        String csvFile = "src/labs/example/fileOperations/files/users.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            
            br.readLine(); 

            while ((line = br.readLine()) != null) {
                
                String[] studentData = line.split(cvsSplitBy);
                
                String name = studentData[0];
                double math = Double.parseDouble(studentData[1]);
                double science = Double.parseDouble(studentData[2]);
                double english = Double.parseDouble(studentData[3]);

                double average = (math + science + english) / 3;

                System.out.printf("Student: %s | Average: %.2f%n", name, average);
            }
        } catch (IOException e) {
            
            logError(e.getMessage());
        }
    }

    private static void logError(String message) {
        File logFile = new File("src/labs/example/fileOperations/logs/csv_error.log");
        try (PrintWriter out = new PrintWriter(new FileWriter(logFile, true))) {
            out.println("Error occurred: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}