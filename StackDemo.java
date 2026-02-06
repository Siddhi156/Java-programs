import java.util.Stack;

class StackDemo{
  public static void main(String args[])
{
 Stack <Integer> st = new Stack<>();

  st.push(20);
  st.push(40);
  st.push(90);

  System.out.println("Stack : " + st);
  System.out.println("Popped element : " + st.pop());
  System.out.println("Stack after pop : " + st);
  }
}