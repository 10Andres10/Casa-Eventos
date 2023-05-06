package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btCrearSalon;
    
  

    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);



        //Crear y agregar boton AgregarVendedor
        btCrearSalon = new JButton("Crear Salón");
        btCrearSalon.setBounds(10,20,170,20);
        btCrearSalon.setActionCommand("CrearSalon");
        this.add(btCrearSalon);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btCrearSalon.addActionListener(pAL);
    }
}