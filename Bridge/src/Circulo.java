public class Circulo extends Forma {
    public Circulo(Color color) {
        super(color); //guardo en la clase padre?
    }
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo");
        color.aplicarColor();
    }
}