import java.util.*;
public class Auth {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String user = "Achint";
        String pass = "1234";
        String username = s.next();
        String password = s.next();
        if(user.equals(username) && pass.equals(password))
            System.out.println("Pass");
        else
            System.out.println("Fails");

    }

}
