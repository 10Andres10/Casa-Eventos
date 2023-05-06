package modelo;

import java.util.ArrayList;

public class CasaEvento {
    //atributos
   private ArrayList salones;

   //metodo 
   public CasaEvento(){

        salones = new ArrayList();
    
    }   

    public void agregarSalon(Salon sal)
    {

        Salon.add(sal);

    }
}

