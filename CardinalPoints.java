public class CardinalPoints{

    private String letters[] ;

    public CardinalPoints(){ letters = new String[]{"N","E","S","W"};}

    public String getLetter(int index){return letters[index];}
    
    public int getIndex(String letter){
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i].equals(letter))
                return i;
        }

        return -1;
    }
}