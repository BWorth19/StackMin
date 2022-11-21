import java.util.*;
class StackMin {
    Stack<Integer> s;
    int minEle;
 
    // Constructor
    StackMin() { 
    	s = new Stack<Integer>(); 
    }
 
    // Prints minimum element of MyStack
    void Min()
    {
        // Get the minimum number in the entire stack
        if (s.isEmpty())
            System.out.println("Stack is empty");
 
        // variable minEle stores the minimum element
        // in the stack.
        else
            System.out.println("Minimum Element in the "
                               + " stack is: " + minEle);
    }
 
    void pop()
    {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
 
        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();
 
        // Minimum will change as the minimum element
        // of the stack is being removed.
        if (t < minEle) {
            System.out.println(minEle);
            minEle = 2 * minEle - t;
        }
 
        else
            System.out.println(t);
    }
 
    // Insert new number into MyStack
    void push(Integer x)
    {
        if (s.isEmpty()) {
            minEle = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }
 
        // If new number is less than original minEle
        if (x < minEle) {
            s.push(2 * x - minEle);
            minEle = x;
        }
 
        else
            s.push(x);
 
        System.out.println("Number Inserted: " + x);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        StackMin s = new StackMin();
       
          // Function calls
        s.push(3);
        s.push(5);
        s.Min();
        s.push(2);
        s.push(1);
        s.Min();
        s.pop();
        s.Min();
        s.pop();
    }
}