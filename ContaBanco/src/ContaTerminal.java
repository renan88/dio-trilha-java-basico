import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

       /*
        TODO: Conhecer e importar a classe scanner
        Exibir  as mensagens para o nosso usuário
        Obter pelo scanner os valores digitados no terminal
        Exibir a mensagem conta criada
        */ 

        int numeroDaConta;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Digite o seu número da conta:");
        numeroDaConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Qual sua Agência:");
        agencia = sc.nextLine();

        System.out.println("Qual o seu nome:");
        nomeCliente = sc.nextLine();

        System.out.println("Informe o valor do seu saldo atual:");
        saldo = sc.nextDouble();



        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
        + "sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");




    }
}
