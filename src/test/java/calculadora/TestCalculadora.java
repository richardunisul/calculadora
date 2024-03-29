/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author RIHS
 */
public class TestCalculadora {
    
  @Test
    public void testGetAdicao() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getAdicao();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
    
  @Test
    public void testGetSubtracao() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 2.0;
        double retornoFeito = calculadora.getSubtracao();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

      @Test
    public void testGetProduto() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 8.0;
        double retornoFeito = calculadora.getProduto();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

      @Test
    public void testGetDivisao() {
        Calculadora calculadora = new Calculadora(6.0, 2.0);
        double retornoEsperado = 3.0;
        double retornoFeito = calculadora.getDivisao();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }    
}
