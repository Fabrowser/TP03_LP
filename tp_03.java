
import java.util.Scanner;

public class tp_03{
	
	public static void main(String[] args){
		
		int hora=0;
		int minutos=0;
		int segundos=0;
		
		Scanner scan= new Scanner(System.in); 

	
		
		while(hora>23 | hora <1){		
		System.out.println("Digite a hora:  ");
		hora = scan.nextInt();
			}
		
		while(minutos<1 | minutos>59){
		System.out.println("Digite os minutos:  ");
		minutos = scan.nextInt();
		}

		while(segundos<1 | segundos>59){	
		System.out.println("Digite os segundos:  ");
		segundos = scan.nextInt();
					}
					

		
							
		System.out.println(hora + ":"+ 
						   minutos + ":"+
						   segundos);
		
		
				
		}
	}
