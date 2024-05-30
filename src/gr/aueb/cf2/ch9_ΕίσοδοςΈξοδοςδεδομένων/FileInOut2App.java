package gr.aueb.cf.ch9_ΕίσοδοςΈξοδοςδεδομένων;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOut2App {
    public static void main(String[] args) {
        File inFd = new File("C:/tmp/file.txt");
        File outFd = new File("C:/tmp/fileout.txt");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(inFd)){
            PrintStream pw = new PrintStream(outFd, StandardCharsets.UTF_8);
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split(" +");

                for (String token : tokens){
                    pw.printf("%s ", token);
                    pw.flush();
                }
                pw.println();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
