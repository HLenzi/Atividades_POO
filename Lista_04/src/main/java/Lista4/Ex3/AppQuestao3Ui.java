/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista4.Ex3;
import Lista4.Ex2.Retangulo;
import javax.swing.JOptionPane;
/**
 *
 * @author hhlenzi
 */
public class AppQuestao3Ui {
    public static void main(String[] args) {
        int altura;
        int comprimento;
        
        altura = Integer.parseInt(JOptionPane.showInputDialog("Altura: "));
        
        comprimento = Integer.parseInt(JOptionPane.showInputDialog("Comprimento: "));
        
        Retangulo retangulo = new Retangulo(altura, comprimento);
        
        int perimetro = retangulo.calcularPerimetro();
        int area = retangulo.calcularArea();
        
        JOptionPane.showMessageDialog(null, "Perimetro: "+perimetro+"\n Area: "+area);
    }
}
