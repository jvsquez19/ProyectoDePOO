import java.util.ArrayList;

/*Clase Principal que almacena todos los objetos que deben ser guardados como 
los Niveles, Los Usuarios y Los Grupos*/
public class Programa {
    private int recordRotos;
    
    private ArrayList<Nivel> niveles;
    
    private ArrayList<Usuario> Usuarios;
    
    private ArrayList<Grupo> Grupos;
    
    private Configuracion configuracion;
    
    private int cantidadNiveles;

    public int getRecordRotos() {
        return recordRotos;
    }

    public void setRecordRotos(int recordRotos) {
        this.recordRotos = recordRotos;
    }

    public ArrayList<Nivel> getNiveles() {
        return niveles;
    }

    public void setNiveles(ArrayList<Nivel> niveles) {
        this.niveles = niveles;
    }

    public ArrayList<Usuario> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> Usuarios) {
        this.Usuarios = Usuarios;
    }

    public ArrayList<Grupo> getGrupos() {
        return Grupos;
    }

    public void setGrupos(ArrayList<Grupo> Grupos) {
        this.Grupos = Grupos;
    }

    public Configuracion getConfiguracion() {
        return configuracion;
    }

    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }

    public int getCantidadNiveles() {
        return cantidadNiveles;
    }

    public void setCantidadNiveles(int cantidadNiveles) {
        this.cantidadNiveles = cantidadNiveles;
    }
    
    public void crearUsuario(){
        
    }
    public void borrarUsuario(){
        
    }
    public void buscarUsuario(){
        
    }
    
    public void LogIn(){
        
    }

    public void iniciarPartida() {
    }

    public void guardarPartida() {
    }

    public void imprimirNIvelesPorUsuario() {
    }

    public void intHistorialDeUsuario() {
    }

    public void ImprimirTopFiveGanesOptimos() {
    }

    public void ImprimirTopFiveRecordRotos() {
    }

    public void ImprimirTopFiveInsistenciaPorNIvel() {
    }

    public void ImprimirUsuariosSuperadoNivel() {
    }

    @Override
    public String toString() {
        return "Programa{" + "recordRotos=" + recordRotos + ", niveles=" + niveles + ", Usuarios=" + Usuarios + ", Grupos=" + Grupos + ", configuracion=" + configuracion + ", cantidadNiveles=" + cantidadNiveles + '}';
    }
    
}
