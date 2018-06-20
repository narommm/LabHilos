package com.guardado.threads;

import javax.swing.*;

public class AnimalThread extends Thread {

    private String nombre;
    private int limite;
    private JLabel animal;
    private int x;
    private int y;
    private int paso;

    public AnimalThread() {
        paso = 10;
    }

    public AnimalThread(String nombre, int x, int y, int limite, JLabel animal) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.limite = limite;
        this.animal = animal;
        paso = 10;
    }

    public int getPaso() {
        return paso;
    }

    public void setPaso(int paso) {
        this.paso = paso;
    }

    @Override
    public void run() {

        //El paso pregunta si el paso es menor que cero , y luego resta, pero mientras no sea menor que cero seguira sumando
        for (int i = x; ((paso < 0) ? (i >= this.limite) : (i <= this.limite)); i += paso) {
            System.out.println(this.nombre + " avanza");
            this.animal.setLocation(i, y);
            try {
                if (this.nombre == "tortuga") {
                    sleep(1000);
                }
                sleep(100);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.nombre + " a llegado a la meta");

        yield();
    }
}
