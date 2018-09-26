

public class Tableros {
    char[][] tabla = new char[3][3];
    
    public Tableros(char espacio){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                this.tabla[i][j] = espacio;
            }
        }
    }

    public void Imprimir(){
        for (int i = 0; i < 3; i++) {
            System.out.print("-------\n|");
            for (int j = 0; j < 3; j++) {
                System.out.print(this.tabla[i][j]+"|");
            }
            System.out.println("");
        }
        System.out.println("-------");
    }
    
    public boolean Agregar(char x, int pos){
        int i = pos/3;
        int j = pos%3;
        
        if(this.tabla[i][j]==' '){
            this.tabla[i][j]=x;
            return true;
        }else{
            return false;
        }
    }
    
    public void ImprimirPosiciones(){
        System.out.println("-------\n|1|2|3|\n-------\n|4|5|6|\n-------\n|7|"
                + "8|9|\n-------");
    }
    
    public boolean tresEnLinea(char fich){
        
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                
                if(vertical(i,j,fich))
                    return true;
                
                if(horisontal(i,j,fich))
                    return true;
                
                if(diagonal(i,j,fich))
                    return true;
                
            }
        }
        return false;
    }
    
    private boolean vertical(int i, int j, char ficha){
        if(tabla[0][0]==ficha && tabla[0][1]==ficha && tabla[0][2]==ficha)
            return true;
        
        if(tabla[1][0]==ficha && tabla[1][1]==ficha && tabla[1][2]==ficha)
            return true;
        
        if(tabla[2][0] == ficha && tabla[2][1] == ficha && tabla[2][2] == ficha)
            return true;
        
        return false;
    }
    private boolean horisontal(int i, int j, char ficha){
        if(tabla[0][0]==ficha && tabla[1][0]==ficha && tabla[2][0]==ficha)
            return true;
        
        if(tabla[0][1]==ficha && tabla[1][1]==ficha && tabla[2][1]==ficha)
            return true;
        
        if(tabla[0][2] == ficha && tabla[1][2] == ficha && tabla[2][2] == ficha)
            return true;
        
        return false;
    }
    private boolean diagonal(int i, int j,char ficha){
        if(tabla[0][0]==ficha && tabla[1][1]==ficha && tabla[2][2]==ficha)
            return true;
        
        if(tabla[0][2]==ficha && tabla[1][1]==ficha && tabla[2][0]==ficha)
            return true;
        
        return false;
    }
}

/*0.0 - 0.1 - 0.2
  1.0 - 1.1 - 1.2
  2.0 - 2.1 - 2.2*/