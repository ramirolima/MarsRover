import java.util.Scanner;

public class App {
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);
        String temp;        

        System.out.println("Digite a coordenada superior do Plateu:");
        String[] auxPlateu = input.nextLine().split(" ");
        int topCoordx = Integer.parseInt(auxPlateu[0]);        
        int topCoordy = Integer.parseInt(auxPlateu[1]);

        Plateu p = new Plateu(topCoordx,topCoordy);
        CardinalPoints c = new CardinalPoints();
        StringBuilder sb = new StringBuilder();

        boolean controle = false;
        int cont = 1;
        while(!controle)
        {
            input = new Scanner(System.in);

            System.out.println("Digite a posição inicial do Rover"+cont+":");
            String aux = input.nextLine();
            String[] auxPos = aux.split(" ");
            Rover r = new Rover("Rover"+cont,Integer.parseInt(auxPos[0]),Integer.parseInt(auxPos[1]),c.getIndex(auxPos[2]));

            System.out.println("Digite a sequência de comandos:");
            char[] comands = input.nextLine().toCharArray();

            for(int i=0; i<comands.length;i++)
            {
                switch (comands[i])
                {
                    case 'L':
                    r.left();
                    break;
                    case 'R':
                    r.right();
                    break;
                    case 'M':
                    r.move(1);
                    break;
                }
            }            

            sb.append("\n");
            sb.append(Integer.toString(r.getCoordx())+" "+Integer.toString(r.getCoordy())+ " ");
            sb.append(c.getLetter(r.getCurrentLetter()));
            sb.append("\n");

            System.out.println("Digite: (1)Inserir novo Rover (2)Calcular saída");
            if(input.nextInt() == 2)
                controle = true;

            cont++;
        }

        System.out.println(sb.toString());


    }
}