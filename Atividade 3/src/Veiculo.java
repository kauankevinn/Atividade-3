public abstract class Veiculo {
    private String tipo;
    private double identificador; 
    private String marca;

    public Veiculo(String tipo, double identificador, String marca){
        this.tipo = tipo;
        this.identificador = identificador;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getIdentificador() {
        return identificador;
    }

    public void setIdentificador(double identificador) {
        this.identificador = identificador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract String buzinar();

    public abstract String abastecer();
}