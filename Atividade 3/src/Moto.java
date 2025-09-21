public class Moto extends Veiculo{
    private boolean empinar;
    private boolean cortarGiro;

    public Moto(String tipo, double identificador, String marca, boolean empinar, boolean cortarGiro){
        super(tipo, identificador, marca);
        this.empinar = empinar;
        this.cortarGiro = cortarGiro;
    }

    public String empinar(){
        if (empinar == true) {
            return "A moto da aquela empinada: Vrum Vrum!";
        }else{
            return "A moto não empina";
        }
    }

    public String cortarGiro(){
        if (cortarGiro == true) {
            return "A moto Corta: RunDanDan PÁ!";
        }else{
            return "O entregador fica tiste ;-;";
        }
    }

    @Override
    public String buzinar(){
        return "A moto buzina: Pi Pi";
    }

    @Override
    public String abastecer(){
        return "Completar tanque de 13L de gasosa!";
    }
}