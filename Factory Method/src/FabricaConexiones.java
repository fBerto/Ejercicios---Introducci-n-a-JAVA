public class FabricaConexiones {
    static IConexion obtenerConexion(boolean oracle){
        if (oracle){
            return  new ConexionOracle();
        }
        else{
            return  new ConexionMySQL();
        }
    }
}
