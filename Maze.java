public class Maze {
    //1-10 value for a long or short maze
    private int length;
    private String[][] m;
    private player p;
    public Maze(int l,player x){
        p=x;
        length=l;
        for(int i=0;i<10;i++){
            if(i==length){
                m=new String[length+5][length+5];
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
