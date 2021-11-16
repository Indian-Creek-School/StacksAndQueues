    import java.util.Stack;
    import java.util.Arrays;
    import javax.swing.*;
    import java.awt.*;

public class Main{
        /*
            To Do:
                Setup a GUI
                Make sure that I can make the maze character move
                setup the walls as GUI elements
                
        */
    public static void main(String args[]){
        Maze m1=new Maze(10);
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);
        frame.setVisible(true);
        JButton b1=new JButton("1");    
        JButton b2=new JButton("2");    
        JButton b3=new JButton("3");    
        JButton b4=new JButton("4");    
        JButton b5=new JButton("5");    
        JButton b6=new JButton("6");    
        JButton b7=new JButton("7");    
        JButton b8=new JButton("8");    
        JButton b9=new JButton("9");
        frame.add(b1); frame.add(b2); frame.add(b3);  
        frame.add(b4); frame.add(b5); frame.add(b6);  
        frame.add(b7); frame.add(b8); frame.add(b9); 
        frame.setLayout(new GridLayout(m1.length,m1.length));
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
        System.out.println(m1.length);
    }
}