/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Vector {

    protected int valor;

    public void Visualizar(int[] v, int i) {
        System.out.print("v={");
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("}");
    }

}
