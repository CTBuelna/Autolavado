/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutolavadoEngine;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class AutolavadoEngine {
    private int Lavando;
    private int Aspirando;

    private Scanner in;
    private int movimientos = 0;


    private void printHeader(){
        System.out.println("=================");
        System.out.println("AUTALAVADO BUELNA");
        System.out.println("=================");
    }

    private void printMenu(){
        System.out.println(
                "1. Agregar Vehiculo.\n" +
                        "2. Lavar Vehiculo.\n" +
                        "3. Aspirar Vehiculo.\n" +
                        "4. Terminar Servicio.\n" +
                        "5. Mostrar.\n" +
                        "\n----------");
    }


}