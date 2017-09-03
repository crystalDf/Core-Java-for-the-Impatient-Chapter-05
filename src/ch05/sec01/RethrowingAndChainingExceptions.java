package ch05.sec01;

import com.oracle.tools.packager.Log;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RethrowingAndChainingExceptions {

    public static void main(String[] args) throws IOException {

        read("words");
    }

    public static void read(String filename) throws IOException {

        try {
            Scanner in = new Scanner(Paths.get(filename));
        } catch (Exception e) {
            Log.debug(e);
            throw e;
        }
    }
}
