import java.util.Scanner;

public class Main {

    // Desafio: criar uma simulação de conta bancária
    // Etapas:
    // 1- resumo da conta - ok
    // 2 - criar menu (consultar, receber, transferir, sair)
    // 3- criar operaçoes

    public static void main(String[] args) {

        // Resumo da conta
        String nomeC = "Bruce Wayne";
        String tipoC = "Corrente";
        double saldo = 5000;
        double valoraReceber = 0;
        double valoraTransferir = 0;

        System.out.println("******************************************* \n");
        System.out.println("Dados Iniciais do Cliente");
        System.out.println("Nome do cliente:    " + nomeC);
        System.out.println("Tipo de conta:      " + tipoC);
        System.out.println("Saldo Inicial:      " + saldo + " R$ \n");
        System.out.println("******************************************");

        // menu
        String menu = """
                
                Operações:
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Finalizar
                
                Digite a opção desejada:""";

        int opção = 0;
        Scanner interação = new Scanner(System.in);

        while (opção != 4) {
            System.out.println(menu);
            opção = interação.nextInt();

            if (opção == 1) {
                System.out.println("Seu saldo atual é " + saldo); }

            else if (opção == 2) {
                System.out.println("digite quanto irá receber");
                valoraReceber = interação.nextDouble();
                saldo = saldo + valoraReceber;
                System.out.println("seu saldo atual é " + saldo);
            }

            if (opção == 3) {
                System.out.println("digite quanto irá transferir");
                valoraTransferir = interação.nextDouble();
                if (valoraTransferir > saldo) {
                    System.out.println("saldo insuficiente para realizar a transferência");
                } else {
                    saldo = saldo - valoraTransferir;
                    System.out.println("seu saldo atual é " + (saldo));}
            }

            else if (opção == 4) {
                System.out.println("Seu saldo atual é " + saldo);
                System.out.println("Obrigada por utilizar nosso sitema! Volte sempre!");
            }

            if ((opção >4) || (opção <1)) {
                System.out.println("Por favor, digite uma opção de 1 a 4");
            }

        }

    }

}
