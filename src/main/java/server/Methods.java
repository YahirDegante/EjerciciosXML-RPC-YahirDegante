package server;

import java.io.IOException;
import java.util.Arrays;

public class Methods {
    public double addition(double num1, double num2) {
        return num1+num2;
    }

    public String imc(String name, double weight, double height){

        double imc = weight / (height * height);
        return "Hola "+name+" tu IMC es "+imc;
    }

    public String operaciones (double numb1, double numb2, double numb3, double numb4) {
        double producto = numb1*numb2*numb3*numb4;
        double suma = numb1+numb2+numb3+numb4;
        double promedio = (numb1+numb2+numb3+numb4) / 4;
        return "Hola, el producto es: "+producto+" , la sumas es: "+suma+" y el promedio es: "+promedio;
    }


    public String sumarango(int numinf, int numsup) {
        int suma= 0;
        if (numinf > numsup) {
            return "Error, el límite inferior es mayor al límite superior.";
        }
        for (int i=numinf; i<=numsup; i++) suma+=i;
        return "La suma del rango entre el numero: "+numinf+" y el numero: "+numsup+ " es: "+suma;
    }


    public String ordenar(Object[] numbers) throws IOException, ClassNotFoundException {
        Arrays.sort(numbers);
        String mensaje = "Los numeros ordenados son los siguientes: \n";
        for (Object number : numbers) {
            mensaje += " " + number;
        }
        return mensaje;
    }


}
