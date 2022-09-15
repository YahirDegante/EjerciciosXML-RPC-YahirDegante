package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class RPC_Client {

    public static void main(String[] args) throws IOException, XmlRpcException{
        Scanner sc = new Scanner(System.in);

        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        config.isEnabledForExtensions();
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

//IMC
        System.out.println("El siguiente programa calculara tu Indice de Masa Corporal");
        System.out.println("Escriba su nombre:");
        String name = sc.nextLine();

        System.out.println("Escriba su peso en kg:");
        double weight = sc.nextDouble();

        System.out.println("Escriba su altura en metros:");
        double height = sc.nextDouble();

        Object[] userInfo = {name, weight, height};
        String response = (String) client.execute("Methods.imc", userInfo);
        System.out.println(response);

//Ejercicio 2
        System.out.println("--------------------------------------------------------------");
        System.out.println("El siguiente programa lee 4 numeros y calucula la suma,multiplicacion y el promedio de estos");
        System.out.println("Ingrese el primer número:");
        double numb1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double numb2 = sc.nextDouble();
        System.out.println("Ingrese el tercer número:");
        double numb3 = sc.nextDouble();
        System.out.println("Ingrese el cuarto número:");
        double numb4 = sc.nextDouble();

        Object[] numbs ={numb1,numb2,numb3,numb4};
        String response2 = (String) client.execute("Methods.operaciones",numbs);
        System.out.println(response2);

//Ejercicio 3
        System.out.println("--------------------------------------------------------------");
        System.out.println("El siguiente programa realiza la suma de un rango de numeros");
        System.out.println("Ingrese el valor con la que inicia el rango:");
        int numinf = sc.nextInt();
        System.out.println("Ingrese el valor con la que finaliza el rango:");
        int numsup = sc.nextInt();
        Object[] rango = {numinf, numsup};
        String response3 = (String) client.execute("Methods.sumarango", rango);
        System.out.println(response3);


//Ejercicio 4
        System.out.println("--------------------------------------------------------------");
        Integer[] numbers = new Integer[5];
        System.out.println("El siguiente programa ordena 5 numeros de forma ascendente");
        System.out.println("Ingrese el primer número:");
        numbers[0] = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        numbers[1] = sc.nextInt();
        System.out.println("Ingrese el tercer número:");
        numbers[2] = sc.nextInt();
        System.out.println("Ingrese el cuarto número:");
        numbers[3] = sc.nextInt();
        System.out.println("Ingrese el quinto número:");
        numbers[4] = sc.nextInt();

        Object[] numbersObj = {numbers};
        String response4 = (String) client.execute("Methods.ordenar", numbersObj);
        System.out.println(response4);
    }
}
