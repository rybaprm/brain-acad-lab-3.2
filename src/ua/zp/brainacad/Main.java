package ua.zp.brainacad;

public class Main {
    /**
     * Class Main output to consol automatic transformations some types of variables
     */
    public static void main(String[] args) {
        //1. byte -> short -> int -> long
        byte byteVar = 127;
        System.out.println("1. byte -> short -> int -> long:\n" + byteVar + " -> " + (short) byteVar
                + " -> " + (int) (short) byteVar + " -> " + (long) (int) (short) byteVar + "\n");

        //2. int -> double
        int intVar = 10000;
        System.out.println("2. int -> double:\n" + intVar + " -> " + (double) intVar + "\n");

        //3. short -> float -> double
        short shortVar = 32_767;
        System.out.println("3. short -> float -> double:\n" + shortVar + " -> " + (float) shortVar
                + " -> " + (double) (float) shortVar + "\n");

        //4. char -> int
        char charVar = 65535;
        System.out.println("4. char ->int:\n" + charVar + " -> " + (int) charVar + "\n");
    }
}
