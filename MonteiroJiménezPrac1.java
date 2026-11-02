/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monteirojiménezprac1;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class MonteiroJiménezPrac1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio 1
        /*Scanner sc = new Scanner(System.in);
        
        double temp=0;
        int cont=1;
        double med=0;
        double tempmen=0;
        double tempan=0;
        System.out.print("Introduce la temperatura: ");
        temp=sc.nextDouble();
        
        while(temp!=-50){
            if (temp<tempmen) {
                tempmen=temp;
            }
            tempan=temp;
            System.out.print("Introduce la temperatura: ");
            temp=sc.nextDouble();
            cont++;
            med=((tempan+temp)/2);
        }
        cont--;
        System.out.println("Han introducido "+cont+" temperaturas");
        System.out.println("La temperatura media ha sido: "+med);
        System.out.println("La temperatura más baja es: "+tempmen);*/
        
        //Ejercicio 2
        
        /*Scanner sc = new Scanner(System.in);
        int cont=0;
        int contt=0;
        int contm=0;
        int contf=0;
        double moto=0;
        double turi=0;
        double fur=0;
        char vehi='a';
        double total=0;
        do{
            System.out.print("Que vehículo ha entrado? ");
            vehi=sc.next().charAt(0);
            cont++;
            switch(vehi){
                case 'M':
                    contm++;
                    moto= moto+1.50;
                    break;
                case 'T':
                    contt++;
                    turi=turi+3.50;
                    break;
                case 'F':
                    contf++;
                    fur=fur+5;
                    break;
                case 'm':
                    contm++;
                    moto= moto+1.50;
                    break;
                case 't':
                    contt++;
                    turi=turi+3.50;
                    break;
                case 'f':
                    contf++;
                    fur=fur+5;
                    break;
                default:
                    System.out.println("Vehículo no valido");
                    cont--;
                    break;
            }
        }while(vehi!='s' && vehi!='S');
        
        total=turi+fur+moto;
        System.out.println("Se ha recaudado: "+total);
        System.out.println("Han  entrado "+cont+" que son "+contm+" motos,"+contt+" turismos y "+contf+" furgonetas");*/
        
        //Ejercicio 3
        
        /*Scanner sc = new Scanner(System.in);
        char tirada='r';
        int maq=(int)(Math.random()*3);
        System.out.println(maq);
        System.out.println("Bienvenido al piedra, papel o tijera");
        do{
                    do{
                        System.out.print("Que has tirado? ");
                        tirada=sc.next().charAt(0);
                        if (tirada!='P' && tirada!='p' && tirada!='R' && tirada!='r' && tirada!='T' && tirada!='t') {
                            System.out.println("Error");
                        }
                    }while(tirada!='P' && tirada!='p' && tirada!='R' && tirada!='r' && tirada!='T' && tirada!='t');
                    if (maq==0) {
                        maq=(char)'r';
                    }else if (maq==1) {
                        maq=(char)'p';
                    }else{
                        maq=(char)'t';
                    }
                    
                    if((tirada=='p' || tirada=='P') && maq=='p'){
                        System.out.println("Ganas");
                    }else if ((tirada=='p' || tirada=='P') && maq=='t') {
                        System.out.println("Pierdes");
                    }else if ((tirada=='p' || tirada=='P') && maq=='r') {
                        System.out.println("Ganas");
                    }else if ((tirada=='r' || tirada=='R') && maq=='r') {
                        System.out.println("Ganas");
                    }else if ((tirada=='r' || tirada=='R') && maq=='t') {
                        System.out.println("Ganas");
                    }else if ((tirada=='r' || tirada=='R') && maq=='p') {
                        System.out.println("Pierdes");
                    }else if ((tirada=='t' || tirada=='T') && maq=='t') {
                        System.out.println("Ganas");
                    }else if ((tirada=='t' || tirada=='T') && maq=='p') {
                        System.out.println("Ganas");
                    }else{
                        System.out.println("Pierdes");
                    }
        }while(tirada=='r' && tirada=='R' && tirada=='p' && tirada=='P' && tirada=='t' && tirada=='T');*/
        
        //Ejercicio 4
        
        /*Scanner sc = new Scanner(System.in);
        double minin=0.10;
        double minsu=0.06;
        int min;
        System.out.print("¿Cuantos minutos has reservado? ");
        min=sc.nextInt();
        if (min<61) {
            System.out.println("Ha costado "+minin+"*"+min+"+4="+(minin*min+4));
        }else{
            System.out.println("Ha costado ("+minsu+"*"+min+")+6+4="+((minsu*min)+6+4));
        }*/
        
        //Ejercicio 5
        
        Scanner sc = new Scanner(System.in);
        int contju=0;
        int edad;
        int total=0;
        System.out.print("Introduce una edad del atendiente: ");
        edad=sc.nextInt();
        
        while(edad!=-1){
            if (edad>65) {
                contju++;
                total=total+4;
            }else if (edad<18) {
                total=total+6;
            }else{
                total=total+12;
            }
            System.out.print("Introduce una edad del atendiente: ");
            edad=sc.nextInt();
        }
        System.out.println("Hay "+contju+" jubilados y se han recaudado: "+total);
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
