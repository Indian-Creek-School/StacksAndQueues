public class Maze {
    //1-10 value for a long or short maze
    private int length;
    private String[][] m;
    private String[][] winPath;
    private player p;
    private int[] start;
    private int[] end;
    public Maze(int l,player x){
        p=x;
        length=l;
        start[1]=(int)Math.random()+(length+5);
        start[0]=(int)Math.random()+(length+5);
        end[0]=(int)Math.random()+(length+5);
        end[1]=(int)Math.random()+(length+5);

        for(int i=0;i<10;i++){
            if(i==length){
                m=new String[length+5][length+5];
                winPath=new String[length+5][length+5];
            }
        }
        for(int i=0;i<end[0];i++){
            for(int j=0;j<end[1];j++){
                winPath[i][j]="f";
            }
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
