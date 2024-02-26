package orientacaoaobjetos;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        Data data = new Data();
        c1.dataAbertura = data;
        c1.titular = "Raul";
        c1.dataAbertura.ano = 2024;
        c1.dataAbertura.mes = 9;
        c1.dataAbertura.dia = 2;

        c1.saldo = 1000;

        System.out.println(c1.sacar(500));
        System.out.println(c1.recuperaDadosParaImpressao());

        System.out.println(c1.deposito(500));
        System.out.println(c1.deposito(700));
        System.out.println(c1.recuperaDadosParaImpressao());

        System.out.println(c1.calculaRendimento());


    }
}
