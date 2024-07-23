import java.util.Scanner;

//TODO: Conhecer e importar a classe scanner
//TODO: EXIBIR A MENSAGEM PARA O NOSSO USUARIO
//OBTER PELA SCANER OS VALORES DIGITADOS
//EXIBIR A MENSAGEM DA CONTA CRIADA

public class ContaTerminal {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = sc.next();
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Digite o numero da agência: ");
            String agencia = sc1.next();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Digite o numero da conta: ");
            String conta = sc1.next();
            int saldo = 1000;
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " reais já esta disponível para saque.");



    }
}