import java.util.Collections;
import java.util.List;

public class EstrategiaOrdenamientoDescendente implements IEstrategiaOrdenamiento{
    @Override
    public List<Object> ordenar(List<Object> lista) {
        Collections.sort(lista, Collections.reverseOrder());
        return lista;
    }
}
