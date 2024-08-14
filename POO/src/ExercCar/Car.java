package ExercCar;

@Test

public class Car {

    String marca;
    int ano;
    String cor;

    boolean cadastra(String m, int a, String c) {
        if(m.isEmpty())
            return false;
        if( a<1980 || a >2025)
            return false;
        if(c.isEmpty())
            return false;
        marca = m.toUpperCase();
        ano = a;
        cor = c.toUpperCase();
        return true;
    }

    boolean isPeriodo(int anoIn, int anoFin) {
        return ano >= anoIn && ano <= anoFin;
    }

    boolean isCor(String c) {
        return cor.equals(c.toUpperCase());
    }

    boolean isMarca(String m) {
        return marca.equals(m.toUpperCase());
    }

    String mostraCarro() {
        return "Marca:" + marca +
                " Ano:" + ano +
                " Cor:" + cor+"\n";
    }

}