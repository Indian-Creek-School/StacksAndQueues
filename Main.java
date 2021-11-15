import java.util.Stack;
import java.util.Arrays;
import javax.swing.*;

public class Main{
    /*
        To Do:
            Setup a GUI
            Make sure that I can make the maze character move
            make sure the maze is imported promperly
    */
    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1920,1080);
       frame.setVisible(true);
        Maze m1=new Maze(10);
        Stack<Integer> st1=new Stack<Integer>();
        for(int i=1;i<=10;i++){
            st1.push(i);
        }
        for(int i=0;i<m1.length+1;i++){
            System.out.println(Arrays.toString(m1.winPath.pop()));
        }
        System.out.println("::::::");
        System.out.println(Arrays.toString(m1.start));
        System.out.println(Arrays.toString(m1.end));
    }
}