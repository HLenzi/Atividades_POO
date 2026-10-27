/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ex1;

/**
 *
 * @author hhlenzi
 */
public class Funcionario {

    private String nome;
    private double salario;

    private static final double FAIXA_1_LIMITE_SUP = 1903.98;
    private static final double FAIXA_2_LIMITE_SUP = 2826.65;
    private static final double FAIXA_3_LIMITE_SUP = 3751.05;
    private static final double FAIXA_4_LIMITE_SUP = 4664.68;
    private static final double ALIQUOTA_FAIXA_2 = 0.075;
    private static final double ALIQUOTA_FAIXA_3 = 0.15;
    private static final double ALIQUOTA_FAIXA_4 = 0.225;
    private static final double ALIQUOTA_FAIXA_5 = 0.275;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }

    public double calcylarIrpf(double salario) {
        FaixaIrpf faixa = identificarFaixaIrpf();
        
        switch (faixa){
            case Segunda:
                return salario * ALIQUOTA_FAIXA_2;
            case Terceira:
                return salario * ALIQUOTA_FAIXA_3;
            case Quarta:
                return salario * ALIQUOTA_FAIXA_4;
            case Quinta:
                return salario * ALIQUOTA_FAIXA_5;
            default:
                return 0;
        }       
    }

    public FaixaIrpf identificarFaixaIrpf() {
        if (salario <= FAIXA_1_LIMITE_SUP) {
            return FaixaIrpf.Primeira;
        } else if (salario <= FAIXA_2_LIMITE_SUP) {
            return FaixaIrpf.Segunda;
        } else if (salario <= FAIXA_3_LIMITE_SUP) {
            return FaixaIrpf.Terceira;
        } else if (salario <= FAIXA_4_LIMITE_SUP) {
            return FaixaIrpf.Quarta;
        } else {
            return FaixaIrpf.Quinta;
        }
    }
}
