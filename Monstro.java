public class Monstro {
    /**
     *  ATRIBUTOS
     */ 
    private String nome;
    private int poder;
    private int quantidadeDeTesouros;
    private int niveisPerdidos;

    /**
     *  MÉTODOS
     */

    // getters
    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public int quantidadeDeTesouros() {
        return quantidadeDeTesouros;
    }

    public int niveisPerdidos() {
        return niveisPerdidos;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setQuantidadeDeTesouros(int quantidadeDeTesouros) {
        this.quantidadeDeTesouros = quantidadeDeTesouros;
    }

    public void setNiveisPerdidos(int niveisPerdidos) {
        this.niveisPerdidos = niveisPerdidos;
    }

    // Métodos
    public void toString() {
        // Visualizar classe instanciada e seus atributos
    }
}