package lista2;
import java.util.Scanner;
public class questão5 {
public static void main(String[] args) {
		 
	Scanner scan = new Scanner(System.in);
	
int conversão, dec;
String hexa, octal;
	
	System.out.println("Calculadora de conversão de base númericas!");
	System.out.println("");
	System.out.println("1 para converter de decimal para hexadecimal");
	System.out.println("2 para converter de hexadecimal para decimal");
	System.out.println("3 para converter de decimal para octal");
	System.out.println("4 para converter de octal para decimal");
	System.out.println("");
	System.out.println("Digite um número para escolher a conversão que desejar.");
	conversão = scan.nextInt();
	
switch (conversão) {
case 1: 
	System.out.println("Qual o valor em decimal?");
	dec = scan.nextInt();
	hexa = Integer.toHexString(dec);
	System.out.println("O valor em hexadecimal é: "+hexa);
break;
case 2: 
	System.out.println("Qual o valor em hexadecimal?");
	hexa = scan.next();
	dec = Integer.parseInt(hexa, 16);
	System.out.println("O valor em decimal é: "+dec);
break;
case 3: 
	System.out.println("Qual o valor e, decimal?");
	dec = scan.nextInt();
	octal = Integer.toOctalString(dec);
	System.out.println("O valor em octal é: "+octal);
break; 
case 4: 
	System.out.println("Qual é o valor em octal?");
	octal = scan.next();
	dec = Integer.parseInt(octal, 8);
	System.out.println("O valor em decimal é: "+dec);
default: 
	System.out.println("INFORMAÇÃO NÃO VÁLIDA");
		}
	}

}
