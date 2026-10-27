/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista4.Ex2;
import javax.swing.JOptionPane;
/**
 *
 * @author hhlenzi
 */
public class AppQuestao2Ui {
    public static void main(String[] args) {
        int altura;
        int comprimento;
        Retangulo retangulo = new Retangulo();
        
        altura = Integer.parseInt(JOptionPane.showInputDialog("Altura: "));
        
        comprimento = Integer.parseInt(JOptionPane.showInputDialog("Comprimento: "));
        
        retangulo.setAltura(altura);
        retangulo.setComprimento(comprimento);
        
        int perimetro = retangulo.calcularPerimetro();
        int area = retangulo.calcularArea();
        
        JOptionPane.showMessageDialog(null, "Perimetro: "+perimetro+"\n Area: "+area);
    }
}
