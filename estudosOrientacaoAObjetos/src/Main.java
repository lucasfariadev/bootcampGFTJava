public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("carro 1:");
        Carro carro = new Carro("Tesla","Branco", 30);
        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.valorTotalTanque(7.50));

        System.out.println();
        System.out.println("carro 2:");
        Carro carro2 = new Carro("Gol","Vermelho", 80);
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.valorTotalTanque(7.50));

        System.out.println();
        System.out.println("carro 3:");
        CarroModel carro3 = new CarroModel("Fusca", "azul", 60);
        System.out.println(carro3.getModelo());
        System.out.println(carro3.getCor());
        System.out.println(carro3.getCapacidadeTanque());
        System.out.println(carro3.calculaValorCombustivel(7.50));

        System.out.println();
        System.out.println("moto :");
        Moto moto = new Moto("Fazer", "vermelha", 35);
        System.out.println(moto.getModelo());
        System.out.println(moto.getCor());
        System.out.println(moto.getCapacidadeTanque());
        System.out.println(moto.calculaValorCombustivel(7.50));

        System.out.println();
        System.out.println("caminhao :");
        Caminhao caminhao = new Caminhao("Bitrem", "prata", 200);
        System.out.println(caminhao.getModelo());
        System.out.println(caminhao.getCor());
        System.out.println(caminhao.getCapacidadeTanque());
        System.out.println(caminhao.calculaValorCombustivel(7.50));

        //upcast
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        //downcast
        Gerente gerente = (Gerente) new Funcionario();





    }

}
