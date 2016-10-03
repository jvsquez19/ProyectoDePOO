import java.util.ArrayList;

/*Clase que relaciona a un grupo de usuarios en niveles para que puedan competir*/

public class Grupo {
    private ArrayList<Usuario> participantes;
    
    private ArrayList<Nivel> niveles;
    
    private char estado;

    private Usuario ganadorPorMovimientos;

    private Usuario ganadorPorTiempo;

    public ArrayList<Usuario> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Usuario> participantes) {
        this.participantes = participantes;
    }

    public ArrayList<Nivel> getNiveles() {
        return niveles;
    }

    public void setNiveles(ArrayList<Nivel> niveles) {
        this.niveles = niveles;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public Usuario getGanadorPorMovimientos() {
        return ganadorPorMovimientos;
    }

    public void setGanadorPorMovimientos(Usuario ganadorPorMovimientos) {
        this.ganadorPorMovimientos = ganadorPorMovimientos;
    }

    public Usuario getGanadorPorTiempo() {
        return ganadorPorTiempo;
    }

    public void setGanadorPorTiempo(Usuario ganadorPorTiempo) {
        this.ganadorPorTiempo = ganadorPorTiempo;
    }
    
    
   public void agregarAHistorial(){
       
   }
   
   public void addNivel(){
       
   }
   
   public void cerrarGrupo(){
       
   }

    @Override
    public String toString() {
        return "Grupo{" + "participantes=" + participantes + ", niveles=" + niveles + ", estado=" + estado + ", ganadorPorMovimientos=" + ganadorPorMovimientos + ", ganadorPorTiempo=" + ganadorPorTiempo + '}';
    }
   
}
