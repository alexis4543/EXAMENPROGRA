//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

CuentaAcceso cuenta1 =new CuentaAcceso(1,"Alexis Quisilema");
CuentaAcceso cuenta2 =new CuentaAcceso(2,"Juan");


    System.out.println("------DATOS DE LAS CUENTA 1");
    System.out.println("El nombre de la cuenta1   es "+cuenta1.getNombreUsuario());
    System.out.println("El ID de la cuenta es;"+cuenta1.getIdentificador());


    System.out.println("------DATOS DE LAS CUENTA 2");
    System.out.println("El nombre de la cuenta2   es "+cuenta2.getNombreUsuario());
    System.out.println("El ID de la cuenta es;"+cuenta2.getIdentificador());



}
