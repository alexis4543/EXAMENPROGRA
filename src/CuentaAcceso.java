public class CuentaAcceso {
    private int identificador;
    private String nombreUsuario;
    private  int contadorincorrecto;
    private static int contadorcuentas = 0;


    //CREAMOS CONSTRUCOR


    public CuentaAcceso(int identificador, String nombreUsuario) {
        contadorincorrecto = 0;
        if (identificador < 0){
            System.out.println("El identificacor no puede ser un numero negativo");
        }else {
            this.identificador = identificador;
            this.nombreUsuario = nombreUsuario;
           // contadorcuentas ++;
        }

    }



    //getter

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public static int getContadorcuentas() {
        return contadorcuentas;
    }



    public int getIdentificador() {
        return identificador;
    }

    //setter
    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.isBlank()){
            System.out.println("El nombre no puede estar vacio ni ser null");
        }else{
            this.nombreUsuario = nombreUsuario;
        }
    }


    //metodos



    public static int getContadorCuentas(){
        return contadorcuentas;
    }

    public void RegistrarIntento(boolean correcto){
    if (correcto){
        contadorincorrecto =0;
        System.out.println("REGITRO TRUE");

    }else {
        contadorincorrecto ++;
        System.out.println("REGISTRO FALSE");
    }
        if (contadorincorrecto >= 3){
            System.out.println("CUENTA BLOQUEADA");
        }
    }





}
