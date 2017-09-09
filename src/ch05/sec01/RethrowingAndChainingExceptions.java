package ch05.sec01;


import java.io.IOException;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.Scanner;

public class RethrowingAndChainingExceptions {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        read("words");

        try {
            throw new SQLException();
        } catch (SQLException e) {
            Throwable throwable = new ClassNotFoundException();
            System.out.println(e.getCause());
            System.out.println(throwable.initCause(e));
            throw (ClassNotFoundException) throwable;
        }
    }

    public static void read(String filename) throws IOException {

        try {
            Scanner in = new Scanner(Paths.get(filename));
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
}
