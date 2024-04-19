import java.util.Scanner;

public class Negative {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter a positive number: ");
            int a = s.nextInt();
            if(a<0) {
                System.out.println("Negative number!");
                break;
            }
        }

    }
}
