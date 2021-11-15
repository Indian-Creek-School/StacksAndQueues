import java.util.Stack;
public class Maze {
    /*
        To Do:
            Make the wining path non linear
            Setup the randomizing of other walls in the maze
            Fix the borked legal move setting
            fix the win path again because I changed them back to ints
    */

    //1-10 value for a long or short maze
    public Integer length;
    private String[][] m;
    public Stack<Integer[]> winPath=new Stack<Integer[]>();;
    private player p;
    public double[] start;
    public double[] end;
    private double winSlope;
    private Integer winEq;
    public Maze(int l){
        length=l+25;
        start=new double[2];
        end=new double[2];
        start[0]=((Math.random())*length+1);
        start[1]=0;
        end[0]=((Math.random())*length+1);
        end[1]=length;
        for(int i=0;i<10;i++){
            if(i==length){
                m=new String[length][length];
            }
        }
        winSlope=(end[0]-start[0])/(end[1]-start[1]);
        //this loop condition is bizzare and weird but don't touch it
        // this sets up the innitial linear line between start and end
        for(int i=0;i<length+1;i++){
            Integer[] z=new Integer[]{(new Integer((int)(winSlope*i+start[0]))),i};
            winPath.add(z);
        }
    }
    public boolean legalMove(){
        if(m[p.setPosForCheck(1)[0]][p.setPosForCheck(1)[1]].equals(" ")){
            p.setPos(1);
            return true;
        }
        return false;
    }
    
}
