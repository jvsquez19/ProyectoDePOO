import java.util.Hashtable;

/*Es el usuario que puede jugar los niveles, crear grupos etc.*/
public class UsuarioComún extends Usuario {
    
    private int records;
    
    private int BestMoves;
    
    int nivelactual;
    
    private Hashtable<Integer, Integer> intentosPorNivel;

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public int getBestMoves() {
        return BestMoves;
    }

    public void setBestMoves(int BestMoves) {
        this.BestMoves = BestMoves;
    }

    public int getNivelactual() {
        return nivelactual;
    }

    public void setNivelactual(int nivelactual) {
        this.nivelactual = nivelactual;
    }

    public Hashtable<Integer, Integer> getIntentosPorNivel() {
        return intentosPorNivel;
    }

    public void setIntentosPorNivel(Hashtable<Integer, Integer> intentosPorNivel) {
        this.intentosPorNivel = intentosPorNivel;
    }

    @Override
    public String toString() {
        return "UsuarioCom\u00fan{" + "records=" + records + ", BestMoves=" + BestMoves + ", nivelactual=" + nivelactual + ", intentosPorNivel=" + intentosPorNivel + '}';
    }
    
    
    
}
