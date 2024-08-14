package Exercicios_Metodos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManipulaCarroTest {

    ManipulaCarro mc = new ManipulaCarro();

    @BeforeEach
    void setUp() throws Exception {
        mc.carros.clear();
    }

    @Test
    void incluiCarro() {
        mc.incluiCarro("Fiat", 2018, "A");
        mc.incluiCarro("Ford", 2018, "B");
        mc.incluiCarro("Toyota", 2018, "C");
        assertEquals(3, mc.carros.size());
        assertEquals("FORD", mc.carros.get(1).marca);
    }
    @Test
    void incluiCarroErrado() {
        mc.incluiCarro("Fiat", 2018, "A");
        mc.incluiCarro("Ford", 0, "B");
        mc.incluiCarro("", 2018, "C");
        mc.incluiCarro("Ford", 2018, "");
        assertEquals(1, mc.carros.size());
    }
    @Test
    void BuscaPorMarca() {
        mc.incluiCarro("Fiat", 2018, "A");
        mc.incluiCarro("Ford", 2018, "B");
        mc.incluiCarro("Toyota", 2018, "C");
        mc.incluiCarro("Fiat", 2020, "B");
        mc.incluiCarro("Fiat", 2021, "C");
        mc.incluiCarro("Ford", 2018, "B");
        mc.incluiCarro("Ford", 2018, "B");
        mc.incluiCarro("Ford", 2018, "B");
        mc.incluiCarro("Ford", 2018, "B");
        mc.incluiCarro("Ford", 2018, "B");
        String ret = mc.buscaPorMarca("FIAT");
        assertEquals("Marca:FIAT Ano:2018 Cor:A\n"
                + "Marca:FIAT Ano:2020 Cor:B\n"
                + "Marca:FIAT Ano:2021 Cor:C\n"
                + "\n"
                + "Percentual: 30.0%", ret);

    }

    @Test
    void BuscaPorPeriodo() {
        mc.incluiCarro("Fiat", 2010, "A");
        mc.incluiCarro("Ford", 2011, "B");
        mc.incluiCarro("Toyota", 2012, "C");
        mc.incluiCarro("Fiat", 2013, "B");
        mc.incluiCarro("Fiat", 2014, "C");
        mc.incluiCarro("Ford", 2015, "B");
        mc.incluiCarro("Ford", 2016, "B");
        mc.incluiCarro("Ford", 2017, "B");
        mc.incluiCarro("Ford", 2018, "B");
        mc.incluiCarro("Ford", 2019, "B");
        String ret = mc.buscaPorPeriodo(2013, 2015);
        assertEquals("Marca:FIAT Ano:2013 Cor:B\n"
                + "Marca:FIAT Ano:2014 Cor:C\n"
                + "Marca:FORD Ano:2015 Cor:B\n"
                + "\n"
                + "Percentual: 30.0%", ret);

    }
    @Test
    void BuscaPorCor() {
        mc.incluiCarro("Fiat", 2010, "A");
        mc.incluiCarro("Ford", 2011, "A");
        mc.incluiCarro("Toyota", 2012, "a");
        mc.incluiCarro("Fiat", 2013, "a");
        mc.incluiCarro("Fiat", 2014, "a");
        mc.incluiCarro("Ford", 2015, "a");
        mc.incluiCarro("Ford", 2016, "b");
        mc.incluiCarro("Ford", 2017, "a");
        mc.incluiCarro("Ford", 2018, "a");
        mc.incluiCarro("Ford", 2019, "a");
        String ret = mc.buscaPorCor("B");
        assertEquals("Marca:FORD Ano:2016 Cor:B\n"
                + "\n"
                + "Percentual: 10.0%", ret);

    }
}