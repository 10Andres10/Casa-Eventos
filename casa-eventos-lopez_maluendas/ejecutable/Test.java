package ejecutable;

import controlador.Controlador;
import modelo.*;
import vista.*;

public class Test {

    public static void main(String[] args) {

        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        CasaEvento miCasaEvento = new CasaEvento();
        Controlador miControlador = new Controlador(miVentanaPrincipal, miCasaEvento);        
    }
    
}
