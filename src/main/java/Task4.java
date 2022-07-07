import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    static Scanner scan;
    public static boolean is_hexadecimal(String arg){
        Pattern pattern = Pattern.compile("[0-9a-fA-F]+$");
        Matcher matcher = pattern.matcher(arg);
        return matcher.matches();
    }

    public static int hex_to_decimal(String hex){
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++)
        {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
    public static void main(String[] args) {
        int decimal;
        System.out.println("The amount of arguments is " + args.length);
        for (String arg : args) {
            if (is_hexadecimal(arg)) {
                decimal = hex_to_decimal(arg);
                System.out.println("Hexadecimal number: " + arg + "; Binary equivalent: " + Integer. toBinaryString(decimal));
            }
            else{
                System.out.println("Other argument: " + arg);
            }
        }
    }
}
