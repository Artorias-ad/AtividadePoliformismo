import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Coleção de objetos usando o tipo da classe abstrata
        ArrayList<FormaGeometrica> figuras = new ArrayList<>();

        // Upcasting: cada objeto é armazenado como FormaGeometrica
        FormaGeometrica f1 = new Triangulo(3, 4, 5);
        FormaGeometrica f2 = new Retangulo(5, 3);
        FormaGeometrica f3 = new Circunferencia(4);
        FormaGeometrica f4 = new Pentagono(6);

        figuras.add(f1);
        figuras.add(f2);
        figuras.add(f3);
        figuras.add(f4);

        // Polimorfismo: não precisamos verificar o tipo da figura
        System.out.println("=== ÁREA E PERÍMETRO DAS FIGURAS ===");

        for (FormaGeometrica figura : figuras) {
            System.out.println(
                "Área: " + figura.getArea(2)
                + " | Perímetro: " + figura.getPerimetro(2)
            );
        }

        // Sobrecarga: usando os métodos sem argumentos
        System.out.println("\n=== EXEMPLO DE SOBRECARGA ===");

        System.out.println("Área do triângulo: " + f1.getArea());
        System.out.println("Área arredondada: " + f1.getArea(3));

        System.out.println(
            "Perímetro do retângulo: " + f2.getPerimetro()
        );

        System.out.println(
            "Perímetro arredondado: " + f2.getPerimetro(1)
        );

        // instanceof e downcasting para acessar métodos específicos
        mostrarDiametros(figuras);

        // Demonstra os métodos exclusivos das classes derivadas
        mostrarInformacoesEspecificas(figuras);
    }

    public static void mostrarDiametros(
            ArrayList<FormaGeometrica> figuras) {

        System.out.println("\n=== DIÂMETROS DAS CIRCUNFERÊNCIAS ===");

        for (FormaGeometrica figura : figuras) {
            if (figura instanceof Circunferencia) {

                // Downcasting
                Circunferencia c = (Circunferencia) figura;

                System.out.println(
                    "Diâmetro: " + c.getDiametro()
                );
            }
        }
    }

    public static void mostrarInformacoesEspecificas(
            ArrayList<FormaGeometrica> figuras) {

        System.out.println("\n=== INFORMAÇÕES ESPECÍFICAS ===");

        for (FormaGeometrica figura : figuras) {

            if (figura instanceof Triangulo) {
                Triangulo t = (Triangulo) figura;

                System.out.println(
                    "Tipo de triângulo: " + t.getTipoTriangulo()
                );

            } else if (figura instanceof Retangulo) {
                Retangulo r = (Retangulo) figura;

                System.out.println(
                    "É quadrado? " + r.isQuadrado()
                );

            } else if (figura instanceof Circunferencia) {
                Circunferencia c = (Circunferencia) figura;

                System.out.println(
                    "Diâmetro: " + c.getDiametro()
                );

            } else if (figura instanceof Pentagono) {
                Pentagono p = (Pentagono) figura;

                System.out.println(
                    "Número de lados: " + p.getNumeroLados()
                );
            }
        }
    }
}
