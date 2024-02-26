package br.com.caelum.contas.modelo;

public class Conta {

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

    private static void criarIdConta(){
        idConta++;
    }


    /**
     * Metodo que incrementa o saldo
     * @param quantia
     * @return
     */
    public boolean sacar(double quantia) {
        if (this.saldo >= quantia) {
            this.saldo -= quantia;
            return true;
        }
        return false;
    }

    /**
     * Metodo que faz o deposito
     * @param quantia a ser depositada
     * @return se deu certo o deposito
     */
    public boolean deposito(double quantia) {
        if (quantia <= 0) return false;
        this.saldo += quantia;
        return true;
    }

    public String recuperaDadosParaImpressao() {
        return "\nTitular: " + this.titular +
                "\nIdentificador: " +  idConta+
                "\nSaldo: " + this.saldo +
                "\nAno: " + dataAbertura.ano +
                "\nMês: " + dataAbertura.mes +
                "\nDia: " + dataAbertura.dia;
    }

    public String getTitular() {
        return titular;
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
