
public class Retangulo extends FormaGeometrica {

    private final double largura;
    private final double altura;

    public Retangulo(double largura, double altura) {
        if (!Double.isFinite(largura)
                || !Double.isFinite(altura)
                || largura <= 0 || altura <= 0) {
            throw new IllegalArgumentException(
                "Largura e altura devem ser positivas e finitas."
            );
        }

        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return largura * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (largura + altura);
    }

    // Método exclusivo da classe Retangulo
    public boolean isQuadrado() {
        return Math.abs(largura - altura) < 1e-9;
    }
}
