package hw10.services;

public class StringService {

    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void printSting(String str){
        System.out.print(str);
    }
}
