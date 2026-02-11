import javax.sound.midi.SysexMessage;

public class Coche extends Vehiculo{
private int cilindrada;
    public Coche(String marca, String modelo, int year, int cilindrada) {
        super(marca, modelo, year);
        this.cilindrada = cilindrada;
    }

    @Override
    public void acelerar(){
        System.out.println("Este Coche esta acelerando");
    }



    @Override
    public void frenar(){
        System.out.println("Este Coche esta frenando");
    }
}

