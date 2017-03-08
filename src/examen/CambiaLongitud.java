/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen;

public class CambiaLongitud extends Vector {

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

    //metodo que modifica el contenido de la posicion p de un array con el valor pasado
   public void modificar(int []v){
     	int i=0;  
        int p=1;
       //Mostramos los elementos del array  
         Visualizar(v,i);
         //Modificamos el array
       	  if(p<v.length){ 
              //Modificar(v, p, this);
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
            Borrar(v, p, i);                                       
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
            Insertar(i, v, p);
          }
   //Mostramos los elementos del array  
      Visualizar(v,i);      
      }


    void Borrar(int[] v, int p, int i) {
        int LongitudActual=0, longitud=v.length;
        System.out.println("Elemento a borrar="+v[p]);
        for(i=p;i<longitud-1;i++)
              v[i]=v[i+1];
    }
    void Insertar(int i, int[] v, int p) {
        int LongitudActual=0, longitud=v.length;
        System.out.println("Elemento a insertar=" + this.getValor());
       for (i = longitud-1; i > p; i--) {
           v[i] = v[i - 1];
       }
       v[p] = this.getValor();
    }


    
    
    public static void main(String[] args, CambiaLongitud posicion) {
        // TODO code application logic here
            int []vector= new int[5];
        vector[0]=2;
        vector[1]=4;
        vector[2]=6;
        vector[3]=8; 
        posicion=new CambiaLongitud();
        posicion.setValor(10);
        posicion.modificar(vector);
        posicion.borrar(vector);
        posicion.insertar(vector);
    }
}
