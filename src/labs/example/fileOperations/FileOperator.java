/*
@author: DeAndre Colston
@date: 04/05/2026
@purpose: Week 11 Lab
*/

package labs.example.fileOperations;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;
import java.util.Arrays;
//Week 11-12: Lab

public class FileOperator {
    
        //defining the variables for the paths the files take
        private static final String FILE_PATH = "src\\labs\\example\\fileOperations\\files";
        private static final String FILE_NAME = FILE_PATH + "files\\users.csv";
        private static final String ERROR_LOGGER_FILE = FILE_PATH + "logs\\csv_error.log";

        public static void main(String args[]) {
            openCSVFile();
        }
        
        private static void openCSVFile(){
            
            File logFile = new File(ERROR_LOGGER_FILE);
            File csvFile = new File(FILE_NAME);
            //Establishing the log file to ensure that it processes information.
            try {
        if (logFile.createNewFile()) {
        System.out.println("Success! csv_error.log has been created.");
        } else {
        System.out.println("The file already exists, so I didn't create a new one.");
        }
        } catch (IOException e) {
        System.out.println("I couldn't create the file. Check if the 'logs' folder exists!");
        e.printStackTrace();
        }
        //making sure the CSV file can compile all the information from the students grades 
        //to their averages and print their names
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null) {
                
                String[] studentGrade = line.split(",");
                
                String name = studentGrade[0];
                int math = Integer.parseInt(studentGrade[1]);
                int science = Integer.parseInt(studentGrade[2]);
                int english = Integer.parseInt(studentGrade[3]);

                double average = (math + science + english) / 3.0;

                System.out.printf("Student: %s | Average: %.2f%n", name, average);
            }
        } 
        
        catch (IOException e) {
            
            logError("missing CSV file! " + e.getMessage());
        } catch (NumberFormatException e) {
            logError("Data Error: Could not find grade. " + e.getMessage());
        }
    }
    //catching any errors that may have existed.
    private static void logError(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        File logFile = new File("src/labs/example/fileOperations/logs/csv_error.log");
        
        try (PrintWriter out = new PrintWriter(new FileWriter(logFile, true))) {
            out.println("Error occurred: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
