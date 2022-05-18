/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package calculadora;

/**
 *
 * @author RIHS
 */
public class Calculadora {

   

    private double valorA;
    private double valorB;

    /**
     * Construtor sem argumento.
     */
    public Calculadora() {
        this(0.0, 0.0);
    }

    /**
     * Construtor com argumento.
     *
     * @param valorA Um valor real.
     * @param valorB Um valor real.
     */
    public Calculadora(double valorA, double valorB) {
        setValorA(valorA);
        setValorB(valorB);
    }

    public double getValorA() {
        return valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    /**
     * Realiza a adição.
     *
     * @return Um valor real.
     */
    public double getAdicao() {
        return (getValorA() + getValorB());
    }

    /**
     * Realiza a subtração
     *
     * @return Um valor real.
     */
    public double getSubtracao() {
        return (getValorA() - getValorB());
    }

    /**
     * Realiza o produto.
     *
     * @return Um valor real.
     */
    public double getProduto() {
        return (getValorA() * getValorB());
    }

    /**
     * Realiza a divisão.
     *
     * @return Um valor real.
     */
    public double getDivisao() {
        return (getValorA() / getValorB());
    }
}
