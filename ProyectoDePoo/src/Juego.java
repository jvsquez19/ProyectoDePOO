
/*Conteine la informacion de la partida en curso en un momento dado*/
public class Juego {

    private int cantidadMovimientos;
    
    private Nivel nivel;
    
    private Usuario jugador;

    private int tiempo;

    private char estado;

    private int jugadasAnteriores;

    public int getCantidadMovimientos() {
        return cantidadMovimientos;
    }

    public void setCantidadMovimientos(int cantidadMovimientos) {
        this.cantidadMovimientos = cantidadMovimientos;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Usuario getJugador() {
        return jugador;
    }

    public void setJugador(Usuario jugador) {
        this.jugador = jugador;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int getJugadasAnteriores() {
        return jugadasAnteriores;
    }

    public void setJugadasAnteriores(int jugadasAnteriores) {
        this.jugadasAnteriores = jugadasAnteriores;
    }
    
    

    public void calcularTiempo() {
    }

    public void cargarNivel() {
    }

    public void terminar() {
    }

    public void comprobarJugadas() {
    }

    public void reiniciar() {
    }

    @Override
    public String toString() {
        return "Juego{" + "cantidadMovimientos=" + cantidadMovimientos + ", nivel=" + nivel + ", jugador=" + jugador + ", tiempo=" + tiempo + ", estado=" + estado + ", jugadasAnteriores=" + jugadasAnteriores + '}';
    }
    
}
