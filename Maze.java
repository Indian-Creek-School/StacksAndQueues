import java.util.Stack;
public class Maze {
    //1-10 value for a long or short maze
    public int length;
    private double l2;
    private String[][] m;
    public Stack<Double[]> winPath=new Stack<Double[]>();;
    private player p;
    public Double[] start;
    public Double[] end;
    private Double winSlope;
    private Double winEq;
    public Maze(int l){
        length=l+5;
        l2=l+5;
        start=new Double[2];
        end=new Double[2];
        start[0]=Math.random()*(l2);
        start[1]=0.0;
        end[0]=Math.random()*(l2);
        end[1]=l2;
        for(int i=0;i<10;i++){
            if(i==length){
                m=new String[length][length];
            }
        }
        winSlope=(end[0]-start[0])/(end[1]-start[1]);
        //this loop condition is bizzare and weird but don't touch it
        // this sets up the innitial linear line between start and end
        for(int i=0;i<length+1;i++){
            Double[] z=new Double[]{(winSlope*i+start[0]),(double)i};
            winPath.add(z);//hi\
        }
    }
    // for testing purposes only
    //plan for printing this:
    //  
    public void printWinPath(){
        for(int i=0;i<length+1;i++){
            
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
