public class Emprestimo {

    public static double getTaxaDuasParcelas(){
        return 0.25;
    }

    public static double getTaxaTresParcelas(){
        return 0.50;
    }

    public static void calculaEmprestimo(double valor, int parcelas){
        double valorFinal = valor;

        if (parcelas == 2){
            valorFinal = valor + (valor * getTaxaDuasParcelas());
        } else if (parcelas == 3){
            valorFinal = valor + (valor * getTaxaTresParcelas());
        }
        double parcelasValor = valorFinal / parcelas;
        System.out.println("O empréstimo de R$" + valor + "em " + parcelas + " parcelas, fica num total de: " + valorFinal);
        System.out.println("Sendo " + parcelas + " de R$" + parcelasValor);
    }
}
