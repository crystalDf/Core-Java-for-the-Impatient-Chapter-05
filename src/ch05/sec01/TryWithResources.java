package ch05.sec01;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
    }
}
