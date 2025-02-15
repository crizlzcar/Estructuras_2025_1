package Estructuras_2025_1;

import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos(); //De tipo Metodos se declara un objeto 
        int d = 0;
        System.out.println("Ingrese la dimensión de la matriz: ");
        d = sc.nextInt();
        ObjPersonas[][] M = new ObjPersonas[d][d];//Declaración Matriz Objetual
        M = m.LlenarMatrizObjetual(d); //Matriz se le asigna el ojeto m que llama al método LlenarMatrizObjetual
        m.MostrarMatrizObjetual(M); //el objeto m invoca un método vacío MostrarMatrizObjetual
    }
}