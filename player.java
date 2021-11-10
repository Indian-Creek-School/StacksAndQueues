import java.util.Stack;
public class player {
    private Stack<Character> path=new Stack<Character>();
    private int[] pos=new int[2];
    public void undo(){
        path.pop();
        setPos();
    }
    public int[] setPos(){
        if(path.peek()=='F'){
            pos[1]++;
        }else if(path.peek()=='U'){
            pos[0]++;
        }else if(path.peek()=='D'){
            pos[0]--;
        }
        return pos;
    }
}
