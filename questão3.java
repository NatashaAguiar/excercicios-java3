package lista2;
import java.util.Scanner;
public class questão3 {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
int qa, qm, qn, média;
	
	System.out.println("Qual a quantidade atual do produto no estoque?");
	 qa = scan.nextInt();
	System.out.println("Qual a quantidade máxima do produto no estoque?");
	 qm = scan.nextInt();
	System.out.println("Qual a quantidade mínima do produto no estoque?");
	 qn = scan.nextInt();
	
	 média = (qm+qn)/2;
	System.out.println("A quantidade média de produtos no estoque é: "+média);
	
	if (qa>=média) {
	System.out.println("Não efetuar a compra!");
	}
	else if(qa<=média) {
	System.out.println("Efetuar a comprar!");
	}
	}

}
