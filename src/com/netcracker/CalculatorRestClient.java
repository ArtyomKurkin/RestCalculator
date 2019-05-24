package com.netcracker;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import java.util.Scanner;

public class CalculatorRestClient {

    public static void main(String[] args) {

       /* Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://localhost:8080/rest/calc").path("add").path("7").path("4");
        String response = webTarget.request(MediaType.APPLICATION_JSON).get().readEntity(String.class);
        System.out.println(response);*/

       Client client  = ClientBuilder.newClient();
       WebTarget webTarget = client.target("http://localhost:8080/rest/calc");

        Scanner scanner = new Scanner(System.in);

        int currentNumber=0;
        while(currentNumber != 5){
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println();
            System.out.println("Enter operation:");


            currentNumber = scanner.nextInt();

            if (currentNumber!=5){

                System.out.println("Enter a:");
                Double a =scanner.nextDouble();
                System.out.println("Enter b:");
                Double b =scanner.nextDouble();

                WebTarget newWebTarget=null;

                switch (currentNumber) {
                    case (1):
                        newWebTarget = webTarget.path("add/"+a+"/"+b);
                        break;
                    case (2):
                        newWebTarget = webTarget.path("sub/"+a+"/"+b);
                        break;
                    case (3):
                        newWebTarget = webTarget.path("mult/"+a+"/"+b);
                        break;
                    case (4):
                        newWebTarget = webTarget.path("div/"+a+"/"+b);
                        break;
                }

                if (newWebTarget == null){
                    System.out.println("Enter correct number of operation!");
                    System.out.println();
                }
                else {
                    String response = newWebTarget.request(MediaType.APPLICATION_JSON).get().readEntity(String.class);
                    System.out.println(response);
                    System.out.println();
                }
            }


        }
    }
}
