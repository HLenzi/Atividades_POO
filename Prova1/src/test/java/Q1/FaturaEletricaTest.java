/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Q1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hhlenzi
 */
public class FaturaEletricaTest {
    
    @Test
    public void testCalculoFaturaResidencialSemTaxa(){
         FaturaEletrica fatura = new FaturaEletrica("Maria Joaquina", Consumidor.RESIDENCIAL, 190);
         double resultado = fatura.calcularFatura();
         
         assertEquals(95, resultado);
    }
    
    @Test
    public void testCalculoFaturaResidencialComTaxa(){
         FaturaEletrica fatura = new FaturaEletrica("Homer Simpson", Consumidor.RESIDENCIAL, 300);
         double resultado = fatura.calcularFatura();
         
         assertEquals(175, resultado);
    }
    
    @Test
    public void testCalculoFaturaComercialSemTaxa(){
         FaturaEletrica fatura = new FaturaEletrica("Ichiraku Ramen", Consumidor.COMERCIAL, 700);
         double resultado = fatura.calcularFatura();
         
         assertEquals(525, resultado);
    }
    
    @Test
    public void testCalculoFaturaComercialComTaxa(){
         FaturaEletrica fatura = new FaturaEletrica("Aquaberry", Consumidor.COMERCIAL, 1000);
         double resultado = fatura.calcularFatura();
         
         assertEquals(800, resultado);
    }
    
    @Test
    public void testCalculoFaturaIndustrial(){
         FaturaEletrica fatura = new FaturaEletrica("KaibaCorp", Consumidor.INDUSTRIAL, 3000);
         double resultado = fatura.calcularFatura();
         
         assertEquals(2550, resultado);
    }
}
