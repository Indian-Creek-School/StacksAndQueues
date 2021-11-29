import java.util.Stack;
public class Maze {
    /*
        To Do:
            Make the wining path non linear(meaning like make it not be a straight line and more jagged like a normal maze)
            Setup the randomizing of other walls in the maze
            Fix the borked legal move setting
            
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
        for(int i=0;i<length+1;i++){
            //leave this alone its fine that it has the line through it, it works
            //if you can't read it it says 'winSlope*i+start,' which is just the slope intersept form with start being the intersept because it is a random value on the y axis
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
