import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String msg = scanner.nextLine().toLowerCase();
        char[] copyMsg = msg.toCharArray();

        for (int i = 0; i<copyMsg.length; i++){
            switch (copyMsg[i]) {
                case 'a' -> copyMsg[i] = '+';
                case 'b' -> copyMsg[i] = '-';
                case 'c' -> copyMsg[i] = '*';
                case 'ç' -> copyMsg[i] = '.';
                case 'd' -> copyMsg[i] = '/';
                case 'e' -> copyMsg[i] = '\'';
                case 'f' -> copyMsg[i] = '\"';
                case 'g' -> copyMsg[i] = ')';
                case 'h' -> copyMsg[i] = '[';
                case 'i' -> copyMsg[i] = '{';
                case 'ı' -> copyMsg[i] = '=';
                case 'j' -> copyMsg[i] = ':';
                case 'k' -> copyMsg[i] = '#';
                case 'l' -> copyMsg[i] = '?';
                case 'm' -> copyMsg[i] = '%';
                case 'n' -> copyMsg[i] = '}';
                case 'o' -> copyMsg[i] = '$';
                case 'ö' -> copyMsg[i] = '^';
                case 'p' -> copyMsg[i] = '<';
                case 'q' -> copyMsg[i] = '~';
                case 'r' -> copyMsg[i] = ';';
                case 's' -> copyMsg[i] = '&';
                case 't' -> copyMsg[i] = '|';
                case 'u' -> copyMsg[i] = '€';
                case 'v' -> copyMsg[i] = '¥';
                case 'w' -> copyMsg[i] = '(';
                case 'x' -> copyMsg[i] = '¿';
                case 'y' -> copyMsg[i] = '>';
                case 'z' -> copyMsg[i] = ']';
                default -> copyMsg[i] = ' '; // for spaces between words
            }
        }
        System.out.println("YOUR ENCRYPTED MESSAGE IS: ");
        System.out.println(copyMsg);
    }
}