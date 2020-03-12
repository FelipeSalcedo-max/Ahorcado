
package ahorcado3;

import static ahorcado3.ahorcadoo.tabla;
import static ahorcado3.ahorcadoo.txt1;
import static ahorcado3.ahorcadoo.txt2;
import static ahorcado3.ahorcadoo.repetir;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class botones 
{
     public static int contador=0;

    public static void ingresar()
    {
         
        String Palabra=txt1.getText();
        int longitud = Palabra.length();
        System.out.println("longitud palabra" + longitud);
        for(int i = 0 ; i < longitud ;i++)
        {
            System.out.println("caracter" + Palabra.charAt(i));
        }
        int cols = longitud;
        int rows = 2;
        tabla.setModel(new DefaultTableModel(rows, cols));
        
        for(int c = 0; c < cols; c++)
        {
            tabla.setValueAt("-", 0, c);
        }
        
    }
    
      public static void probar()
    {
       
        String Palabra2 = txt1.getText();
        
        int longitud2 = Palabra2.length();
        char  Validar;
        char Letra = 0;
        
        String Validar2 = txt2.getText();
        Validar = Validar2.charAt(0);
                 
        for(int x = 0 ; x < longitud2 ;x++)
                
        {
             Letra= Palabra2.charAt(x);
    
              if ( Letra == Validar)
                {                      
                    contador--;
                    tabla.setValueAt(""+Palabra2.charAt(x), 0, x);                                       
                }
        }   
        
        if (Letra!=longitud2)
          {
             contador++;
             System.out.println("Intentos restantes"+(contador));
          }
        if (contador==9)
          {
            txt1.setVisible(false);
            txt2.setVisible(false);
            Component rootPane = null;
            JOptionPane.showMessageDialog(rootPane, "Fin de los intentos");
          }
         Component rootPane = null;
        JOptionPane.showMessageDialog(rootPane, "Fin De La Partida");
        repetir.setVisible(true);
    }
      
}
            

