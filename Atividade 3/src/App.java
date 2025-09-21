public class App {
    public static void main(String[] args) throws Exception {
        Moto moto = new Moto("2 rodas", 654987 , "Honda", true, true);

        System.out.println(moto.abastecer());
        System.out.println(moto.buzinar());
        System.out.println(moto.empinar());
        System.out.println(moto.cortarGiro());

        Carro carro = new Carro("4 rodas", 684513 , "Fiat", true);

        System.out.println(carro.abastecer());
        System.out.println(carro.buzinar());
        System.out.println(carro.drift());

    }
}