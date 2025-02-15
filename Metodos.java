package Estructuras_2025_1;

import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner (System.in);
    public ObjPersonas [][] LlenarMatrizObjetual (int d){
        ObjPersonas [][] m = new ObjPersonas[d][d];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjPersonas obj = new ObjPersonas();//Declaración de objeto para guardar lo que hay en la matriz
                System.out.println("Ingrese el nombre: ");
                obj.setNombre(sc.next());// m[i][j]. setNombre asigna el valor del nombre
                System.out.println("Ingrese el apellido: ");
                obj.setApellido(sc.next());
                System.out.println("Ingrese la dirección: ");
                obj.setDireccion(sc.next());
                System.out.println("Ingrese el teléfono: ");
                obj.setTelefono(sc.nextInt());
                m[i][j] = obj; //Asignación de lo que tiene la matriz dentro del objeto
            }
        }
        return m;
    }

    public void MostrarMatrizObjetual (ObjPersonas [][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println(m);
                System.out.println("Nombre: " + m[i][j].getNombre());
                System.out.println("Apellido: " + m[i][j].getApellido());
                System.out.println("Dirección: " + m[i][j].getDireccion());
                System.out.println("Teléfono " + m[i][j].getTelefono());
                System.out.println("\n");

            }
        }
    }
}
