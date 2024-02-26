package orientacaoaobjetos;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;

    double qtdDepositadaMensal;
    Data dataAbertura;


    boolean sacar(double quantia) {
        if (this.saldo >= quantia) {
            this.saldo -= quantia;
            return true;
        }
        return false;
    }

    boolean deposito(double quantia) {
        if (quantia <= 0) return false;
        this.saldo += quantia;
        this.qtdDepositadaMensal += quantia;
        return true;
    }

    double calculaRendimento() {
        return this.saldo * 0.1;
    }

    String recuperaDadosParaImpressao() {
        return "\nTitular: " + titular +
                "\nNúmero: " + numero +
                "\nSaldo: " + saldo +
                "\nAno: " + dataAbertura.ano +
                "\nMês: " + dataAbertura.mes +
                "\nDia: " + dataAbertura.dia;
    }
}
