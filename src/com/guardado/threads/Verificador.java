/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guardado.threads;

/**
 *
 * @author María Lourdes
 */
public class Verificador {

    public static Verificador instance;
    private boolean animales[];

    private Verificador() {
        animales = new boolean[3];
        for (int i = 0; i < 3; i++) {
            animales[i] = false;
        }
    }

    public void setPosicion(int i, boolean valor) {
        animales[i] = valor;
    }

    public boolean getTodos() {
        if (animales[0] && animales[1] && animales[2]) {
            return true;
        } else {
            return false;
        }
    }
    
    public synchronized static Verificador getInstantce(){
        if(instance==null){
            instance = new Verificador();
        }
        return instance;
    }
}
