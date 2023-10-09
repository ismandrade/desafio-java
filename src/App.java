import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nome = "Ismael de Andrade Ribeiro da Silva";
        String conta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;


        System.out.println("******************************************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("******************************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair

                """;

        try (Scanner leitura = new Scanner(System.in)) {
            while (opcao != 4){
                System.out.println(menu);
                opcao = leitura.nextInt();


                if (opcao == 1){
                    System.out.println("Seu saldo atual é de R$ " + saldo);
                }else if (opcao == 2){
                    System.out.print("Que valor deseja transferir? R$ ");
                    double valor = leitura.nextDouble();

                    if (valor > saldo){
                        System.out.println("** Seu saldo é insuficiente **");
                    } else{
                        saldo -= valor;
                        System.out.print("Seu novo saldo é de R$ " + saldo);
                    }
                } else if (opcao == 3){
                    System.out.print("Que valor deseja receber? R$ ");
                    double valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Seu novo saldo é de R$ " + saldo);
                }else if (opcao == 4){
                    System.out.println("Obrigado por usar nossos serviços!");
                }
                }
                }
            }
        }
    
