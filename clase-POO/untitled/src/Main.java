//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Vehiculo vehiculo1= new Vehiculo("Toyota","Corolla",2020);
    Coche coche1 = new Coche("Ford","Mustang",2021,5000);
    System.out.println("detalles de vehiculo 1 :");
    System.out.println(vehiculo1.getMarca()+" "+vehiculo1.getModelo()+" "+vehiculo1.getYear());
    vehiculo1.acelerar();
    vehiculo1.frenar();
    System.out.println("detalles de coche1 : ");
    System.out.println(coche1.getMarca()+" "+coche1.getModelo()+" "+coche1.getYear());
    coche1.acelerar();
    coche1.frenar();
}
