package lista2;
import java.util.Scanner;
public class quest�o4 {
public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);

double v, f, vip;
int cliente;
	
	System.out.println("Qual o valor total da compra?");
	 v = scan.nextDouble();
	System.out.println("Que tipo de comprador voc� �? Digite 1 se for comum, 2 se for funcion�rio e 3 se for vip");
	 cliente = scan.nextInt();
	
switch (cliente) {
case 1:
	System.out.println("O valor final a ser pago ser� R$"+v);
break;
case 2:
	 f = v -  (v*0.1);
	System.out.println("O valor final a ser pago ser� R$"+f +"Voc� recebeu 10% de desconto");
break;
case 3:
	 vip = v - (v*0.05);
	System.out.println("O valor final a ser pago ser� R$"+vip +"Voc� recebeu 5% de desconto");
break;
default: 
	System.out.println("Informa��o n�o v�lida");
	
		
		}
		
	}

}
