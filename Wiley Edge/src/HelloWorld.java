
public class HelloWorld
{
    public static void main(String[] args)

    {
        printNums(12);
    }

    public static void printNums(int number)
    {
        String s1="welcome";
        String s2=new String("welcome");
        if(s1==s2)
            System.out.println("same");
        else
            System.out.println("not same");
    }

}