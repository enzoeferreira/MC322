import Munchkin.*;

public class Main {
    public static void main(String[] args) {
        // Método main
        Jogador J1 = new Jogador("Alberto", 1, "Humano", "Mago");
        System.out.println(J1);

        Jogador J2 = new Jogador("Bagre", 1, "Anão", "Guerreiro", "Capacete", "Armadura",
                                 "Espada", "Escudo", "Bota");
        System.out.println(J2);

        System.out.println(J1.getItemCabeça());

        J1.setItemCabeça("Peruca");
        J1.setItemCorpo("Pijama");
        J1.setItemMaoDireita("Galho");
        J1.setItemPe("Crocs");
        System.out.println(J1);

        System.out.println(J1.getItemPe());
    }
}