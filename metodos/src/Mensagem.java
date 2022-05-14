public class Mensagem {

    public static void mensagem(int hora){
        if (hora < 12){
            System.out.println("Muito Bom dia!");
        } else if (hora < 18){
            System.out.println("Muito Boa tarde!");
        } else{
            System.out.println("Muito Boa noite!");
        }
    }
}
