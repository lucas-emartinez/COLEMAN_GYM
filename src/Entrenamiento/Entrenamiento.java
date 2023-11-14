package Entrenamiento;

import java.util.List;

import Ejercicio.Ejercicio;

public class Entrenamiento {

    private List<Ejercicio> ejercicios;
    private Double tiempoEntrenamiento;

    public void setEjercicios(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public void setTiempoEntrenamiento(Double tiempoEntrenamiento) {
        this.tiempoEntrenamiento = tiempoEntrenamiento;
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public Double getTiempoEntrenamiento() {
        return tiempoEntrenamiento;
    }


}