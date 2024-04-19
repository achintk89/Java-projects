public class HelloWorld implements A{
    public String getName(){
        return "name";
    }
    public static void main (String[] args){
        HelloWorld t = new HelloWorld();
        System.out.println(t.getName());
    }
}