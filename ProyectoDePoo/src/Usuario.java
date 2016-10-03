import java.util.ArrayList;

/*Clase usuario que posee la informacion que Usuario Común y el administrador 
tienen en común*/
public class Usuario {

    private String nombreCompleto;
    
    private ArrayList<Juego> juegosRealizados;
    
    private ArrayList<Historial> historiales;

    private int cedula;

    private String correo;

    private String contrasena;

    private String fechaRegistro;

    private String fotografia;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public ArrayList<Juego> getJuegosRealizados() {
        return juegosRealizados;
    }

    public void setJuegosRealizados(ArrayList<Juego> juegosRealizados) {
        this.juegosRealizados = juegosRealizados;
    }

    public ArrayList<Historial> getHistoriales() {
        return historiales;
    }

    public void setHistoriales(ArrayList<Historial> historiales) {
        this.historiales = historiales;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }
    
    

    public void CrearGrupo() {
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreCompleto=" + nombreCompleto + ", juegosRealizados=" + juegosRealizados + ", historiales=" + historiales + ", cedula=" + cedula + ", correo=" + correo + ", contrasena=" + contrasena + ", fechaRegistro=" + fechaRegistro + ", fotografia=" + fotografia + '}';
    }
    
    
}
