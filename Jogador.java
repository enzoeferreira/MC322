public class Jogador{
    // Atributos
    private String nome;
    private int nivel;
    private String raça;
    private String classe;
    private String itemCabeça;
    private String itemCorpo;
    private String itemMaoDireita;
    private String itemMaoEsquerda;
    private String itemPe;

    /**
     * MÉTODOS
     */
    
    // getters
    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public String getRaça() {
        return raça;
    }

    public String getClasse() {
        return classe;
    }

    public String getItemCabeça() {
        return itemCabeça;
    }

    public String getItemCorpo() {
        return itemCorpo;
    }

    public String getItemMaoDireita() {
        return itemMaoDireita;
    }

    public String getItemMaoEsquerda() {
        return itemMaoEsquerda;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setItemCabeça(String itemCabeça) {
        this.itemCabeça = itemCabeça;
    }

    public void setItemCorpo(String itemCorpo) {
        this.itemCorpo = itemCorpo;
    }

    public void setItemMaoDireita(String itemMaoDireita) {
        this.itemMaoDireita = itemMaoDireita;
    }

    public void setItemMaoEsquerda(String itemMaoEsquerda) {
        this.itemMaoEsquerda = itemMaoEsquerda;
    }
}