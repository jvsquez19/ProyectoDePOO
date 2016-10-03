/*Es un punto en la matriz en donde se debe colocar la caja para poder ganar*/

public class Punto extends Elemento {
   private boolean estado;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Punto{" + "estado=" + estado + '}';
    }
   
   
}
