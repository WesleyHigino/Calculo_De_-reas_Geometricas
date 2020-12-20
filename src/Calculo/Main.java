package Calculo;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Os valores foram formatados para uma casa decimal.
        DecimalFormat saida = new DecimalFormat("0.0");

        int opcaoGeometrica ;
        int opcaoUnidade;
        boolean sair = false ;


        AreaGeometrica trinangulo = new AreaGeometrica();
        AreaGeometrica quadrado = new AreaGeometrica();
        AreaGeometrica circulo = new AreaGeometrica();




        while (sair == false) {

            System.out.println("-----------------------------------------------------------");
            System.out.println("Escolha a opção geometrica desejada para calcular a Área:");
            System.out.println("(1)TRIÂNGULO (2)QUADRADO (3)CIRCULO");
            opcaoGeometrica = sc.nextInt();
            System.out.println("-----------------------------------------------------------");

            /*Caso o (numero) for diferente das opção de áreas geometricas listadas,o pragarama irá pedir para o usuario
            tentar novamente.*/

            while (opcaoGeometrica < 1 || opcaoGeometrica > 3) {
                System.out.println("Opção invalida !tente novamente");
                System.out.println("(1)TRIÂNGULO (2)QUADRADO (3)CIRCULO");
                opcaoGeometrica = sc.nextInt();
            }

            switch (opcaoGeometrica) {

                //Opção para o calculo de área do triângulo.

                case 1:
                    System.out.println("Digite a unidade de medida:");
                    System.out.println("(1)Metro (2)Centimetro (3)Milimetro");
                    opcaoUnidade = sc.nextInt();

                    /*Caso o (numero) for diferente das opção para unidade de medidas listadas,o pragarama irá pedir para o usuario
                    tentar novamente.*/
                    while (opcaoUnidade < 1 || opcaoUnidade > 3) {
                        System.out.println("Opção invalida !tente novamente");
                        System.out.println("(1)Metro (2)Centimetro (3)Milimetro");
                        opcaoUnidade = sc.nextInt();
                    }
                    System.out.println("Digite as medidas correspondentes aos três lados do triângulo:");
                    if (opcaoUnidade == 1) {
                        System.out.println((trinangulo.lado1 = sc.nextDouble()) + " m²");
                        System.out.println((trinangulo.lado2 = sc.nextDouble()) + " m²");
                        System.out.println((trinangulo.lado3 = sc.nextDouble()) + " m²");
                        System.out.println("");
                        System.out.println("A area do triângulo é de : " + saida.format(trinangulo.areaTriangulo()) + " m²");
                    } else if (opcaoUnidade == 2) {
                        System.out.println((trinangulo.lado1 = sc.nextDouble()) + " cm²");
                        System.out.println((trinangulo.lado2 = sc.nextDouble()) + " cm²");
                        System.out.println((trinangulo.lado3 = sc.nextDouble()) + " cm²");
                        System.out.println("");
                        System.out.println("A area do triângulo é de : " + saida.format(trinangulo.areaTriangulo()) + " cm²");
                    } else if (opcaoUnidade == 3) {
                        System.out.println((trinangulo.lado1 = sc.nextDouble()) + " mm²");
                        System.out.println((trinangulo.lado2 = sc.nextDouble()) + " mm²");
                        System.out.println((trinangulo.lado3 = sc.nextDouble()) + " mm²");
                        System.out.println("");
                        System.out.println("A area do triângulo é de : " + saida.format(trinangulo.areaTriangulo()) + " mm²");
                    }
                    break;


                //Opção para calculo de área do quadrado.
                case 2:
                    System.out.println("Digite a unidade de medida:");
                    System.out.println("(1)Metro (2)Centimetro (3)Milimetro");
                    opcaoUnidade = sc.nextInt();

                    /*Caso o (numero) for diferente das opção para unidade de medidas listadas,o pragarama irá pedir para o usuario
                    tentar novamente.*/
                    while (opcaoUnidade < 1 || opcaoUnidade > 3) {
                        System.out.println("Opção invalida !tente novamente");
                        System.out.println("(1)Metro (2)Centimetro (3)Milimetro");
                        opcaoUnidade = sc.nextInt();
                    }
                    System.out.println("Digite a Base e a Altura :");
                    if (opcaoUnidade == 1) {
                        System.out.println((quadrado.base = sc.nextDouble()) + " m²");
                        System.out.println((quadrado.altura = sc.nextDouble()) + " m²");
                        System.out.println("");
                        System.out.println("A area do quadrado é de:" + " " + saida.format(quadrado.areaQuadrado()) + " m²");
                    } else if (opcaoUnidade == 2) {
                        System.out.println((quadrado.base = sc.nextDouble()) + " cm²");
                        System.out.println((quadrado.altura = sc.nextDouble()) + " cm²");
                        System.out.println("");
                        System.out.println("A area do quadrado é de:" + " " + saida.format(quadrado.areaQuadrado()) + " cm²");

                    } else if (opcaoUnidade == 3) {
                        System.out.println((quadrado.base = sc.nextDouble()) + " mm²");
                        System.out.println((quadrado.altura = sc.nextDouble()) + " mm²");
                        System.out.println("");
                        System.out.println("A area do quadrado é de:" + " " + saida.format(quadrado.areaQuadrado()) + " mm²");
                    }
                    break;


                //Opção para o calculo de área do círculo.
                case 3:
                    System.out.println("Digite a unidade de medida:");
                    System.out.println("(1)Metro (2)Centimetro (3)Milimetro");
                    opcaoUnidade = sc.nextInt();

                    /*Caso o (numero) for diferente das opção para unidade de medidas listadas,o pragarama irá pedir para o usuario
                    tentar novamente.*/
                    while (opcaoUnidade < 1 || opcaoUnidade > 3) {
                        System.out.println("Opção invalida !tente novamente");
                        System.out.println("(1)Metro (2)Centimetro (3)Milimetro");
                        opcaoUnidade = sc.nextInt();
                    }
                    System.out.println("Digite o raio do circulo :");
                    if (opcaoUnidade == 1) {
                        System.out.println((circulo.raio = sc.nextDouble()) + " m²");
                        System.out.println("");
                        System.out.println("A area do circulo é de:" + " " + saida.format(circulo.areaCirculo()) + " m²");

                    } else if (opcaoUnidade == 2) {
                        System.out.println((circulo.raio = sc.nextDouble()) + "cm²");
                        System.out.println("");
                        System.out.println("A area do circulo é de:" + " " + saida.format(circulo.areaCirculo()) + " cm²");

                    } else if (opcaoUnidade == 3) {
                        System.out.println((circulo.raio = sc.nextDouble()) + "mm²");
                        System.out.println("");
                        System.out.println("A area do circulo é de:" + " " + saida.format(circulo.areaCirculo()) + " mm²");

                    }
                    break;

            }

//          /*Se o usuario deseja continuar a operação ele ira digitar (1) e caso queira encerrar o programa ele digitara
//            o numereo (0). */
            System.out.println("Deseja continuar a operação ? digite(1) para continuar e (0) para sair.");
            if(sc.nextInt() ==1) {
                sair = false;
            }else{
                sair = true;
            }


        }

        }


    }
