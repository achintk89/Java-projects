package randomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomAccessFileUser {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("output.txt", "rw")) {
            Scanner s = new Scanner(System.in);
            boolean loop = true;
            do{
            System.out.println("1.Enter text to write :");
            System.out.println("2.Read contents of file :");
            System.out.println("3.Exit :");
            System.out.println("Enter your choice :");
            int ch = s.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter the data: ");
                    String data = s.next()+s.nextLine();
                    file.writeUTF(data);
                    System.out.println("Data added successfully to the file......");
                    break;
                case 2:
                    file.seek(0);
                    String res;
                    long currentPos;
                    long length = file.length();
                    while((currentPos = file.getFilePointer()) < length)
                    {
                        res = file.readUTF();
                        System.out.println(res);
                    }
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid Input");
            }}while(loop);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
