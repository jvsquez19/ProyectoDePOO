public class Estadisticas {
    
    /*Clase que guarda las estadisticas generales de un usuario*/

    private int tiempoPromedio;

    private int porcentajeCompletado;

    private int BestMovesTotales;

    private int tiempoTotalDeJuego;

    public void imprimirEstadisticas() {
    }

    public int getTiempoPromedio() {
        return tiempoPromedio;
    }

    public void setTiempoPromedio(int tiempoPromedio) {
        this.tiempoPromedio = tiempoPromedio;
    }

    public int getPorcentajeCompletado() {
        return porcentajeCompletado;
    }

    public void setPorcentajeCompletado(int porcentajeCompletado) {
        this.porcentajeCompletado = porcentajeCompletado;
    }

    public int getBestMovesTotales() {
        return BestMovesTotales;
    }

    public void setBestMovesTotales(int BestMovesTotales) {
        this.BestMovesTotales = BestMovesTotales;
    }

    public int getTiempoTotalDeJuego() {
        return tiempoTotalDeJuego;
    }

    public void setTiempoTotalDeJuego(int tiempoTotalDeJuego) {
        this.tiempoTotalDeJuego = tiempoTotalDeJuego;
    }
    
    public void calcularEstadisticas(){
        
    }

    @Override
    public String toString() {
        return "Estadisticas{" + "tiempoPromedio=" + tiempoPromedio + ", porcentajeCompletado=" + porcentajeCompletado + ", BestMovesTotales=" + BestMovesTotales + ", tiempoTotalDeJuego=" + tiempoTotalDeJuego + '}';
    }
    
}
