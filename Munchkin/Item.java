package Munchkin;

public class Item {
    /**
     *  ATRIBUTOS
     */ 
    private String nome;
    private int bonusPoder;
    private int valor;
    private String tipo;

    
    /**
     * MÉTODOS
     */
    
    // getters
    public String getNome() {
        return nome;
    }

    public int getBonusPoder() {
        return bonusPoder;
    }

    public int getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBonusPoder(int bonusPoder) {
        this.bonusPoder = bonusPoder;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Métodos
    public String toString() {
        // Visualizar classe instanciada e seus atributos
        return "Item: " + nome;
    }
}