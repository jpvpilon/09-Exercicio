public class Cilindro extends Forma {
    private double altura;

    public Cilindro(int coordenadaX, int coordenadaY, double raio, double altura) {
        super(coordenadaX, coordenadaY, raio);
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                '}';
    }

    @Override
    public double calcularArea() {
        return 1;
    }

    public double calcularVolume() {
        return -1;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
