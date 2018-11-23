package week3.exercise1.Reflection;

import java.util.Scanner;

public class NumberMirrorApplication {

    public static void main(String a[]){
        NumberMirror nr = new NumberMirror();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a few numbers, please.");
        int originalNumbers = scanner.nextInt();
        System.out.println("Original numbers: " + originalNumbers);
        System.out.println("Reversed numbers: "+nr.reverseNumber(originalNumbers));
        System.out.println("Numbers by the specialMirror: "+nr.specialMirror(originalNumbers));
    }
}
