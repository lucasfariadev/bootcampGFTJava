public class Veiculo {
    String modelo;
    String cor;
    int capacidadeTanque;

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    double calculaValorCombustivel(double valor) {
        return capacidadeTanque * valor;
    }


}

class CarroModel extends Veiculo {
    CarroModel(){

    }

    CarroModel(String modelo, String cor, int capacidadeTanque){
        setModelo(modelo);
        setCor(cor);
        setCapacidadeTanque(capacidadeTanque);
    }
}

class Moto extends Veiculo {
    Moto(){

    }

    Moto(String modelo, String cor, int capacidadeTanque){
        setModelo(modelo);
        setCor(cor);
        setCapacidadeTanque(capacidadeTanque);
    }
}

class Caminhao extends Veiculo {

    Caminhao(){

    }

    Caminhao(String modelo, String cor, int capacidadeTanque){
        setModelo(modelo);
        setCor(cor);
        setCapacidadeTanque(capacidadeTanque);
    }
}
