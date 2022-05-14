public class CalculaArea {
    public double calculaArea(double lado){
        return Math.pow(lado, 2);
    }

    public double calculaArea(double base, double altura){
        return base*altura;
    }

    public double calculaArea(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor) * altura)/2;
    }

    public String verifica(int idade){
        if (idade > 18){
            return "Maior de idade";
        }else{
            return "Menor de idade";
        }
    }

}
