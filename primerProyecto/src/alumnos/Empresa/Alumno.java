package alumnos.Empresa;

public class Alumno {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    public Alumno(int id,String nombre,String apellido,int edad){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    //getter
    public int getId(){return this.id;};
    public String getNombre(){return this.nombre;}
    public String getApellido(){return this.apellido;}
    public int getEdad(){return this.edad;}

    public void setId(int id){this.id=id;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setApellido(String apellido){this.apellido=apellido;}
    public void setEdad(int edad){this.edad=edad;}
//metodos

    public void mostrarDataAlumno(){
        System.out.println("Id: "+this.id);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("Edad: "+this.edad);
    }

}
