
public class Circunferencia extends FormaGeometrica {

    private final double raio;

    public Circunferencia(double raio) {
        if (!Double.isFinite(raio) || raio <= 0) {
            throw new IllegalArgumentException(
                "O raio deve ser positivo e finito."
            );
        }

        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    // Método exclusivo da classe Circunferencia
    public double getDiametro() {
        return 2 * raio;
    }
}
