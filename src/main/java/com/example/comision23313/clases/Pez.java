package com.example.comision23313.clases;

public class Pez extends Animal{

    private int cantEscamas;

    public Pez(){}

    public Pez(int cantEscamas){
        this.cantEscamas = cantEscamas;
    }

    public int getCantEscamas() {
        return cantEscamas;
    }

    public void setCantEscamas(int cantEscamas) {
        this.cantEscamas = cantEscamas;
    }
}
