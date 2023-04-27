package org.example;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

class ej2Test {

    @org.junit.jupiter.api.Test
    void Testsumanumero0() {
        assertEquals(0,ej2.suma(0));
    }
    @org.junit.jupiter.api.Test
    void Testsumanumero5() {
        assertEquals(15,ej2.suma(5));
    }



    @org.junit.jupiter.api.Test
    void factorial0() {
        assertEquals(1,ej2.fac(0));
    }
    @org.junit.jupiter.api.Test
    void factorial3() {
        assertEquals(6,ej2.fac(3));
    }


    @org.junit.jupiter.api.Test
    void potencia3elevadoa0() {
        assertEquals(1,ej2.potencia(3,0));
    }
    @org.junit.jupiter.api.Test
    void potencia2elevadoa3() {
        assertEquals(8,ej2.potencia(2,3));
    }


    @org.junit.jupiter.api.Test
    void sumalistavacia() {
        int[] lista = new int[0];
        assertEquals(0,ej2.sumalista(lista,0));
    }
    @org.junit.jupiter.api.Test
    void sumalista3elementos(){
        int[] lista = {1,2,3};
        assertEquals(6,ej2.sumalista(lista,2));
    }

    @org.junit.jupiter.api.Test
    void medialista0elementos() {
        int[] lista = {};
        assertEquals(0,ej2.media(lista,0));
    }
    @org.junit.jupiter.api.Test
    void medialista3elementos() {
        int[] lista = {1,2,3};
        assertEquals(6,ej2.media(lista,2));
    }



    @org.junit.jupiter.api.Test
    void cuadradoslista0elementos() {
        int[] lista = new int[0];
        assertEquals(0,ej2.cuadrados(lista,0));
    }
    @org.junit.jupiter.api.Test
    void cuadradoslista3elementos() {
        int[] lista = {1,2,3};
        assertEquals(14,ej2.cuadrados(lista,2));
    }

    @org.junit.jupiter.api.Test
    void desviacionlista0elementos() {
        int[] lista = new int[0];
        assertEquals(0,ej2.desviacion(lista));
    }
    @org.junit.jupiter.api.Test
    void desviacionlista3elementos() {
        int[] lista = {1,2,3};
        assertEquals(0.816496580927726,ej2.desviacion(lista));
    }
    @org.junit.jupiter.api.Test
    void sumaparesde0() {
        assertEquals(   0,ej2.sumapares(0));
    }
    @org.junit.jupiter.api.Test
    void sumaparesde5() {
        assertEquals(6,ej2.sumapares(5));
    }
    @org.junit.jupiter.api.Test
    void pares0() {
       ArrayList lista3 = new ArrayList();
       ArrayList lista2 = new ArrayList();

        assertEquals(lista2,ej2.pares( lista3, 0));
    }

    @org.junit.jupiter.api.Test
    void pares5(){
        ArrayList lista2 = new ArrayList();
        lista2.add(4);
        lista2.add(2);
        ArrayList lista3 = new ArrayList();

        assertEquals(lista2,ej2.pares( lista3, 5));
    }

    @org.junit.jupiter.api.Test
    void suma1_0elementos() {
        int[] lista = {};
        ArrayList lista2 = new ArrayList();
        ArrayList lista3 = new ArrayList();

        assertEquals(lista2,ej2.suma1(lista,lista3,lista.length-1));
    }

    @org.junit.jupiter.api.Test
    void suma1_3elementos() {
        int[] lista = {1,2,3};
        ArrayList lista2 = new ArrayList();
        lista2.add(2);
        ArrayList lista3 = new ArrayList();

        assertEquals(lista2,ej2.suma1(lista,lista3,lista.length-1));
    }




    @org.junit.jupiter.api.Test
    void pescalar_0elementos() {
        int[] lista = {};
        int[] lista2 = {};
        assertEquals(0,ej2.pescalar(lista,lista2,lista.length-1));

    }
    @org.junit.jupiter.api.Test
    void pescalar_3elementos() {
        int[] lista = {1,2,3};
        int[] lista2 = {1,2,3};
        assertEquals(14,ej2.pescalar(lista,lista2,lista.length-1));
    }

    @org.junit.jupiter.api.Test
    void fib20() {
        assertEquals(6765,ej2.fib(20));
    }
    @org.junit.jupiter.api.Test
    void fib0(){
        assertEquals(0,ej2.fib(0));
    }

    @org.junit.jupiter.api.Test
    void fib13() {
        assertEquals(233,ej2.fib(13));
    }

    @org.junit.jupiter.api.Test
    void fib12() {
        assertEquals(144,ej2.fib(12));
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        double num=(1+Math.sqrt(5))/2;
        assertEquals(true,ej2.equals(num));

    }
}