import java.util.ArrayList;

/* Clase Administrador, es una generalizacion de Usuario, este puede crear borrar y editar niveles */

public class Administrador extends Usuario {

    private String nacionalidad;

    private int cantidadNivelesAgregados;
    
    private ArrayList<Nivel> nivelesAgregados;

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getCantidadNivelesAgregados() {
        return cantidadNivelesAgregados;
    }

    public void setCantidadNivelesAgregados(int cantidadNivelesAgregados) {
        this.cantidadNivelesAgregados = cantidadNivelesAgregados;
    }

    public ArrayList<Nivel> getNivelesAgregados() {
        return nivelesAgregados;
    }

    public void setNivelesAgregados(ArrayList<Nivel> nivelesAgregados) {
        this.nivelesAgregados = nivelesAgregados;
    }
    
    

    public void crearNivel() {
    }

    public void editarNivel() {
    }

    public void borrarNivel() {
    }
    public void cambiarOrdenNivel(){
        
    }

    @Override
    public String toString() {
        return "Administrador{" + "nacionalidad=" + nacionalidad + ", cantidadNivelesAgregados=" + cantidadNivelesAgregados + ", nivelesAgregados=" + nivelesAgregados + '}';
    }
}
