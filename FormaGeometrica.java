
public abstract class FormaGeometrica {

    public abstract double getArea();

    public abstract double getPerimetro();

    // Sobrecarga: retorna a área arredondada
    public double getArea(int casasDecimais) {
        return arredondar(getArea(), casasDecimais);
    }

    // Sobrecarga: retorna o perímetro arredondado
    public double getPerimetro(int casasDecimais) {
        return arredondar(getPerimetro(), casasDecimais);
    }

    private double arredondar(double valor, int casasDecimais) {
        if (casasDecimais < 0 || casasDecimais > 10) {
            throw new IllegalArgumentException(
                "Use de 0 a 10 casas decimais."
            );
        }

        double fator = Math.pow(10, casasDecimais);
        return Math.round(valor * fator) / fator;
    }
}
