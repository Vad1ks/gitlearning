import java.util.regex.*;
public class Task3 {
    public static boolean is_decimal(String arg){
        Pattern pattern = Pattern.compile("^['\\-''+'0-9]*[.,][0-9]+$");
        Matcher matcher = pattern.matcher(arg);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String type;
        for (String arg : args) {
            if (is_decimal(arg)) {
                type = "Decimal";
            }
            else{
                type = "String";
            }
            System.out.println("Argument: " + arg + "; Type: " + type);
        }
    }
}
