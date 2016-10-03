public class Elemento {
/*Clase Elemento, tiene los atributos en común de todos los objetos en la pantalla. */
    private int apariencia;

    private int posicion;
    
    private boolean movilidad;

    public int getApariencia() {
        return apariencia;
    }

    public void setApariencia(int apariencia) {
        this.apariencia = apariencia;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public boolean isMovilidad() {
        return movilidad;
    }

    public void setMovilidad(boolean movilidad) {
        this.movilidad = movilidad;
    }

    @Override
    public String toString() {
        return "Elemento{" + "apariencia=" + apariencia + ", posicion=" + posicion + ", movilidad=" + movilidad + '}';
    }
    
    
}
