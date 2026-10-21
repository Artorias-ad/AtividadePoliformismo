
public class Triangulo extends FormaGeometrica {

    private final double ladoA;
    private final double ladoB;
    private final double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        if (!Double.isFinite(ladoA)
                || !Double.isFinite(ladoB)
                || !Double.isFinite(ladoC)
                || ladoA <= 0 || ladoB <= 0 || ladoC <= 0
                || ladoA + ladoB <= ladoC
                || ladoA + ladoC <= ladoB
                || ladoB + ladoC <= ladoA) {
            throw new IllegalArgumentException(
                "Os lados informados não formam um triângulo válido."
            );
        }

        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double getArea() {
        double semiperimetro = getPerimetro() / 2.0;

        return Math.sqrt(
            semiperimetro
            * (semiperimetro - ladoA)
            * (semiperimetro - ladoB)
            * (semiperimetro - ladoC)
        );
    }

    @Override
    public double getPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    // Método exclusivo da classe Triangulo
    public String getTipoTriangulo() {
        boolean ab = Math.abs(ladoA - ladoB) < 1e-9;
        boolean ac = Math.abs(ladoA - ladoC) < 1e-9;
        boolean bc = Math.abs(ladoB - ladoC) < 1e-9;

        if (ab && ac) {
            return "Equilátero";
        } else if (ab || ac || bc) {
            return "Isósceles";
        }

        return "Escaleno";
    }
}
