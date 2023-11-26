package conversores;

import java.util.Scanner;

public class Calculadora {

    private static Scanner scan = new Scanner(System.in);
    static double value1, value2, resultado = 0;
    static char operacao = ' ';
	static boolean operacaoValida = false;

    public static void calcular() {
	    
	    System.out.print("Digite o primeiro valor: ");
	    value1 = scan.nextDouble();
	    System.out.print("Digite a operação: ");
	    operacao = scan.next().charAt(0);
	    System.out.print("Digite o segundo valor: ");
	    value2 = scan.nextDouble();
	    
	    while (true) {
	    
    	    switch(operacao) {
    	        case '+':
    	            resultado = value1 + value2;
    	            operacaoValida = true;
    	            break;
    	        case '-':
    	            resultado = value1 - value2;
    	            operacaoValida = true;
    	            break;
    	        case '*':
    	            resultado = value1 * value2;
    	            operacaoValida = true;
    	            break;
    	        case '/':
    	            resultado = value1 / value2;
    	            operacaoValida = true;
    	            break;
    	        case '^':
    	            resultado = Math.pow(value1, value2);
                    operacaoValida = true;
                    break;
    	        default:
    	            System.out.println("Operação invalida!");
    	            operacaoValida = false;
    	            break;
    	    }
    	    
    	    if(operacaoValida) {
    	    
        	    System.out.println("O resultado é: " + resultado + "\n");
        	    
        	    System.out.print("O que deseja fazer com o valor? [+, -, *, /, ^, F(finalizar): ");
                operacao = scan.next().charAt(0);
                operacao = String.valueOf(operacao).toUpperCase().charAt(0);
                if(operacao == 'F' && operacao != '+' && operacao != '-' && operacao != '/' && operacao != '*' && operacao != '^') {
                    break;
                }
                value1 = resultado;
                System.out.print("Digite o segundo valor: ");
                value2 = scan.nextDouble();
                scan.next();
            
    	    } else {
    	        break;
    	    }
	    }
	    
	    System.out.println("O resultado final foi: " + resultado + "\n");

    }
    
}
