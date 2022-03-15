public class Carro {

    private String marca;
    protected double blindagem;
    protected boolean combate;
    private int qtdPassageiros;


    public Carro(String marca, int qtdPassageiros) {
        this.marca = marca;
        this.blindagem = 0;
        this.combate = false;
        this.qtdPassageiros = qtdPassageiros;
    }

    public Carro(String marca, int qtdPassageiros, boolean combate) {
        this.marca = marca;
        this.blindagem = 0;
        this.combate = combate;
        this.qtdPassageiros = qtdPassageiros;
    }

    public Carro(String marca){
        this.marca=marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getBlindagem() {
        return blindagem;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public void getInfo() {
        System.out.println("\nMarca: " + getMarca());
        System.out.println("Combate: " + this.combate);
        System.out.println("Quantidade de passageiros: " + this.qtdPassageiros);
        System.out.println("Blindagem: " + this.blindagem);
    }
}
