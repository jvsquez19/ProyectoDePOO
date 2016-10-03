/*Se guarda un historial por partida para poder obtener datos en el futuro, Un usuario 
puede tener multiples historiales*/

public class Historial {

    private int tiempoRealizado;
    
    private Juego partida;

    private int movimientosRealizados;

    private char tipoDeGane;

    public int getTiempoRealizado() {
        return tiempoRealizado;
    }

    public void setTiempoRealizado(int tiempoRealizado) {
        this.tiempoRealizado = tiempoRealizado;
    }

    public Juego getPartida() {
        return partida;
    }

    public void setPartida(Juego partida) {
        this.partida = partida;
    }

    public int getMovimientosRealizados() {
        return movimientosRealizados;
    }

    public void setMovimientosRealizados(int movimientosRealizados) {
        this.movimientosRealizados = movimientosRealizados;
    }

    public char getTipoDeGane() {
        return tipoDeGane;
    }

    public void setTipoDeGane(char tipoDeGane) {
        this.tipoDeGane = tipoDeGane;
    }
    
    

    public void Congelar() {
    }

    public void imprimirHistorial() {
    }

    public void calcularDiferenciaBMYM() {
    }

    @Override
    public String toString() {
        return "Historial{" + "tiempoRealizado=" + tiempoRealizado + ", partida=" + partida + ", movimientosRealizados=" + movimientosRealizados + ", tipoDeGane=" + tipoDeGane + '}';
    }
    
    
}
