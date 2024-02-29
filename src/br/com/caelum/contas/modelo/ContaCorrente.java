package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
    private double taxa = 0.10;

    public void saca(double quantia) {
        super.saca(quantia + taxa);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Conta){
            if (this.getTitular() == ((Conta) obj).getTitular() && this.getNumero() == ((Conta) obj).getNumero()){
                return true;
            }
        }
        return false;
    }

    public String getTipo() {
        return "Conta Corrente";
    }

    @Override
    public double getValorImposto() {
        return getSaldo() * 0.01;
    }
}
