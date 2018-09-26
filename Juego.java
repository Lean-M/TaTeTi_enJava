
import java.util.Scanner;

public class Juego {
    Scanner scan = new Scanner(System.in);
   
    public void jugar(){
      //se piden los nombles a los jugadores
        System.out.println("nombre del jugador 1");
        String nom_1 = scan.nextLine();
        System.out.println("nombre del jugador 2");
        String nom_2 = scan.nextLine();
        
      //se crean los jugadores (con los respectivos nombres) y el tablero
        Jugador jugador_1 = new Jugador('X', nom_1);
        Jugador jugador_2 = new Jugador('O', nom_2);
        Tableros tablero = new Tableros(' ');
        
        boolean noHayGanador;
        int turno = 1;
        
        tablero.ImprimirPosiciones();
        tablero.Imprimir();
        do{
            if (turno%2 != 0){
              //jugador 1
                /*uso los metodos como puertas, si el metodo no se puede
                ejecutar devueleve false y no hace nada
                haci aumento el contador si todo sale bien*/
                
                if(jugador_1.juega(tablero,turno)){
                    tablero.Imprimir();
                    turno++;
                }else{
                    System.out.println("posicion invalida");
                }
                
            }else{
              //jugador 2
                
                if(jugador_2.juega(tablero,turno)){
                    tablero.Imprimir();
                    turno++;
                }else{
                    System.out.println("posicion invalida");
                }
            }
            
            if(jugador_1.Ganador(tablero)){
                System.out.println(jugador_1.getNombre()+" gano");
                noHayGanador = false;
            }else{
                if(jugador_2.Ganador(tablero)){
                    System.out.println(jugador_2.getNombre()+" gano");
                    noHayGanador = false;
                }else{
                    noHayGanador = true;
                }
            }
            
        }while(turno <= 9 && noHayGanador);
    
        if(noHayGanador==true)
            System.out.println("Empate,los dos ganan o los dos pierden :-D");
    
    }
   
    
}
