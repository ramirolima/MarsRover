public class Plateu{

    private int bottonCoordx;
    private int bottonCoordy;
    private int topCoordx;
    private int topCoordy;

    public Plateu(int topCoordx, int topCoordy){
        bottonCoordx = 0;
        bottonCoordy = 0;
        this.topCoordx = topCoordx;
        this.topCoordy = topCoordy;
    }

    public int getTopCoordx(){return topCoordx;}

    public int getTopCoordy(){return topCoordy;}
}