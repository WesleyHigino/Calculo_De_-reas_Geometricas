package Calculo;

public class AreaGeometrica {

    // Triângulo
    public double lado1;
    public double lado2;
    public double lado3;
    public double FormulaTriangulo;

    //Quadrado
    public double base;
    public double altura;

    //Circulo
    private double pi = 3.14159265359;
    public double raio;




    // função da area do triangulo
    public double areaTriangulo() {

        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        return FormulaTriangulo = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

    }

    public double areaQuadrado() {

        double area = base * altura;
        return area ;
    }
    public double areaCirculo() {

        double area = pi*(raio*raio);
        return area;
    }



}
