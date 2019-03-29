/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Autolavado{
    //Atributos
    private int max;
    private int fin;
    private int inicio;
    private int[]datos;


    //Constructor
    public Autolavado(int n){
        this.inicio = 0;
        this.fin = 0;
        this.max = n;
        this.datos = new int [n];
    }

    public boolean agregar(int x){
        boolean resultado = false;
        //verificar si hay espacio en la pila 
        if(this.fin < this.max){
            this.datos[this.fin] = x;
            this.fin++;
            return true;
        }
        else{
            return resultado;
        }

    }

    public int extraer(){
        int resultado = -1;

        //verificar si al menos hay un elemento
        if(this.fin > 0){
            this.fin --;
            resultado = this.datos[this.inicio];
            //recorrer elementos restantes
            for( int i = 0; i < this.fin; i++){
                this.datos[i] = this.datos[i+1];
            }
        }
        return resultado;
    }

    public void mostrar(){
        System.out.println("Elementos en la pila : ");
        for(int i = 0;i < this.fin; i++ ){
            System.out.println(this.datos[i]);
        }
    }

}

    