/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Juegos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objetoIn= new Scanner(System.in);
    int nElementos=Integer.parseInt(JOptionPane.showInputDialog("Cuantos datos quiere ordenar?"));
    int vector[]=new int[nElementos];
    int aux;
    for(int i=0;i<nElementos;i++){    
    System.out.println("Ingrese el dato "+(i+1));
    vector[i]=objetoIn.nextInt();
    }
    // algoritmo burbuja:
        for (int  i = 0;  i < (nElementos-1);  i++) {
            for (int  j = 0;  j <(nElementos-1);  j++) {
                if(vector[j]>vector[j+1]){
                 aux=vector[j];
                 vector[j]=vector[j+1];
                 vector[j+1]=aux;
                }
            }
        }
        for (int  i = 0;  i <nElementos;  i++) {
            System.out.print(" "+vector[i]);
        } 
    }
    
}
