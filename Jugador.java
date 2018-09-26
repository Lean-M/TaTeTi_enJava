
import java.util.Scanner;

public class Jugador {
    Scanner scan = new Scanner(System.in);
    String nombre;
    char ficha;
    
    
    public Jugador(char ficha, String nombre){
        this.ficha = ficha;
        this.nombre = nombre;
    }
    
    public boolean juega(Tableros tab, int turno){
        int posicion;
        System.out.println("turno: "+turno+"\n"
                +this.nombre+" ingresa una pociocion");
        posicion = scan.nextInt();
        
        if (posicion<=9 && posicion>0 && tab.Agregar(ficha, posicion-1)){
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean Ganador(Tableros tabla){
        if(tabla.tresEnLinea(this.ficha)){
            return true;
        }else{
            return false;
        }
        
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
