package charstreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[]args) throws IOException {
        FileWriter myWriter = new FileWriter("filename.txt");
        Scanner s = new Scanner(System.in);
        String str1,response;

        while(true)
        {
            System.out.println("Enter text to be written -");
            str1 = s.nextLine();
            myWriter.write(str1);
            System.out.println("Want to add more?(y/n)");
            response = s.nextLine();
            if(response.equals("y"))
                continue;
            else {
                myWriter.close();
                break;
            }
        }
        FileReader fr = new FileReader("filename.txt");
        int i;

        while ((i = fr.read()) != -1)
            System.out.print((char)i);
    }

}
