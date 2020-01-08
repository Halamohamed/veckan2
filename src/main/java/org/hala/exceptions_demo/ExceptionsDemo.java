package org.hala.exceptions_demo;

import java.util.concurrent.ThreadLocalRandom;

public class ExceptionsDemo {
    public static void main(String[] args) {
        double number = 0;
        try {
            number = getInt();
            //System.out.println(RuntimeException.class);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(number);
    }

    public static int getInt() throws RuntimeException {
        boolean exception = ThreadLocalRandom.current().nextBoolean();
        if(exception) throw new RuntimeException("Unlucky!;");
        return 3;
    }
}
