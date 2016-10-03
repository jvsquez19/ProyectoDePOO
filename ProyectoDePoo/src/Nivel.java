/*Contiene la informacion inicial para un nivel*/
import java.util.ArrayList;

public class Nivel {

    private ArrayList<Elemento> elementos;
    
    private Administrador creador;
    
    private char estadoInicial;

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Elemento> elementos) {
        this.elementos = elementos;
    }

    public Administrador getCreador() {
        return creador;
    }

    public void setCreador(Administrador creador) {
        this.creador = creador;
    }

    public char getEstadoInicial() {
        return estadoInicial;
    }

    public void setEstadoInicial(char estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public int getMovimientos() {
        return Movimientos;
    }

    public void setMovimientos(int Movimientos) {
        this.Movimientos = Movimientos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    private int Movimientos;

    private int numero;



    public void moverElemento() {
    }
    
    public void agregarCaja(){
        
    }
    
    public void agregarPunto(){
        
    }
    public void ubicarPersonaje(){
        
    }
    public void crearMatriz(){
        
    }

    @Override
    public String toString() {
        return "Nivel{" + "elementos=" + elementos + ", creador=" + creador + ", estadoInicial=" + estadoInicial + ", Movimientos=" + Movimientos + ", numero=" + numero + '}';
    }
    
}
