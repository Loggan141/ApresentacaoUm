import java.util.Random;

public class CarroDeCombate extends Carro implements MaquinaCombustao{

    public int calculadoraDeDano(){
        Random random=new java.util.Random();
        return random.nextInt(10);
    }

    final int MAX_ARMAMENTO=50;
    final int MIN_ARMAMENTO=0;
    private int qtdArmamento;

    @Override
    public void darPartida() {
        System.out.println("****Motores ligados****");
    }

    CarroDeCombate(String marca, int qtdArmamento){
        super(marca);
        if(qtdArmamento>MAX_ARMAMENTO) {
            this.qtdArmamento = 50;
        }else{
            this.qtdArmamento=qtdArmamento;
        }
        blindagem=100;
        combate=true;
        setQtdPassageiros(2);
    }

    public boolean atacar(CarroDeCombate combate){
        this.qtdArmamento=qtdArmamento-1;
        combate.blindagem-=calculadoraDeDano();
        for (EtapasAtaque e1 : EtapasAtaque.values()) {
            System.out.println(e1);
        }
        return true;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("Quantidade de munição: "+qtdArmamento);
        System.out.println("Maquina de combustao: "+MaquinaCombustao.MOTOR);
        System.out.println();
    }
}
