/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Q1;

/**
 *
 * @author hhlenzi
 */
public class FaturaEletrica {

    private String titular;
    private Consumidor consumidor;
    private int kWhMes;

    public String getTitular() {
        return titular;
    }
    
    /**
     * Metodo setter do atributo titular
     * @param titular 
     */
    public void setTitular(String titular) {
        if (titular.trim() .isEmpty()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.titular = titular;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    /**
     * Metodo setter do atributo consumidor
     * @param consumidor 
     */
    public void setConsumidor(Consumidor consumidor) {
            if (consumidor == null){
        throw new IllegalArgumentException("Tipo de comsumidor nao encontrado!");
        }
        this.consumidor = consumidor;
    }

    public int getkWhMes() {
        return kWhMes;
    }

    /**
     * Metodo setter do atributo kWhMes
     * @param kWhMes 
     */
    public void setkWhMes(int kWhMes) {
        if (kWhMes <= 0){
            throw new IllegalArgumentException("Consumo invalido");
        }
        this.kWhMes = kWhMes;
    }
    
    /**
     * Construtor da classe FaturaEletrica
     * @param titular
     * @param consumidor
     * @param kWhMes 
     */
    public FaturaEletrica(String titular, Consumidor consumidor, int kWhMes){
        setTitular(titular);
        setConsumidor(consumidor);
        setkWhMes(kWhMes);
    }
    
    /**
     * Metodo para calcular a Fatura
     * @return 
     */
    public double calcularFatura(){
        double fatura = 0;
        
        switch (consumidor){
        case RESIDENCIAL:
        if (kWhMes > 200){
            kWhMes -= 200;
            fatura = kWhMes * 0.75 + 200 * 0.5;
        } else {
            fatura = kWhMes * 0.50;
        }
        break;
        case COMERCIAL:
            if (kWhMes > 800){
            kWhMes -= 800;
            fatura = kWhMes + 800 * 0.75;
        } else {
            fatura = kWhMes * 0.75;
        }
        break;
        case INDUSTRIAL:
            fatura = kWhMes * 0.85;
        break;
        }
        
        return fatura;
    }
    
    
    
}
