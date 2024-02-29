package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exceptions.SaldoInsuficienteException;

import java.util.Objects;

public abstract class Conta implements Comparable<Conta>{

    private String titular;
    private static int idConta;
    private int numero;
    private String agencia;
    private double saldo;
    private double calculaRendimento;
    private Data dataAbertura;

    public Conta() {
        super();
        criarIdConta();
    }

    public Conta(String titular) {
        this.titular = titular;
        criarIdConta();
    }

    private static void criarIdConta() {
        idConta++;
    }


    /**
     * Metodo que incrementa o saldo
     *
     * @param quantia
     * @return
     */
    public void saca(double quantia) {
        if (this.saldo >= quantia) {
            this.saldo -= quantia;
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente, " + "Tente um valor menor.");
        }
    }

    /**
     * Metodo que faz o deposito
     *
     * @param quantia a ser depositada
     * @return se deu certo o deposito
     */
    public void deposito(double quantia) {
        if (quantia < 0) {
            throw new SaldoInsuficienteException("Quantia inválida, " + "Tente um valor positivo.");
        } else {
            this.saldo += quantia;
        }
    }

    public boolean transfere(double quantia, Conta destinatario) {
        destinatario.deposito(quantia);
        this.saca(quantia);
        return true;
    }

    public abstract String getTipo();

    public String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: R$" + this.saldo;
        dados += "\nTipo: " + this.getTipo();
        return dados;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, agencia);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        Conta outraConta = (Conta) obj;

        return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
    }

    @Override
    public String toString() {
        return "[titular=" + titular.toUpperCase() + ", Saldo = " + saldo + ", numero=" + numero + ", agencia=" + agencia + "]";
    }

    @Override
    public int compareTo(Conta outraConta) {
        return this.titular.compareTo(outraConta.titular);
    }

    public static int getIdConta() {
        return idConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRendimento() {
        return this.saldo * 0.1;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
