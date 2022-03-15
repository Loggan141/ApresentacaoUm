public class Main {

    public static void main(String[] args) {

        CarroDeCombate tank = new CarroDeCombate("Renault", 100);
        CarroDeCombate tank2 = new CarroDeCombate("Toyota", 20);

        tank.darPartida();
        tank.getInfo();
        tank2.darPartida();
        tank2.getInfo();

        tank.atacar(tank2);

        tank.getInfo();
        tank2.getInfo();

        EtapasAtaque etapas=EtapasAtaque.APONTAR;
        System.out.println(etapas.getValue());

        System.out.println("Segundo commit Para dar Merge");

      }

  }
