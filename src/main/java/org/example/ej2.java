package org.example;
import java.util.ArrayList;

public class ej2 {
    public	static int suma(int n) {
        if(n<=1) {
            return n;
        }else {
            return n+ suma(n-1);
        }
    }

    public static int fac(int n) {
        if(n<=1) {
            return 1;
        }else {
            return n*fac(n-1);
        }
    }

    public static int  potencia(int  base,int exponente) {

        if( exponente==0) {
            return 1;

        }else {
            return (base)*potencia(base,exponente-1);

        }
    }

    public static int sumalista( int[] lista,int i) {
        if(i==0) {
            return lista[0];
        }else {
            return lista[i]+sumalista(lista,i-1);


        }
    }

    public static double media(int[] lista,int i) {
        if(i==0) {
            return lista[i];
        }else {

            return 	lista[i]+media(lista,i-1);
        }

    }


    public static double cuadrados(int[]lista,int i) {
        if(i==0) {
            return lista[i]*lista[i];
        }else {
            return lista[i]*lista[i]+cuadrados(lista,i-1);
        }
    }
    public static double desviacion(int[]lista) {
        double media=(double)media(lista,lista.length-1)/lista.length;
        double cuadrados=(double)cuadrados(lista,lista.length-1);
        double varianza=(cuadrados/lista.length)-(media*media);
        double desviacion=Math.sqrt(varianza);
        return  desviacion;
    }

    public static int sumapares(int n) {

        if(n%2!=0) {
            n=n-1;
        }
        if(n==0) {
            return n;
        }else {
            return n+sumapares(n-2);
        }

    }
    public static ArrayList suma1 (int[]lista, ArrayList lista2, int n) {
        if (n == 0) {
            if (lista[0] % 2 == 0) {
                lista2.add(lista[n]);
                return lista2;
            } else
                return lista2;
        } else {

            if (lista[n] % 2 != 0)
                return suma1(lista, lista2, n - 1);
            else
                lista2.add(lista[n]);
            return suma1(lista, lista2, n - 1);
        }
    }


    public static ArrayList pares (ArrayList lista3,int n){
        if (n == 2) {
            lista3.add(n);
            return lista3;
        } else {
            if (n % 2 == 0) {
                lista3.add(n);
                return pares(lista3, n - 1);
            } else {
                return pares(lista3, n - 1);

            }
        }

    }

    public static int pescalar ( int[] lista1, int[] lista2, int i){
        if (i < 0) {
            return 0;
        } else {
            return (lista1[i] * lista2[i]) + pescalar(lista1, lista2, i - 1);
        }
    }

    public static int fib ( int n){
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }

    public static int fib13 ( int n){
        if (n < 2) {
            return n;
        } else {
            return fib13(n - 1) + fib13(n - 2);
        }

    }
    public static int fib12 ( int n){
        if (n < 2) {
            return n;
        } else {
            return fib12(n - 1) + fib12(n - 2);
        }

    }

    public static boolean equals ( double num){
        double n13 = fib13(13);
        double n12 = fib13(12);
        double cociente = (double) (n13 / n12);
        if (Math.abs(num - cociente) < 0.1) {
            return true;
        } else {
            return false;
        }
    }


}


