package domain;

public class Avion extends Pieza {
   protected String cargaMaxima; 

    public Avion(String nombre,String identificador, String sistema, String material,String cargaMaxima) {
        super(nombre,identificador, sistema, material);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public String toString() {
        return this.imprimir() + "\n\tcargaMaximaAvion: " + cargaMaxima + " kg" ;
    }

        
}
