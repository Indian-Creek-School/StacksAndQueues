    import java.util.Stack;
    import java.util.Arrays;
    import javax.swing.*;
    import java.awt.*;

public class Main{
        /*
            To Do:
                Setup a GUI
                Make sure that I can make the maze character move as an animation
                setup the walls as GUI elements
                maybe make a start and stop button or something
                
        */
    public static void main(String args[]){
        // Maze m1=new Maze(10);
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);
        frame.setVisible(true);
        //frame.setLayout(new GridLayout(m1.length,m1.length));
        //     Stack<Integer> st1=new Stack<Integer>();
        //     for(int i=1;i<=10;i++){
        //         st1.push(i);
        //     }
        //     for(int i=0;i<m1.length+1;i++){
        //         System.out.println(Arrays.toString(m1.winPath.pop()));
        //     }
        // System.out.println("::::::");
        // System.out.println(Arrays.toString(m1.start));
        // System.out.println(Arrays.toString(m1.end));
        // System.out.println(m1.length);
    }
}