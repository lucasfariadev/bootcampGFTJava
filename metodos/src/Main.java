public class Main {

    public static void main(String args[]){

        // teste calculadora
        Calculadora calculadora = new Calculadora();

        calculadora.soma(2,3);
        calculadora.subtracao(5,2);
        calculadora.multiplicacao(4,4);

        calculadora.divisao(8,2);

        // Teste Mensagem

        Mensagem mensagem = new Mensagem();

        mensagem.mensagem(9);
        mensagem.mensagem(14);
        mensagem.mensagem(21);

        // Teste Empréstimo

        Emprestimo emprestimo = new Emprestimo();

        emprestimo.calculaEmprestimo(1000, 3);
        emprestimo.calculaEmprestimo(1000, 2);
        emprestimo.calculaEmprestimo(1000, 1);


    }
}
