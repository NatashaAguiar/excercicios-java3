package lista2;
import java.util.Scanner;
public class quest�o3 {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
int qa, qm, qn, m�dia;
	
	System.out.println("Qual a quantidade atual do produto no estoque?");
	 qa = scan.nextInt();
	System.out.println("Qual a quantidade m�xima do produto no estoque?");
	 qm = scan.nextInt();
	System.out.println("Qual a quantidade m�nima do produto no estoque?");
	 qn = scan.nextInt();
	
	 m�dia = (qm+qn)/2;
	System.out.println("A quantidade m�dia de produtos no estoque �: "+m�dia);
	
	if (qa>=m�dia) {
	System.out.println("N�o efetuar a compra!");
	}
	else if(qa<=m�dia) {
	System.out.println("Efetuar a comprar!");
	}
	}

}
