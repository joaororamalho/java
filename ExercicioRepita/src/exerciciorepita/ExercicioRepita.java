/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author theak
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, par = 0, impar = 0, acima100 = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: (valor 0 interrompe)</html>"));
            if (n > 100 && n != 0) {
                acima100++;
            }
            
            if (n % 2 == 0 && n != 0) {
                par++;
            } else if(n % 2 != 0 && n != 0) {
                impar++;
            }
            s +=n;
        } while (n != 0);
        int media = s / (par + impar);
        JOptionPane.showMessageDialog(null, "<html>Resultado: <br> Total de Valores: " + (par + impar) + "<br> Total de Pares: " + par + "<br> Total de impares: " + impar + "<br> Acima de 100: " + acima100 + "<br>Média dos valores: " + media + "</html>"); 
    }
    
}
