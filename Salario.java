package projetos_lpa.aula4;

import java.util.Scanner;

public class Salario {
	public static void main (String[] args) {

	Double horatrab,valorhora,salbruto,salliquido,inss;
	Scanner ler = new Scanner(System.in);
	
	System.out.print("informe as horas de trabalho:");
	horatrab = ler.nextDouble();
	
	System.out.print("informe valor por hora:");
	valorhora = ler.nextDouble();
	
	salbruto = horatrab*valorhora;
	inss = salbruto*0.12;
	salliquido = salbruto - inss;
	
	System.out.println("O salario bruto é " + salbruto);
	System.out.println("O salario liquido é " + salliquido);
	
	}

}
