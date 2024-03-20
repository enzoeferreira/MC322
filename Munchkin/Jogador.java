package Munchkin;

public class Jogador{
    /**
     *  ATRIBUTOS
     */ 
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

    /**
     * Contrutor básico de objeto de Jogador
     * 
     * @param nome      Nome do jogador
     * @param nivel     Nível do jogador
     * @param raça      Raça do jogador
     * @param classe    Classe do jogador
     */
    public Jogador(String nome, int nivel, String raça, String classe) {
        this.nome = nome;
        this.nivel = nivel;
        this.raça = raça;
        this.classe = classe;
    }

    /**
     * Construtor completo de objeto de Jogador
     * 
     * @param nome      Nome do jogador
     * @param nivel     Nível do jogador
     * @param raça      Raça do jogador
     * @param classe    Classe do jogador
     * 
     * @param itemCabeça        Item equipado na cabeça
     * @param itemCorpo         Item equipado no corpo
     * @param itemMaoDireita    Item equipado na mão direita
     * @param itemMaoEsquerda   Item equipado na mão esquerda
     * @param itemPe            Item equipado no pé
     */
    public Jogador(String nome, int nivel, String raça, String classe,
                   String itemCabeça, String itemCorpo,
                   String itemMaoDireita, String itemMaoEsquerda, String itemPe) {
        this.nome = nome;
        this.nivel = nivel;
        this.raça = raça;
        this.classe = classe;

        this.itemCabeça = itemCabeça;
        this.itemCorpo = itemCorpo;
        this.itemMaoDireita = itemMaoDireita;
        this.itemMaoEsquerda = itemMaoEsquerda;
        this.itemPe = itemPe;
    }
    
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

    public String getItemPe() {
        return itemPe;
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

    public void setItemPe(String itemPe) {
        this.itemPe = itemPe;
    }

    // Métodos
    public String toString() {
        // Visualizar classe instanciada e seus atributos
        String output = String.format("""
                                      ============================
                                      Jogador: %s (LVL: %d) - %s
                                      ============================
                                      """, nome, nivel, classe);
        output += "Item Cabeça: ";
        output += (itemCabeça == null) ? "Nenhum\n" : itemCabeça + "\n";
        output += "Item Corpo: ";
        output += (itemCorpo == null) ? "Nenhum\n" : itemCorpo + "\n";
        output += "Item Mão Direita: ";
        output += (itemMaoDireita == null) ? "Nenhum\n" : itemMaoDireita + "\n";
        output += "Item Mão Esquerda: ";
        output += (itemMaoEsquerda == null) ? "Nenhum\n" : itemMaoEsquerda + "\n";
        output += "Item Pé: ";
        output += (itemPe == null) ? "Nenhum\n" : itemPe + "\n";

        return output;
    }

    public boolean possuiMaoVazia() {
        // Validar se o jogador possui alguma mão sem item equipado
        return false;
    }
}