package com.elis.triangulos;

import com.elis.triangulos.Triangulos;
import com.elis.triangulos.TrianguloTipo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author elisangela
 */
public class TrianguloTest {

    @Test
    public void testIsoceles1Valido() throws Exception {
        final TrianguloTipo tipo = Triangulos.validaTriangulo(3, 2, 2);

        assertEquals(TrianguloTipo.ISOSCELES, tipo);

    }

    @Test
    public void testIsoceles2Valido() throws Exception {
        final TrianguloTipo tipo = Triangulos.validaTriangulo(2, 2, 3);

        assertEquals(TrianguloTipo.ISOSCELES, tipo);

    }

    @Test
    public void testIsoceles3Valido() throws Exception {
        final TrianguloTipo tipo = Triangulos.validaTriangulo(3, 2, 2);

        assertEquals(TrianguloTipo.ISOSCELES, tipo);

    }

    @Test
    public void testEscalenoValido() throws Exception {
        final TrianguloTipo tipo = Triangulos.validaTriangulo(2, 4, 2);

        assertEquals(TrianguloTipo.ESCALENO, tipo);

    }

    @Test
    public void testEquilateroValido() throws Exception {
        final TrianguloTipo tipo = Triangulos.validaTriangulo(2, 2, 2);

        assertEquals(TrianguloTipo.EQUILATERO, tipo);

    }

    @Test
    public void testUmValorZero() throws Exception {
        final TrianguloTipo tipo = Triangulos.validaTriangulo(2, 0, 2);

        assertEquals(TrianguloTipo.INVALIDO, tipo);

    }

    @Test
    public void testUmValorNegativo() throws Exception {
        final TrianguloTipo tipo = Triangulos.validaTriangulo(3, -2, 2);

        assertEquals(TrianguloTipo.INVALIDO, tipo);

    }

    @Test
    public void testSomaDoisIgualTerceiro() throws Exception {
        final TrianguloTipo tipo = Triangulos.validaTriangulo(1, 2, 3);

        assertEquals(TrianguloTipo.INVALIDO, tipo);

    }

    @Test
    public void testSomaDoisMenorTerceiro() throws Exception {
        final TrianguloTipo tipo = Triangulos.validaTriangulo(1, 3, 1);

        assertEquals(TrianguloTipo.INVALIDO, tipo);

    }

    @Test
    public void testTresvaloresZero() throws Exception {
        final TrianguloTipo tipo = Triangulos.validaTriangulo(0, 0, 0);

        assertEquals(TrianguloTipo.INVALIDO, tipo);

    }
}
