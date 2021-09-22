package domain;

public class Pieza {
    protected String nombre;
    protected String identificador;
    protected String sistema;
    protected String material;

    public Pieza(String nombre,String identificador, String sistema, String material) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.sistema = sistema;
        this.material = material;
    }

    
    public String imprimir() {
        return "\tPieza "+nombre+ " - Identificador: " + identificador + "\n\tsistema: " + sistema + "\n\tmaterial: " + material;
    }
    
    
}
