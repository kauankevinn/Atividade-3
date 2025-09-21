public class Carro extends Veiculo {
    // Atributos
    private boolean drift;


    // Construtor
    public Carro(String tipo, double identificador, String marca, boolean drift){
        super(tipo, identificador, marca);
        this.drift = drift;
}
    // Métodos
      @Override
      public String buzinar() {
          return "O carro buzina: Honk Honk!";
      }

      @Override
      public String abastecer(){
        return "Completar tanque de 58L de gasosa!";
    }
      
      public String drift() {
        if (drift) {
          return ("Déja Vu!\n" +
                  "I've just been in this place before\n" +
                  "Higher on the street\n" +
                  "And I know it's my time to go");
        } else {
          return "O carro dirige normalmente";
        }
      }
}