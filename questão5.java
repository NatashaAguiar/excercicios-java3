package lista2;
import java.util.Scanner;
public class quest�o5 {
public static void main(String[] args) {
		 
	Scanner scan = new Scanner(System.in);
	
int convers�o, dec;
String hexa, octal;
	
	System.out.println("Calculadora de convers�o de base n�mericas!");
	System.out.println("");
	System.out.println("1 para converter de decimal para hexadecimal");
	System.out.println("2 para converter de hexadecimal para decimal");
	System.out.println("3 para converter de decimal para octal");
	System.out.println("4 para converter de octal para decimal");
	System.out.println("");
	System.out.println("Digite um n�mero para escolher a convers�o que desejar.");
	convers�o = scan.nextInt();
	
switch (convers�o) {
case 1: 
	System.out.println("Qual o valor em decimal?");
	dec = scan.nextInt();
	hexa = Integer.toHexString(dec);
	System.out.println("O valor em hexadecimal �: "+hexa);
break;
case 2: 
	System.out.println("Qual o valor em hexadecimal?");
	hexa = scan.next();
	dec = Integer.parseInt(hexa, 16);
	System.out.println("O valor em decimal �: "+dec);
break;
case 3: 
	System.out.println("Qual o valor e, decimal?");
	dec = scan.nextInt();
	octal = Integer.toOctalString(dec);
	System.out.println("O valor em octal �: "+octal);
break; 
case 4: 
	System.out.println("Qual � o valor em octal?");
	octal = scan.next();
	dec = Integer.parseInt(octal, 8);
	System.out.println("O valor em decimal �: "+dec);
default: 
	System.out.println("INFORMA��O N�O V�LIDA");
		}
	}

}
