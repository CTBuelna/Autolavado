/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutolavadoCT;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class AutoLavado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        int n=0, v=0, lavado=0, aspirado=0, salir=0;
        boolean espacio;
        System.out.println("Antes que todo, Cuantos carros puede tener en su Autolavado?: ");
        n = input.nextInt();
        AutolavadoCT.ColaAuto cola =new AutolavadoCT.ColaAuto(n);
        do{
            System.out.println("=====================");
            System.out.println("Autolavado Netbeans");
            System.out.println("=====================");
            System.out.println("¿Que desea hacer?");
            System.out.println("[1] Agregar vehiculo ");
            System.out.println("[2] Lavar vehiculo ");
            System.out.println("[3] Aspirar vehiculo ");
            System.out.println("[4] Sacar vehiculo ");
            System.out.println("[5] Mostrar ");
            System.out.println("[6] Terminar Servicio ");
            opcion = input.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese identificacion del vehiculo : \n ");
                    v = input.nextInt();
                    espacio=cola.agregar(v);
                    if(espacio==true){
                        System.out.println("Vehiculo agregado");
                    }else{
                        System.out.println("no hay espacio en este momento ");
                    }
                    break;
                case 2:
                    lavado=cola.extraer();
                    System.out.println("El vehiculo " + lavado + " Se esta lavando");
                    break;
                case 3:
                    aspirado=lavado;
                    lavado=0;
                    System.out.println("El vehiculo " + aspirado + " Se esta aspirando");
                    break;
                case 4:
                    salir=aspirado;
                    aspirado=0;
                    System.out.println("El vehiculo " + salir + " ha salido");
                    break;
                case 5:
                    cola.mostrar();
                    break;
            }


        }while(opcion >= 1 && opcion <= 5);
    }

}
