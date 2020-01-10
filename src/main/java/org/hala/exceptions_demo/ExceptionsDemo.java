package org.hala.exceptions_demo;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ExceptionsDemo {
    private static List<String> importantData;
    static {
        try {
            importantData = Reader.read("foo.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Terminating...");
            System.exit(0);
        }
    }
    public static void main(String[] args) {

        for (String s: importantData){
            System.out.println(s);
        }


       /* double number = 0;
        try {
            number = getInt();
            //System.out.println(RuntimeException.class);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(number);
        */

    }

    public static int getInt() throws RuntimeException {
        boolean exception = ThreadLocalRandom.current().nextBoolean();
        if(exception) throw new RuntimeException("Unlucky!;");
        return 3;
    }
}
