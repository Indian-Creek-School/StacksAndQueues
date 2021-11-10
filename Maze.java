import java.util.Stack;
public class Maze {
    //1-10 value for a long or short maze
    private int length;
    private String[][] m;
    private Stack<Integer[]> winPath=new Stack<Integer[]>();;
    private player p;
    private Integer[] start;
    private Integer[] end;
    public Maze(int l,player x){
        p=x;
        length=l+5;
        start[1]=0;
        start[0]=(int)Math.random()*(length);
        end[0]=(int)Math.random()*(length);
        end[1]=length;

        for(int i=0;i<10;i++){
            if(i==length){
                m=new String[length][length];
            }
        }
        int count=0;
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(count==0){
                    winPath.add(start);
                }else{
                   
                }
            }
            count++;
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
