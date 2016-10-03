

/* Clase configuración, alternativa a Reglas, permite activar o desactivar dos configuraciones,
el poder mover dos cajas, o bien Deshacer dos ultimos movimientos*/
public class Configuracion {
   

    private boolean moverDosCajas;

    private boolean dehacerDosVeces;

    public boolean isMoverDosCajas() {
        return moverDosCajas;
    }

    public void setMoverDosCajas(boolean moverDosCajas) {
        this.moverDosCajas = moverDosCajas;
    }

    public boolean isDehacerDosVeces() {
        return dehacerDosVeces;
    }

    public void setDehacerDosVeces(boolean dehacerDosVeces) {
        this.dehacerDosVeces = dehacerDosVeces;
    }

    @Override
    public String toString() {
        return "Configuracion{" + "moverDosCajas=" + moverDosCajas + ", dehacerDosVeces=" + dehacerDosVeces + '}';
    }
    
    
    /*Metodo que Captura las configuraciones en los atributos y modifica el comportamiento del programa*/
    public void configurar() {
    }
}
