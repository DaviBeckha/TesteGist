package Pessoas;

public class primitivo_Referencia {
    public static void main(String[] args) {
        People people = new People();
        people.nome = "Joao";
        people.idade = 5;
        testeReferencia(people);
        System.out.println(people.nome + "-" + people.idade);

        int numero = 10;
        testePrimitovo(numero);
        System.out.println(numero);



    }
    static void testePrimitovo (int x) {
        x =  x * 2;
        System.out.println(x);
    }

    static void testeReferencia (People p) {
        p.nome = "zzzz";
        p.idade = 5000;
        System.out.println(p.nome+ "-"+ p.idade);
    }
}
