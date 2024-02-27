public class ObjetosDePersona {
    public static void main(String[] args) {
        //instanciamos la primera persona con uno de los constructores
        //entonces herencian los atributos y metodos de la clase persona, los set y get tambien son metodos
        Persona persona1=new Persona("Daniel","Masculino",40,1.85,100,"Administrativo",false);
        System.out.println("Datos de "+persona1.getNombre());
        System.out.println("Sexo: "+persona1.getSexo());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Estatura: "+persona1.getEstatura());
        //acá aunque como parametro tenga false en estado civil, esta persona yo quiero que este casada, entonces voy a ulitizar el set
        persona1.setEstadoCivil(true);
        persona1.profesion();
        persona1.fuerza();
        persona1.casado();// acá va a cambiar el resultado que era false ya que le cambie el valor por medio del set a true
        
        //Vamos a usar el otro constructor
        Persona persona2=new Persona("Maria","Femenino",19,1.75);
        System.out.println("Datos de "+persona1.getNombre());
        System.out.println("Sexo: "+persona1.getSexo());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Estatura: "+persona1.getEstatura());
        persona2.setMaxDeadLift(75.55);
        persona2.profesion();
        persona2.fuerza();
        persona2.casado();
        
        //acá tambien unamos el segundo constuctor para ver más claro
        Persona persona3=new Persona("Jaime","Masculino",38,1.65);
        System.out.println("Datos de "+persona1.getNombre());
        System.out.println("Sexo: "+persona1.getSexo());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Estatura: "+persona1.getEstatura());
        persona3.setProfesion("Profesor");
        //acá en el constructor 2, como no se da el parametro de estadoCivil se pone desde el construcutor como false
        //pero esta persona tambien quiero que este casada, esto para demostrar que el set aplica para ambos constructores
        persona3.setEstadoCivil(true);
        persona3.profesion();
        persona3.fuerza();
        persona3.casado();// acá va a cambiar el resultado que era false ya que le cambie el valor por medio del set a true
        
    }
}