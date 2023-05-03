import java.util.Scanner;
public class Decrypt {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your code: ");
        String msg = scanner.nextLine();
        char[] copyMsg2 = msg.toCharArray();

        for (int i = 0; i<copyMsg2.length; i++){
            switch (copyMsg2[i]) {
                case '+' -> copyMsg2[i] = 'a';
                case '-' -> copyMsg2[i] = 'b';
                case '*' -> copyMsg2[i] = 'c';
                case '.' -> copyMsg2[i] = 'ç';
                case '/' -> copyMsg2[i] = 'd';
                case '\'' -> copyMsg2[i] = 'e';
                case '\"' -> copyMsg2[i] = 'f';
                case ')' -> copyMsg2[i] = 'g';
                case '[' -> copyMsg2[i] = 'h';
                case '{' -> copyMsg2[i] = 'i';
                case '=' -> copyMsg2[i] = 'ı';
                case ':' -> copyMsg2[i] = 'j';
                case '#' -> copyMsg2[i] = 'k';
                case '?' -> copyMsg2[i] = 'l';
                case '%' -> copyMsg2[i] = 'm';
                case '}' -> copyMsg2[i] = 'n';
                case '$' -> copyMsg2[i] = 'o';
                case '^' -> copyMsg2[i] = 'ö';
                case '<' -> copyMsg2[i] = 'p';
                case '~' -> copyMsg2[i] = 'q';
                case ';' -> copyMsg2[i] = 'r';
                case '&' -> copyMsg2[i] = 's';
                case '|' -> copyMsg2[i] = 't';
                case '€' -> copyMsg2[i] = 'u';
                case '¥' -> copyMsg2[i] = 'v';
                case '(' -> copyMsg2[i] = 'w';
                case '¿' -> copyMsg2[i] = 'x';
                case '>' -> copyMsg2[i] = 'y';
                case ']' -> copyMsg2[i] = 'z';
                default -> copyMsg2[i] = ' '; // for spaces between words
            }
        }
        System.out.println("YOUR DECRYPTED MESSAGE IS: ");
        System.out.println(copyMsg2);
    }
}