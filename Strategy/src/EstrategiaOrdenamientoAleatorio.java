import java.util.Collections;
import java.util.List;

public class EstrategiaOrdenamientoAleatorio implements IEstrategiaOrdenamiento{

    @Override
    public List<Object> ordenar(List<Object> lista) {
        Collections.shuffle(lista);
        return lista;
    }
}
