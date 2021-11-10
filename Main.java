import java.util.Stack;
import java.util.Queue;
public class Main{
    public static void main(String args[]){
        Stack<Integer> st1=new Stack<Integer>();
        for(int i=1;i<=10;i++){
            st1.push(i);
        }
        for(int i=1;i<=10;i++){
            System.out.println(st1.pop());
        }        
        
    }
}