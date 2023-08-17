package alumnos.Empresa;

import java.util.ArrayList;//Se usa esta importacion para el arreglo
import java.util.List;
import java.util.Scanner;

public class Alumnos {

    private List<Alumno> listaAlumnos=null;
    public Alumnos(){
        listaAlumnos=new ArrayList<>();

    }

    public void agregarAlumno(Alumno item){
        listaAlumnos.add((item));
    }
    public void mostrarTodosAlumnos(){

        listaAlumnos.forEach(item->{
            item.mostrarDataAlumno();
            System.out.println("\n");
        });
    }


    public static void main(String[] args) {
        Alumnos obj=new Alumnos();
        //podemos usar el metodo siquiente pero lo mejor es crear un metodo para agregar
        //obj.listaAlumnos.add(new Alumno(1212,"nuevo","nuevoapellido",25));
        obj.agregarAlumno(new Alumno(4,"juan","ayala",21));
        obj.agregarAlumno(new Alumno(2,"daniel","quinones",21));
        obj.agregarAlumno(new Alumno(1,"lorenzo","rojas",21));
        obj.agregarAlumno(new Alumno(5,"purga","perez",21));
        obj.mostrarTodosAlumnos();

        Scanner scanner = new Scanner(System.in);//instanciamos el scaner

        System.out.println("Ingrese un dato mas agregar");
        String nuevoDato=scanner.nextLine();//escanea la siguiente linea
        System.out.println("El dato es: "+nuevoDato);
    }
}
