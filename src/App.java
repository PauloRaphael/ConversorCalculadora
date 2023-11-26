import java.util.Scanner;
import conversores.Conversor;
import conversores.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        String continuar = " ";
        int operacao, converter = 0;

        while(true) {

            System.out.println("Qual calculadora deseja acessar?");
            System.out.println("Calcular[1]\nConversor de valores[2]");
            operacao = scan.nextInt();
        
            if(operacao == 1) {
                Calculadora.calcular();
            } else {
                System.out.println("Converter moedas[1]\nConverter peso[2]\nConverter distancia[3]\nConverter horarios[4]\n");
                converter = scan.nextInt();
                switch(converter) {
                    case 1:
                        Conversor.converterMoedas();
                        break;
                    case 2:
                        Conversor.converterPeso();
                        break;
                    case 3:
                        Conversor.converterDistancia();
                        break;
                    case 4:
                        Conversor.converterHorario();
                        break;
                }
            }

            System.out.print("Deseja continuar usando o convesor/calculadora?[Y/N]: ");
            scan.nextLine();
            continuar = scan.nextLine();
            continuar = continuar.toUpperCase();

            if(continuar.equals("N")) {
                break;
            }
        }

        scan.close();
        
    }
}
