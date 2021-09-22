package domain;

public class Helicoptero extends Pieza {
    protected String cantidadRotores;

    public Helicoptero(String nombre,String identificador, String sistema, String material, String cantidadRotores) {
        super(nombre,identificador, sistema, material);
        this.cantidadRotores = cantidadRotores;
    }

    @Override
    public String toString() {
        return this.imprimir() + "\n\tcantidadRotores: " + cantidadRotores;
    }
    
    
}
