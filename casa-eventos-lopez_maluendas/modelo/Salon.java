package modelo;

import java.util.ArrayList;

public class Salon {    

    //----------------------
    // Constantes
    //----------------------
    public final static double COSTO_BASE = 150000;
    
    //----------------------
    // Atributos
    //----------------------    
    private int meseros;
    private int numeroPersonas;
    private String nombreSalon;
    private double precioSalon;
    

    //----------------------
    // Métodos
    //----------------------
    public Salon(int pmeseros, int pnumeroPersonas, String pnombreSalon, double ppreciosalon){
        
        this.meseros = pmeseros;
        this.numeroPersonas = pnumeroPersonas; 
        this.nombreSalon = pnombreSalon;
        this.precioSalon = ppreciosalon;

    }

    public double calcularPrecioSalon(){
        if (getNumeroPersonas() > 50){

            precioSalon = COSTO_BASE + (COSTO_BASE * 0.4);           

        }
        else{

            precioSalon = COSTO_BASE + (COSTO_BASE * 0.2);
        
        }

        return precioSalon;
    }

    public int CalcularCantidadMeseros(){
        if(getNumeroPersonas()>100){
            meseros = 3;
        }
        else{
            if(getNumeroPersonas()<=100 && getNumeroPersonas() >= 50){
                meseros = 2;
            }
            else{
                meseros = 1;
            }
        }
        
        return meseros;
    }

   
   

    //----------------------
    // Getters
    //----------------------
    public int getMeseros() {
        return meseros;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public String getNombreSalon() {
        return nombreSalon;
    }

    //----------------------
    // Setters
    //----------------------
    public void setMeseros(int meseros) {
        this.meseros = meseros;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public void setNombreSalon(String nombreSalon) {
        this.nombreSalon = nombreSalon;
    }

    public static void add(Salon sal) {
    }

    

}
