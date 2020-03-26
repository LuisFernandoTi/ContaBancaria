// Figura 3.8: Account.java
// Classe Account com uma variável de instância balance do tipo double e um 
//construtor e método deposit que executa a validação.
// e métodos para configurar e obter seu valor.
package contabancaria;

/**
 *
 * @author luisti
 */
public class Conta {
    
    private String nome; // variável de instânica
    private double saldo; // variável de instância
    
    //Construtor de Account que recebe dois parâmetros
    public Conta(String nome, double saldo){// o nome do construtor é o nome da clase
        
        this.nome = nome; // atribui name é variável de instância name
        
        //valida que o balance é maior que 0.0; se não for,
        //a variável de instância balance mantém seu valor inicial padrão de 0.0
        if(saldo > 0.0){ // se o saldo for válido
            this.saldo = saldo; // o atribui à variável de instância balance
        }
    }
    
    // método que deposita (adiciona) apenas uma quantia válida no saldo
    public void deposito(double valorDeposito){
        
        if(valorDeposito > 0.0){// se valorDeposito for válido
            saldo = saldo + valorDeposito; // o diciona ao saldo
        }
    }
    
    //método retorna o saldo da conta
    public double obterSaldo(){
        return saldo;
    }
    
    public void configurarNome(String nome){
        
        this.nome = nome; // armazena o nome
        
    }
    
    public String obterNome(){
        
        return nome; // retorna valor do nome para o chamador
    }
}
