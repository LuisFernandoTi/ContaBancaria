package contabancaria;

//Figura 3.2: AccountTest.java
//Cria e manipula um objeto Account.

import java.util.Scanner;

/**
 *
 * @author luisti
 */
public class ContaTeste {
    
    public static void main(String[] args){
        
        //cria um objeto Scanner para obter entrada a partir da janela de comando
        Scanner entrada = new Scanner(System.in);
        
        //cria um objeto Account e o atribui a myAccount
        Conta minhaConta = new Conta();
        
        // exibe o valor inicial do nome (null)
        System.out.printf("Nome inicial é: %s%n%n", minhaConta.obterNome());
        
        //solicita e lê o nome
        System.out.println("Digite seu nome: ");
        String meuNome = entrada.nextLine(); //lê uma linha de texto
        minhaConta.configurarNome(meuNome); //insere theName em myAccount
        System.out.println(); // gera saida de uma linha em branco
        
        // exibe o nome armazenado no objeto myAccount
        System.out.printf("Nome do objeto minhaConta é: %n%s%n", minhaConta.obterNome());
         
    }
    
}
