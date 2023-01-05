package lista2;
import java.util.Scanner; 
public class questão1 {
public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
int número_c;
double valor_t, salário_f, comissão, salário;
	
	System.out.println("Quantos carros foram vendidos?");
	número_c = scan.nextInt();
	
	System.out.println("Qual valor total das vendas?");
	valor_t = scan.nextDouble();
	
	System.out.println("Qual seu salário fixo?");
	salário_f = scan.nextDouble();
	
	System.out.println("Qual sua comissão por carro?");
	comissão = scan.nextDouble(); 
	
	salário = salário_f+(comissão*número_c)+(valor_t*0.05);
	
	System.out.println("Seu salário final será de: "+salário);
	
	
	}

}
