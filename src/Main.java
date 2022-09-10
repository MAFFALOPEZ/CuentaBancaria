
public class Main {
    public static void main(String[] args) {
        //Instanciar la clase
        Cuenta miCuenta = new Cuenta("123456","ahorro",150000);
        System.out.println("Saldo mínimo: "+miCuenta.getSaldoMinimo());
        miCuenta.consignar(50000);
        System.out.println("Saldo actual: "+miCuenta.getSaldoActual());
        miCuenta.retirar(250000);
        System.out.println("Saldo actual: "+miCuenta.getSaldoActual());
        System.out.println("--------------------------");
        Cuenta suCuenta = new Cuenta("678910","credito",50000);
        System.out.println(suCuenta.toString());
    }
}
