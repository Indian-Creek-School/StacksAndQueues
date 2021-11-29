import java.util.Stack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JPanel implements ActionListener{

    private JFormattedTextField text = new JFormattedTextField();
    private JButton undo = new JButton();
    private Stack<String> words = new Stack<String>();

    public static void main(String args[]){
        // Maze m1=new Maze(10);
        Main m = new Main();
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1080,1000));
        frame.setLayout(new GridLayout(0,2));
        frame.setContentPane(m);
        frame.setVisible(true);

        m.undo.setPreferredSize(new Dimension(100,100));
        m.undo.addActionListener(m);
        m.undo.setActionCommand("undo");
        m.undo.setText("Undo");
        frame.add(m.undo);

        m.text.setPreferredSize(new Dimension(500,500));
        m.text.addActionListener(m);
        m.text.setActionCommand("text");
        frame.add(m.text);
        m.words.push(" ");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("text")){
            words.push(text.getText());
        } else if(e.getActionCommand().equals("undo")){
            words.pop();
            this.text.setText(words.peek());
            
            // System.out.println("test");
        }
    }
}

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

                /*
            To Do:
                Setup a GUI
                Make sure that I can make the maze character move as an animation
                setup the walls as GUI elements
                maybe make a start and stop button or something
                
        */