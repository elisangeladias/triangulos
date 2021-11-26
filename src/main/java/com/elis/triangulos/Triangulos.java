package com.elis.triangulos;

import java.util.Scanner;

/**
 *
 * @author elisangela
 */
public class Triangulos {

    public static TrianguloTipo validaTriangulo(int a, int b, int c) {
        //COMENTAR O TRECHO DO SCANNER PARA RODAR O TESTE
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tamanho em centimetros do primeiro lado do triangulo!!");

        a = ler.nextInt();

        System.out.println("Digite o tamanho em centimetros do segundo lado do triangulo!!");

        b = ler.nextInt();

        System.out.println("Digite o tamanho em centimetros do terceiro lado do triangulo!!");

        c = ler.nextInt();

        try {
            if ((a < ((b + c)) && (b < (a + c)) && (c < (b + a))) && ((a > 0) && (b > 0) && (c > 0))
                    && ((a != 0) && (b != 0) && (c != 0)) && (!(a == ((b + c))) && (!(b == (a + c))) && (!(c == (b + a))))) {

                if (a != b && b != c) {
                    System.out.println("Escaleno");
                    return TrianguloTipo.ESCALENO;
                }

                if (a == b || a == c || b == c) {
                    System.out.println("Isosceles");
                    return TrianguloTipo.ISOSCELES;
                }
                if (a == b && b == c) {
                    System.out.println("Equilatero");
                    return TrianguloTipo.EQUILATERO;
                }
               
                System.out.println("a:" + a + " " + "b: " + b + " " + "c: " + c);
            } else {
                throw new Exception("soma de dois lado tem que ser maior que o terceiro");
            }

        } catch (Exception e) {
            System.out.println("Exceção: " + e);

        }

        return TrianguloTipo.INVALIDO;
    }

}
