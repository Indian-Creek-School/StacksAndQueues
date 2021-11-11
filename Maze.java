import java.util.Stack;
public class Maze {
    //1-10 value for a long or short maze
    private int length;
    private double l2;
    private String[][] m;
    public Stack<Double[]> winPath=new Stack<Double[]>();;
    private player p;
    private Double[] start;
    private Double[] end;
    private double winSlope;
    private double winEq;
    public Maze(int l){
        length=l+5;
        l2=l+5;
        start[0]=Math.random()*(l2);
        start[1]=0.0;
        end[0]=Math.random()*(l2);
        end[1]=l2;
        for(int i=0;i<10;i++){
            if(i==length){
                m=new String[length][length];
            }
        }
        winSlope=(start[0]-end[0])/(start[1]-end[1]);
        for(double i=0;i<length;i++){
            Double[] z={(winSlope*i+start[0]),i};
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
