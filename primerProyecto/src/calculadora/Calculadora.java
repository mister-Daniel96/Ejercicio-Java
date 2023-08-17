package calculadora;

import java.util.ArrayList;//Se usa esta importacion para el arreglo
import java.util.List;
import java.util.ArrayList;

public class Calculadora {

    private List<String> operacion=null;
    private double a;
    private double b;
    public Calculadora(double a, double b){
        this.a=a;
        this.b=b;
        this.operacion=new ArrayList<>();
        operacion.add("suma");
        operacion.add("resta");
        operacion.add("multiplicacion");
        operacion.add("division");
    }
    public double calcular(String operacion){
        double resultado=0;
        if(operacion.contains(operacion.toLowerCase())){
            switch (operacion.toLowerCase()){
                case "suma":resultado= this.a+this.b;break;
                case "resta":resultado= this.a-this.b;break;
                case "multiplicacion":resultado= this.a*this.b;break;
                case "division":resultado=this.a/this.b;break;
            }
        }else{System.out.println("No existe la operacion");}
            return resultado;
    }

    public static void main(String[] args) {
        Calculadora operar=new Calculadora(4,5);
        System.out.println(operar.calcular("suma"));
        System.out.println(operar.calcular("resta"));
        System.out.println(operar.calcular("multiplicacion"));
        System.out.println(operar.calcular("division"));
    }
}
