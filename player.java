import java.util.Stack;
public class player {
    public player(){}
    private Stack<Character> path=new Stack<Character>();
    private int[] pos=new int[2];
    public void undo(){
        path.pop();
        setPos(-1);
    }
    public int[] setPos(int d){
        if(path.peek()=='F'){
            pos[1]+=d;
        }else if(path.peek()=='U'){
            pos[0]+=d;
        }else if(path.peek()=='D'){
            pos[0]-=d;
        }
        return pos;
    }
    public char getPath(){
        return path.peek();
    }
    public int[] getPos(){
        return pos;
    }
}
