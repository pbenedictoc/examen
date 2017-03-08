/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen;

public class NoCambiaLongitud {

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    private int valor;   

    //metodo que modifica el contenido de la posicion p de un array con el valor pasado
   public void modificar(int []v){
     	int i=0;  
        int p=1;
       //Mostramos los elementos del array  
         Visualizar(v,i);
         //Modificamos el array
       	  if(p<v.length){ 
            
             }
       //Mostramos los elementos del array  
       Visualizar(v,i); 
    }

//metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos
    public void borrar (int []v){
       int p=1,i=0;	  
      //mostramos su contenido 
        //Mostramos los elementos del array  
       Visualizar(v,i);
         //Borramos el elemento
       	 if(p<v.length){ 
                                                 
          }
   //Mostramos los elementos del array  
       Visualizar(v,i);
    }
     

//metodo que inserta un  elemento en la posicion p desplazando a la derecha todos los elementos
public void insertar (int []v){
       int p=1, i=0;	  
      //mostramos su contenido 
        //Mostramos los elementos del array  
       Visualizar(v,i);
         //Borramos el elemento
       	 if(p<v.length){ 
           
          }
   //Mostramos los elementos del array  
      Visualizar(v,i);      
      }




    public void Visualizar(int[] v, int i){
        System.out.print("v={");
         for (i=0;i<v.length;i++){
             System.out.print(v[i]+",");
             }    
         System.out.println("}");
    }
    
    
    public static void main(String[] args, NoCambiaLongitud posicion) {
        // TODO code application logic here
            int []vector= new int[5];
        vector[0]=2;
        vector[1]=4;
        vector[2]=6;
        vector[3]=8; 
        posicion=new NoCambiaLongitud();
        posicion.setValor(10);
        posicion.modificar(vector);
        posicion.borrar(vector);
        posicion.insertar(vector);
    }

    void Modificar(int[] v, int p, CambiaLongitud cambiaLongitud) {
        int LongitudActual = 0;
        int longitud = v.length;
        //mostramos su contenido
        System.out.println("Elemento a modificar=" + v[p]);
        v[p] = cambiaLongitud.getValor();
    }
}
