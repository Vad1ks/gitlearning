import java.util.Scanner;

public class Task2 {
    public static String getEncryptedStr(String source) {
        StringBuilder charBox = new StringBuilder();
        for (int i = 0; i < source.length() - 1; i += 2) {
            charBox.append(source.charAt(i + 1));
            charBox.append(source.charAt(i));
        }
        return charBox.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input any string to encrypt:");
        String s = in.nextLine();
        String encrypted = getEncryptedStr(s);
        System.out.println("Encrypted string: " + encrypted);
        System.out.println("Decrypted string: " + getEncryptedStr(encrypted));
    }
}
