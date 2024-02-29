package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class RepositorDeContas {
    public static void salva(List contas){
        try {
            PrintStream ps = new PrintStream("contas.txt");
            for (Object elem : contas){
            if (elem instanceof Conta){
                ps.println(((Conta) elem).getTipo() + "," + ((Conta) elem).getNumero() + "," + ((Conta) elem).getAgencia() + "," + ((Conta) elem).getTitular() + "," + ((Conta) elem).getSaldo());
            }
            }
            ps.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Conta> carrega(){
        List<Conta> listaContas = new ArrayList<>();
        Conta conta;
        try {
            Scanner n = new Scanner(new File("contas.txt"));
            while (n.hasNextLine()){
                String linha = n.nextLine();
                String[] valores = linha.split(",");
                String tipo = valores[0];
                if (tipo.equals("Conta Corrente")){
                    conta = new ContaCorrente();
                }else {
                    conta = new ContaPoupanca();
                }
                conta.setNumero(Integer.parseInt(valores[1]));
                conta.setAgencia(valores[2]);
                conta.setTitular(valores[3]);
                conta.deposito(Double.parseDouble(valores[4]));
                listaContas.add(conta);
            }
            n.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return listaContas;
    }

}
