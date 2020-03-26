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
        
        //cria dois objetos Account
        Conta conta1 = new Conta("Luis Fernando");
        Conta conta2 = new Conta("Luis Felipe");
        
        //exibe o valor inicial de nome para cada Account
        System.out.printf("Nome da conta1: %s%n", conta1.obterNome());
        
        System.out.printf("Nome da conta2: %s%n", conta2.obterNome());
    }
    
}
