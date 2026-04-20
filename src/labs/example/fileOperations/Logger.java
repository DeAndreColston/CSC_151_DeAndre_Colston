/*
@author: DeAndre Colston
@date: 04/19/2026
@purpose: Week 14 Lab
*/

package labs.example.fileOperations;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Logger {

    public static void main(String[] args) {
    try {
        Logger logger = new Logger();
        BufferedReader reader;
        // Part 2: I had to look at this a couple times to understand
            // that we are basically opening different log files for each task
        reader = openErrorLog();
        logger.getDiskSpaceErrorsWithIPAddress(reader);
        reader.close();

        
        reader = logger.openErrorLog("http_access.log");
        logger.getGMTOffset(reader);
        reader.close();
        
        System.out.println("Starting HTTP log processing...");
        reader = logger.openErrorLog("http_access.log");
        logger.getHTTPCodes(reader);
        reader.close();

        reader = logger.openErrorLog("http_access.log");
        logger.getResponseSizes(reader);
        reader.close();

        reader = logger.openErrorLog("http_access.log");
        logger.groupHTTPMethodsAndEndPoints(reader);
        reader.close();

    } catch (IOException e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}

    
    public static BufferedReader openErrorLog() throws IOException {
        return new BufferedReader(new FileReader("api_error.log"));
    }

    
    public BufferedReader openErrorLog(String fileName) throws IOException {
            return new BufferedReader(new FileReader(fileName));
    }

    // Part 1: Disk Space Errors with IP Address
    private void getDiskSpaceErrorsWithIPAddress(BufferedReader reader) throws IOException {
        String line;
        int lineNum = 0;

        while ((line = reader.readLine()) != null) {
            lineNum++;

            if (line.toLowerCase().contains("disk space error")) {
                String ip = line.split(" ")[0];
                System.out.println("Disk space error on line " + lineNum + " for IP Address: " + ip);
            }
        }
        System.out.println();
    }

    // 3. GMT Offset Counts
    private void getGMTOffset(BufferedReader reader) throws IOException {
        ArrayList<String> offsets = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
            int start = line.indexOf("+");
            if (start != -1 && start + 5 <= line.length()) {
                offsets.add(line.substring(start, start + 5));
            }
        }

        System.out.println("--- GMT Offset Report ---");

        Set<String> uniqueOffsets = new HashSet<>(offsets);

        for (String offset : uniqueOffsets) {
            System.out.println(offset + ": " + Collections.frequency(offsets, offset));
        }

        System.out.println();
    }

    // Part 4: HTTPS Count
    private void getHTTPCodes(BufferedReader reader) throws IOException {
    int c2 = 0, c3 = 0, c4 = 0, c5 = 0;
    String line;

    System.out.println("Reading http_access.log...");

    while ((line = reader.readLine()) != null) {

        String[] parts = line.split(" ");

        if (parts.length > 8) {
            String code = parts[8];

            if (code.startsWith("2")) c2++;
            else if (code.startsWith("3")) c3++;
            else if (code.startsWith("4")) c4++;
            else if (code.startsWith("5")) c5++;
        }
    }

    System.out.println("5xx Errors: " + c5);
    System.out.println("2xx Errors: " + c2);
    System.out.println("3xx Errors: " + c3);
    System.out.println("4xx Errors: " + c4);
}

    // Part 5: Responsive Size
    private void getResponseSizes(BufferedReader reader) throws IOException {
        int count = 0;
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");

            if (parts.length > 9) {
                try {
                    int size = Integer.parseInt(parts[9]);
                    if (size > 3900) count++;
                } catch (NumberFormatException e) {
                }
            }
        }

        System.out.println("Lines with response size > 3900: " + count);
        System.out.println();
    }

    // Part 6: HTTP Methods and End Points
    private void groupHTTPMethodsAndEndPoints(BufferedReader reader) throws IOException {
        ArrayList<String> verbs = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
            if (line.contains("\"")) {
                String request = line.split("\"")[1];
                String verb = request.split(" ")[0];

                if (!verbs.contains(verb) && verb.matches("[A-Z]+")) {
                    verbs.add(verb);
                }
            }
        }

        System.out.println("Unique HTTP Verbs:");
        for (String v : verbs) {
            System.out.println(v);
        }

        System.out.println();
    }
}