package ch05.sec01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();

        try (PrintWriter out = new PrintWriter("output.txt")) {
            for (String line : lines) {
                out.println(line.toLowerCase());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner in = new Scanner(Paths.get("words"));
             PrintWriter out = new PrintWriter("output.text")) {
            while (in.hasNext()) {
                out.println(in.next().toLowerCase());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            throw new IOException();
        } catch (IOException e) {
            Throwable[] secondaryException = e.getSuppressed();
        }
    }
}
