package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Salon;
import modelo.CasaEvento;

import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private CasaEvento casa;

    //------------------
    //Metodos
    //------------------

    //Constructor
    /**
     * @param pVenPrin
     * @param pEmpresa
     */
    public Controlador(VentanaPrincipal pVenPrin, CasaEvento pCasa)
    {
        this.venPrin = pVenPrin;
        this.casa = pCasa;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("App lista para usar... ");
    }

    public void actionPerformed(ActionEvent ae){

        

    }
}    

       
       
