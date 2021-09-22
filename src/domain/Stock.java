package domain;

import java.util.Scanner;
import java.util.Vector;

public class Stock {
    
    static Vector almacen = new Vector();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stockArray[];
        do{
        String stocks = sc.nextLine();
        stockArray = stocks.split("&");
        switch(stockArray[0]){
            case "1":
                agregarPieza(stockArray);
            break;
                
            case "2":
                System.out.println("***Stock de motores***");
                listarPiezas();
            break;  
            
        }
        }while(!stockArray[0].equals("3"));      
    }
    
    public static void agregarPieza(String array1[]){
        if(array1[1].equals("Avion")){
            Avion avion1 = new Avion(array1[1],array1[2],array1[3],array1[4],array1[5]);
            almacen.add(avion1);
        }else if(array1[1].equals("Helicoptero")){
            Helicoptero helicoptero1 = new Helicoptero(array1[1],array1[2],array1[3],array1[4],array1[5]);
            almacen.add(helicoptero1);
        }
    }
    
    public static void listarPiezas(){
        for (int i = 0; i < almacen.size(); i++) {
            System.out.println(almacen.elementAt(i));
        }
    }
  
    
}
