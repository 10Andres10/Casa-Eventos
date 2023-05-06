package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbPersonas;
    private JTextField tfNumeroPersonas;
    
    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta empleados
        lbPersonas = new JLabel("Numero De Personas: ", JLabel.RIGHT);
        lbPersonas.setBounds(0,90,100,20);
        this.add(lbPersonas);

        // Creación de la caja de texto para la cantidad de empleados
        tfNumeroPersonas = new JTextField();
        tfNumeroPersonas.setBounds(150, 50, 25, 100);
        this.add(tfNumeroPersonas);     

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso
    
}
