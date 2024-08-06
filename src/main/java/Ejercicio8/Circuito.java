package Ejercicio8;

class Circuito implements Evaluable {
    private static final int NUMERO_FALTAS_PERMITIDAS = 2;
    private int tiempoEnSeg;
    private int nroFaltas;

    public Circuito(int tiempoEnSeg, int nroFaltas) {
        this.tiempoEnSeg = tiempoEnSeg;
        this.nroFaltas = nroFaltas;
    }

    public int getTiempoEnSeg() {
        return tiempoEnSeg;
    }

    public int getNroFaltas() {
        return nroFaltas;
    }

    @Override
    public boolean isAprobado() {
        return nroFaltas <= NUMERO_FALTAS_PERMITIDAS;
    }
}
