import java.util.Stack;
import java.util.Queue;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Maze m1=new Maze(5);
        Stack<Integer> st1=new Stack<Integer>();
        for(int i=1;i<=10;i++){
            st1.push(i);
        }
        for(int i=1;i<=11;i++){
            System.out.println(Arrays.toString(m1.winPath.pop()));
        }
        System.out.println("::::::");
        System.out.println(Arrays.toString(m1.start));
        System.out.println(Arrays.toString(m1.end));
    }
}