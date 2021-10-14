package nl.inholland;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        double start;
        double time = 0;
        double end;
        String string = "";
        StringBuffer sb = new StringBuffer("");
        StringBuilder stringBuilder = new StringBuilder("");

       // String
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            string += " I like Java";
        }
        end = System.currentTimeMillis();
        time = end - start;
        System.out.println("string: " + time);

        // String buffer
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append(" I like Java");
        }
        end = System.currentTimeMillis();
        time = end - start;
        System.out.println("string buffer: " + time);

        // String builder
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(" I like Java");
        }
        end = System.currentTimeMillis();
        time = end - start;
        System.out.println("stringbuilder: " + time);
    }
}
