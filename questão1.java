package lista2;
import java.util.Scanner; 
public class quest�o1 {
public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
int n�mero_c;
double valor_t, sal�rio_f, comiss�o, sal�rio;
	
	System.out.println("Quantos carros foram vendidos?");
	n�mero_c = scan.nextInt();
	
	System.out.println("Qual valor total das vendas?");
	valor_t = scan.nextDouble();
	
	System.out.println("Qual seu sal�rio fixo?");
	sal�rio_f = scan.nextDouble();
	
	System.out.println("Qual sua comiss�o por carro?");
	comiss�o = scan.nextDouble(); 
	
	sal�rio = sal�rio_f+(comiss�o*n�mero_c)+(valor_t*0.05);
	
	System.out.println("Seu sal�rio final ser� de: "+sal�rio);
	
	
	}

}
