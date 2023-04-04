import java.util.Collections;
import java.util.List;

public class AplicacionOrdenamiento {
    private IEstrategiaOrdenamiento estrategia;
    public void setEstrategia(IEstrategiaOrdenamiento estrategia){
        this.estrategia=estrategia;
    }
    public void ordenar(List<Object> lista) {
       estrategia.ordenar(lista);
    }
    public AplicacionOrdenamiento(IEstrategiaOrdenamiento estrategia){
        this.estrategia=estrategia;
    }

}
