import java.util.Scanner;
public class numeros {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n, i=0, p=0, pr=0, impar=0;
		do {
			System.out.println("Digite um numero:");
			n = sc.nextInt();
			if(n%2==0){
				pr = pr+n;
				p++;
			}else{
				impar = impar+n;
				i++;
			}
		
		}while(p!=10);
		System.out.println("A soma de pares e " + pr);
		if(impar!=0){
			System.out.println("A media de impares e " + impar/i);
		}
	}
	}
