public class CalculaArea {

    public void calculaArea(double lado){

        double area = Math.pow(lado, 2);
        System.out.println("A área do quadrado é: " + area);
    }

    public void calculaArea(double base, double altura){

        double area = base * altura;
        System.out.println("A área do retângulo é: " + area);
    }

    public void calculaArea(double baseMaior, double baseMenor, double altura){

        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("A área do trapézio é: " + area);
    }

}
