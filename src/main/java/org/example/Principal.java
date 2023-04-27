package org.example;
import java.util.ArrayList;
import java.util.Scanner;



public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = sc.nextInt();
        System.out.println("La suma de los numeros hasta  "+n+" :"+ej2.suma(n));
        System.out.println("El factorial de "+n+" es: "+ej2.fac(n));
        System.out.println("Ingrese la base");
        int base=sc.nextInt();
        System.out.println("Ingrese el exponente");
        int exponente=sc.nextInt();
        System.out.println("La potencia de "+base+" elevado a "+exponente+" es: "+ej2.potencia(base,exponente));
        int[] lista= {1,2,3,4,5,6,7,8,9,10};
        System.out.println("La suma de los elementos de la lista es: "+ej2.sumalista(lista,lista.length-1));
        System.out.println("La media de los elementos de la lista es: "+(double)ej2.media(lista,lista.length-1)/lista.length);
        ej2.media(lista,lista.length-1);
        ej2.cuadrados(lista,lista.length-1);
        System.out.println("La desviación típica de la lista es: "+ej2.desviacion(lista));
        System.out.println("La suma de los pares de  la lista pares es: "+ej2.sumapares(n));
        ArrayList lista2 = new ArrayList();
        System.out.println("La lista de los números pares es : "+ej2.suma1(lista,lista2,lista.length-1));
        ArrayList lista3 = new ArrayList();
        System.out.println("La lista de los pares hasta " +n+" es : "+ej2.pares(lista3,n));
        int[] lista4= {1,2,3,4,5,6,7,8,9,10};
        System.out.println("El producto escalar es : "+ej2.pescalar(lista4,lista,lista4.length-1));
        System.out.println("El fibonacci de "+n+" es: "+ej2.fib(n));
        ej2.fib13(13);
        ej2.fib12(12);
        System.out.println("La relación entre los resultados de la división de fibonacci de 13 y 12 y la razón aurea es: "+ej2.equals((1+Math.sqrt(5))/2));

    }
}