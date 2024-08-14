package Exercicios_Metodos;

import java.util.ArrayList;

public class ManipulaCarro {
    ArrayList<Carro> carros = new ArrayList<Carro>();

    void incluiCarro(String marca, int ano, String cor) {
        Carro c = new Carro();
        if(c.cadastra(marca, ano, cor)) {
            carros.add(c);
        }
    }

    String buscaPorMarca(String m) {
        String ret = "";
        int cont = 0;
        for(Carro c : carros) {
            if(c.isMarca(m)) {
                ret += c.mostraCarro();
                cont ++;
            }
        }
        ret += "\nPercentual: "+(cont/carros.size()*100)+"%";
        return ret;
    }

    String buscaPorCor(String cor) {
        String ret = "";
        int cont = 0;
        for(Carro c : carros) {
            if(c.isCor(cor)) {
                ret += c.mostraCarro();
                cont ++;
            }
        }
        ret += "\nPercentual: "+(cont/carros.size()*100)+"%";
        return ret;
    }

    String buscaPorPeriodo(int ano1, int ano2) {
        String ret = "";
        int cont = 0;
        for(Carro c : carros) {
            if(c.isPeriodo(ano1, ano2)) {
                ret += c.mostraCarro();
                cont ++;
            }
        }
        ret += "\nPercentual: "+(cont/carros.size()*100)+"%";
        return ret;
    }
}
