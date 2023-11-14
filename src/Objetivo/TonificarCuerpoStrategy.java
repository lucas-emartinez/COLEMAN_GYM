package Objetivo;

import Medicion.Medicion;

public class TonificarCuerpoStrategy extends ObjetivoStrategy {

    private Float masaMuscularIdeal;
    private Float porcentajeGrasaIdeal;

    public TonificarCuerpoStrategy() {
        super();
        this.masaMuscularIdeal = 0f;
        this.porcentajeGrasaIdeal = 0f;
    }

    @Override
    public void verificarObjetivo(Medicion medicion) {
        if (medicion.getMasaMuscular() >= this.getMasaMuscularIdeal() && medicion.getGrasaCorporal() <= this.getPorcentajeGrasaIdeal()) {
            setCumplido(true);
        } else {
            setCumplido(false);
        }
    }

    public void setMasaMuscularIdeal(Float masaMuscularIdeal) {
        this.masaMuscularIdeal = masaMuscularIdeal;
    }

    public Float getMasaMuscularIdeal() {
        return this.masaMuscularIdeal;
    }

    public void setPorcentajeGrasaIdeal(Float porcentajeGrasaIdeal) {
        this.porcentajeGrasaIdeal = porcentajeGrasaIdeal;
    }

    public Float getPorcentajeGrasaIdeal() {
        return this.porcentajeGrasaIdeal;
    }

    
}