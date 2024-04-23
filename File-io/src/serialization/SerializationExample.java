package serialization;

import java.io.*;

public class SerializationExample {

    public static void serializeObject(Object object) {
        try(OutputStream outputStream = new FileOutputStream("Employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)){
            objectOutputStream.writeObject(object);
        }
        catch (IOException ex){
            System.err.println(ex);
        }

    }

    public static Object deSerializeObject(String filename){
        try(InputStream inputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            return objectInputStream.readObject();
        }
        catch (Exception ex){
            throw new RuntimeException(ex.getMessage());
        }
    }

    public static void main(String[] args) {

        Employee employee = new Employee(2456,"Achint","achintk89@gmail.com",1500);
        System.out.println("Before Serialization");
        System.out.println(employee);
        serializeObject(employee);

//        employee = (Employee) deSerializeObject("Employee.ser");
//        System.out.println("After Serialization");
//        System.out.println(employee);

    }
}