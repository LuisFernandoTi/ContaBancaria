// Figura 3.1: Account.java
// Classe Account que contém uma variável de instância name
// e métodos para configurar e obter seu valor.
package contabancaria;

/**
 *
 * @author luisti
 */
public class ContaBancaria {
    private String nome; // variável de instânica
    
    public void configurarNome(String nome){
        
        this.nome = nome; // armazena o nome
        
    }
    
    public String obterNome(){
        
        return nome; // retorna valor do nome para o chamador
    }
}
