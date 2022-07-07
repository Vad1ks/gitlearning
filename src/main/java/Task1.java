public class Task1 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i+=20) {
            System.out.println("|decimal: " + i + " | Hexadecimal: " + Integer.toHexString(i));
        }
    }
}
