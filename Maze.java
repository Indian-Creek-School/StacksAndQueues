public class Maze {
    //1-10 value for a long or short maze
    private int length;
    private String[][] m;
    private player p;
    public Maze(int l){
        length=l;
        for(int i=0;i<10;i++){
            if(i==length){
                m=new String[length+5][length+5];
            }
        }
    }
    public boolean legalMove(int[] xy){
        if(m[xy[0][xy[1]].equals(" ")){
            return true;
        }
        return false;
    }
    
}
