package br.com.caelum.contas.modelo;

public class SeguroDeVida implements Tributavel {
    private double valor;
    private String titular;
    private int numeroApolice;
    private double taxa = 42;

//    public SeguroDeVida(double valor, String titular, int numeroApolice) {
//        this.valor = valor;
//        this.titular = titular;
//        this.numeroApolice = numeroApolice;
//    }

    public String getTipo() {
        return "Seguro de vida";
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double getValorImposto() {
        return taxa + valor * 0.02;
    }
}
