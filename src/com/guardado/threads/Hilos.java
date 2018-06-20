/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guardado.threads;

import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Hilos extends Thread {

    private String nombre;
    private int limite;
    private JLabel animal;
    private int x;
    private int y;

    public Hilos() {
    }

       @Override
    public void run() {
        while (true) {
            if(this.limite!=limite){
            for (int i = x; i <= this.limite; i += 10) {
                System.out.println(this.nombre + " avanza");
                this.animal.setLocation(i, y);
                
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            JOptionPane.showMessageDialog(null, "Haz llegado a la meta");
            System.out.println(this.nombre + " a llegado a la meta");

            yield();
        }
    }}
}
