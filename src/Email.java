import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email id: ");
        String email = sc.nextLine();
        Pattern ptr=Pattern.compile("^([a-zA-Z]|[0-9]|[.+_-])+@[a-zA-Z0-9.-]+[.][a-zA-Z]+$");
        Matcher match=ptr.matcher(email);
        boolean check=match.find();
        if(check)
            System.out.println("Valid Email !");
        else
            System.out.println("Invalid Email !!!");

    }
}