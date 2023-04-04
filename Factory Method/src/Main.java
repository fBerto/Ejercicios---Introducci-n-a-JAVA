public class Main {
    public static void main(String[] args) {
        IConexion conexion = FabricaConexiones.obtenerConexion(false);
        conexion.conectarBD();
    }
}