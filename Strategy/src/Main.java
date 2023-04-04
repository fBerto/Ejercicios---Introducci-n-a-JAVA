import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> lista = new ArrayList<Object>(Arrays.asList(1,3,3, 2, 5, 4));
        AplicacionOrdenamiento app = new AplicacionOrdenamiento(new EstrategiaOrdenamientoDescendente());
        app.ordenar(lista);
        System.out.println("Ordenamiento descendente: " + lista);
        app.setEstrategia(new EstrategiaOrdenamientoAleatorio());
        app.ordenar(lista);
        System.out.println("Ordenamiento aleatorio: " + lista);
    }
}