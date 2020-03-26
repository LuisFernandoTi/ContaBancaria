package contabancaria;

//Figura 3.9: AccountTest.java
//Entrada e saída de números de ponto flutuante com objetos Account.

import java.util.Scanner;

/**
 *
 * @author luisti
 */
public class ContaTeste {
    
    public static void main(String[] args){
        
        //cria dois objetos Account
        Conta conta1 = new Conta("Luis Fernando", 950.00);
        Conta conta2 = new Conta("Luis Felipe", 1050.00);
        
        // exibe saldo inicial de cada objeto
        System.out.printf("%s saldo: R$ %.2f %n",
                conta1.obterNome(), conta1.obterSaldo());
        System.out.printf("%s saldo: R$ %.2f %n",
                conta2.obterNome(), conta2.obterSaldo());
        
        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Digite o valor de deposito para conta1: "); //prompt
        double valorDeposito = entrada.nextDouble(); // obtém a entrada do usuário
        System.out.printf("%n adicionando %.2f em conta1 %n%n",
                valorDeposito);
        conta1.deposito(valorDeposito); //adiciona o saldo de account1
        
        // exibe os saldos
        System.out.printf("%s saldo: R$ %.2f %n",
                conta1.obterNome(), conta1.obterSaldo()); // adiciona o saldo de account1
        System.out.printf("%s saldo: R$ %.2f %n",
                conta2.obterNome(), conta2.obterSaldo());
        
        System.out.print("Digite o valor de deposito para conta2: "); //prompt
        valorDeposito = entrada.nextDouble(); // obtém a entrada do usuário
        System.out.printf("%n adicionando %.2f em conta2 %n%n",
                valorDeposito);
        conta2.deposito(valorDeposito); // adiciona ao saldo de conta2
        
        // exibe os saldos
        System.out.printf("%s saldo: R$ %.2f %n",
                conta1.obterNome(), conta1.obterSaldo());
        System.out.printf("%s saldo: R$ %.2f %n",
                conta2.obterNome(), conta2.obterSaldo());
    }// fim de main
}// fim da classe AccountTest
