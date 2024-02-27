
    public class Persona {
    //Encapsulamiento, ya que pongo privados y estaticos los atributos de Persona, para luego usar set y get
    private static String nombre;
    private static String sexo;
    private static int edad;
    private static double estatura;
    private static double maxDeadLift;
    private static String profesion;
    private static boolean estadoCivil;
    public Persona(String nombre,String sexo,int edad,double estatura,double maxDeadLift,String profesion,boolean estadoCivil){
        this.nombre=nombre;
        this.sexo=sexo;
        this.edad=edad;
        this.estatura=estatura;
        this.maxDeadLift=maxDeadLift;
        this.profesion=profesion;
        this.estadoCivil=estadoCivil;
    }
    //polimorfismo por constructores, ya que al tener varios constructores
    //dependiendo de los atributos pasados va a instanciar una persona con los parametros y los predefinidos
    public Persona(String nombre,String sexo,int edad,double estatura){
        this.nombre=nombre;
        this.sexo=sexo;
        this.edad=edad;
        this.estatura=estatura;
        this.maxDeadLift=60.5;
        this.profesion="Estudiante";
        this.estadoCivil=false;
    }
    //metodos para evidenciar polimorfismo por el atributo profesion y maxDeadLift
    public static void fuerza(){
        if(Persona.maxDeadLift>=150){
            System.out.println("Es un "+Persona.profesion+" Muy Muy fuerte, fuertisimo, porque levanta "+Persona.maxDeadLift);
            
        }
        else if(Persona.maxDeadLift<150 && Persona.maxDeadLift >=100){
            System.out.println("Es un "+Persona.profesion+" Fuerte, porque levanta "+Persona.maxDeadLift);
        }
        else{
            System.out.println("Es un "+Persona.profesion+" Normal en terminos de fuerza, porque levanta "+Persona.maxDeadLift);
        }
    }
    
    public static void profesion(){
        System.out.println("Esta persona es un "+Persona.profesion);
    }
    
    public static void casado(){
        if(Persona.estadoCivil==true){
            System.out.println("Esta persona está casada");            
        }
        else{
            System.out.println("Esta persona NO está casada ó enviudo");
        }
    }

    //Setters y getters, ya que son estaticas y privadas toca definirlos para luego llamarlos desde otra clase, estos son metodos, por eso es posible llamarlos desde otra clase
    public static java.lang.String getNombre() {
        return nombre;
    }

    public static void setNombre(java.lang.String nombre) {
        Persona.nombre = nombre;
    }

    public static java.lang.String getSexo() {
        return sexo;
    }

    public static void setSexo(java.lang.String sexo) {
        Persona.sexo = sexo;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        Persona.edad = edad;
    }

    public static double getEstatura() {
        return estatura;
    }

    public static void setEstatura(double estatura) {
        Persona.estatura = estatura;
    }

    public static double getMaxDeadLift() {
        return maxDeadLift;
    }

    public static void setMaxDeadLift(double maxDeadLift) {
        Persona.maxDeadLift = maxDeadLift;
    }

    public static java.lang.String getProfesion() {
        return profesion;
    }

    public static void setProfesion(java.lang.String profesion) {
        Persona.profesion = profesion;
    }

    public static boolean isEstadoCivil() {
        return estadoCivil;
    }

    public static void setEstadoCivil(boolean estadoCivil) {
        Persona.estadoCivil = estadoCivil;
    }
}


