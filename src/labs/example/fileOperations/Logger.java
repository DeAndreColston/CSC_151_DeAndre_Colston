/*
@author: DeAndre Colston
@date: 04/12/2026
@purpose: Week 13 Lab
*/

package labs.example.fileOperations;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java. util.ArrayList;

public class Logger {

    public static void main(String[] args) {
        try {
            //re-opening the files like in part 1 of week 13's lab.
            
            BufferedReader reader = openErrorLog();

            getCountOfErrorTypes(reader);
            reader.close();
            reader = openErrorLog();
            getMemoryLimitExceededCount(reader);
            reader.close();

        } catch(IOException e) {
        System.out.println("An error occured: " + e.getMessage());
        }
    }

    public static BufferedReader openErrorLog() throws IOException {
        
        return new BufferedReader(new FileReader("api_error.log"));
    }

    public static void getCountOfErrorTypes(BufferedReader reader) throws IOException {
        int errorCount = 0, warnCount = 0, infoCount = 0, debugCount = 0;
        String line;
        //accounting for all the varying logged levels such as error, warn, etc.
        while ((line = reader.readLine()) != null) {
            if (line.contains("[ERROR]")) errorCount++;
            else if (line.contains("[WARN]")) warnCount++;
            else if (line.contains("[INFO]")) infoCount++;
            else if (line.contains("[DEBUG]")) debugCount++;
        }

        System.out.println("---Log Level Counts ---");
        System.out.println("Errors: " + errorCount);
        System.out.println("Warnings: " + warnCount);
        System.out.println("Info: " + infoCount);
        System.out.println("Debug: " + debugCount);
        System.out.println();
    }
    // Establishing an ArrayList that stores the endpoints to know the number of errors that are within the log file.
    public static void getMemoryLimitExceededCount(BufferedReader reader) throws IOException {
        ArrayList<String> endpoints = new ArrayList<>();
        String line;
        String targetMessage = "Memory Limit Exceeded";

        while ((line = reader.readLine()) != null) {
            if (line.contains(targetMessage)) {

                if (line.contains("Endpoint: ")) {
                String endpoint = line.split("Endpoint: ")[1].trim();
                endpoints.add(endpoint);
                }
            }
        }
        System.out.println("--- Memory Limit Exceeded Report ---");
        System.out.println("Total Occurences: " + endpoints.size());
        for (String ep : endpoints) {
        System.out.println("Occured on: " + ep);
        }
    }
}