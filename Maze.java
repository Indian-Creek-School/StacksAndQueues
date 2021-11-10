public class Maze {
    //1-10 value for a long or short maze
    private int length;
    private String[][] m;
    private int[][] winPath;
    private player p;
    private int[] start;
    private int[] end;
    public Maze(int l,player x){
        p=x;
        length=l;
        start[1]=0;
        start[0]=(int)Math.random()+(length+5);
        end[0]=(int)Math.random()+(length+5);
        end[1]=length+5;

        for(int i=0;i<10;i++){
            if(i==length){
                m=new String[length+5][length+5];
                winPath=new int[length+5][length+5];
            }
        }
        int count=0;
        for(int i=0;i<length+5;i++){
            for(int j=0;j<length+5;j++){
                if(count==0){
                    winPath[start[0]][0]=1;
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
