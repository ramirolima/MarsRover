public class Rover{

    private String name;
    private int coordx;
    private int coordy;
    private int currentLetter;

    public Rover(String name, int coordx, int coordy,int currentLetter){
        this.name = name;
        this.coordx = coordx;
        this.coordy = coordy;
        this.currentLetter = currentLetter;
    }

    public String getName(){return this.name;}
    public int getCoordx(){return this.coordx;}
    public int getCoordy(){return this.coordy;}
    public int getCurrentLetter(){return this.currentLetter;}
    
    public void left(){
        if (currentLetter == 0)
            currentLetter = 3;
        else
            currentLetter--;
    }
    public void right(){
        if (currentLetter == 3)
            currentLetter = 0;
        else
            currentLetter++;
    }
    public void move( int steps){
        if(currentLetter == 0)
            coordy+= steps;
         else if(currentLetter == 1)
            coordx+= steps;
         else if(currentLetter == 2)
            coordy-= steps;
         else if(currentLetter == 3)
            coordx-= steps;
    }
}