// Figura 3.1: Account.java
// Classe Account que contém uma variável de instância name
// e métodos para configurar e obter seu valor.
package contabancaria;

/**
 *
 * @author luisti
 */
public class Conta {
    
    private String nome; // variável de instânica
    
    //o contrutor inicializa name com nome do parâmetro
    public Conta(String nome){// o nome do construtor é o nome da clase
        this.nome = nome;
    }
    
    public void configurarNome(String nome){
        
        this.nome = nome; // armazena o nome
        
    }
    
    public String obterNome(){
        
        return nome; // retorna valor do nome para o chamador
    }
}
