
public class Pentagono extends FormaGeometrica {

    private final double lado;

    public Pentagono(double lado) {
        if (!Double.isFinite(lado) || lado <= 0) {
            throw new IllegalArgumentException(
                "O lado deve ser positivo e finito."
            );
        }

        this.lado = lado;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(25 + 10 * Math.sqrt(5)) / 4)
                * lado * lado;
    }

    @Override
    public double getPerimetro() {
        return 5 * lado;
    }

    // Método exclusivo da classe Pentagono
    public int getNumeroLados() {
        return 5;
    }
}
