package ds.stack;


public class StackExample {


    public static void main(String[] args) {

//        java.util.Stack<Integer> stack = new java.util.Stack<>();
//        System.out.println(stack.push(1));

        Stack<Integer> myStack = new Stack<Integer>(2);
        myStack.push(3);
        myStack.push(5);



        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }


    }

}