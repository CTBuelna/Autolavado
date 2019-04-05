/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutolavadoCT;

/**
 *
 * @author Alumno
 */
public class ColaAuto {
    //atributos
    private int max;
    private int fin;
    private int inicio;
    private int[] datos;
    //constructor
    public ColaAuto(int n){
        this.inicio=0;
        this.fin = 0;
        this.max = n;
        this.datos = new int[n];
    }
    //metdos
    public boolean agregar(int x){
        boolean resultado = false;
        //verificar si hay espacio en la cola
        if(this.fin < this.max){
            this.datos[this.fin]=x;
            this.fin++;
            resultado=true;
        }
        return resultado;
    }
    public int extraer(){
        int resultado= -1;
        if(this.fin>0){
            this.fin--;
            resultado = this.datos[this.inicio];
            //recorrer elementos restantes
            for(int i=0;i<this.fin;i++){
                this.datos[i]=this.datos[i+1];
            }
        }
        return resultado;
    }
    public void mostrar(){
        System.out.println("Elementos en la cola : ");
        for(int i=0;i<this.fin;i++){
            System.out.println(this.datos[i]);
        }
    }
}
