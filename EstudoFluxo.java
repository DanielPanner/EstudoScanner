import java.util.Scanner;

public class EstudoFluxo {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int idade = 0;
		System.out.println("Qual a Sua Idade?");
		idade = scan.nextInt();
		
		System.out.println("Sua idade é " + idade);
		if(idade <= 20) {
        	System.out.println("Você é muito Novo! " );
        }
		        if(idade >= 30) {
	        System.out.println("Você está acima da idade.");
	        
		        
	        }
	        	
	        
	    }
		
		
		
		
	}

