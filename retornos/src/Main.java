public class Main {
    public static void main(String[] args) {

        CalculaArea calculaArea = new CalculaArea();
        System.out.println("A área do quadrado é: " + calculaArea.calculaArea(2));
        System.out.println("A área do retângulo é: " + calculaArea.calculaArea(2,3));
        System.out.println("A área do trapézio é: " + calculaArea.calculaArea(5, 3, 6));

        calculaArea.verifica(9);

    }
}
