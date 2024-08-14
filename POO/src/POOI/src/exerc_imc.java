package POOI.src;

import javax.swing.*;
import java.util.ArrayList;

public class exerc_imc {
    public static void main(String[] args) {
        ArrayList<Pessoa> imc = new ArrayList<>();
        int op = 0;

        while (op != 3) {
            op = menu();
            switch (op) {
                case 1:
                    cadastraPessoa(imc);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, listaTodos(imc));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }

    public static int menu() {
        String m = "1- Cadastrar\n"
                + "2- Listar todos\n"
                + "3- Sair\n";
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }

    public static void cadastraPessoa(ArrayList<Pessoa> imc) {
        Pessoa p = new Pessoa();
        p.nome = JOptionPane.showInputDialog("Nome:");
        p.sexo = JOptionPane.showInputDialog("Sexo (M/F):");
        p.peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
        p.altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
        imc.add(p);
    }

    public static double calculaIM(Pessoa p) {
        return p.peso / (p.altura * p.altura);
    }

    public static String avalia(Pessoa p) {
        double imc = calculaIM(p);
        if (p.sexo.equals("M")) {
            if (imc < 18.5) return "Abaixo do Peso";
            if (imc >= 18.5 && imc < 25) return "Peso Normal";
            if (imc >= 25 && imc < 30) return "Sobrepeso";
            if (imc >= 30 && imc < 35) return "Obesidade Grau I";
            if (imc >= 35 && imc < 40) return "Obesidade Grau II (severa)";
            return "Obesidade Grau III (mórbida)";
        } else {
            if (imc < 19.1) return "Abaixo do Peso";
            if (imc >= 19.1 && imc < 20.7) return "Peso Normal";
            if (imc >= 20.7 && imc < 26.5) return "Sobrepeso";
            if (imc >= 26.5 && imc < 30) return "Obesidade Grau I";
            if (imc >= 30 && imc < 35) return "Obesidade Grau II (severa)";
            return "Obesidade Grau III (mórbida)";
        }
    }

    public static String listaTodos(ArrayList<Pessoa> p) {
        StringBuilder sb = new StringBuilder();
        for (Pessoa pessoa : p) {
            sb.append(pessoa.nome)
                    .append(" - ")
                    .append(pessoa.sexo)
                    .append(" - ")
                    .append(pessoa.peso)
                    .append(" - ")
                    .append(pessoa.altura)
                    .append(" - ")
                    .append(calculaIM(pessoa))
                    .append(" - ")
                    .append(avalia(pessoa))
                    .append("\n");
        }
        return sb.toString();
    }
}
