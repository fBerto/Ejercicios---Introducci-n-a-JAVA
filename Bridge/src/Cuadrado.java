public class Cuadrado extends Forma {
    public Cuadrado(Color color) {
        super(color);
    }

    public void dibujar() {
        System.out.print("Dibujando un cuadrado. ");
        color.aplicarColor();
    }
}