class Carro {
    String modelo;
    String cor;
    int capacidadeTanque;

    Carro(){

    }

    Carro(String modelo, String cor, int capacidadeTanque){
        setModelo(modelo);
        setCor(cor);
        setCapacidadeTanque(capacidadeTanque);
    }


    void setModelo(String modeloCarro) {
        this.modelo = modeloCarro;
    }

    String getModelo() {
        return modelo;
    }

    void setCor(String corCarro) {
        this.cor = corCarro;
    }

    String getCor() {
        return cor;
    }

    void setCapacidadeTanque(int capacidade){
        this.capacidadeTanque = capacidade;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    double valorTotalTanque(double precoCombustivel){
        return capacidadeTanque * precoCombustivel;
    }

}
