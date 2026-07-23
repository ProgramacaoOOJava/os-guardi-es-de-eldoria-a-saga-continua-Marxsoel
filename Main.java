package eldoria;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n=== BEM-VINDOS AO REINO DE ELDORIA ===");
        System.out.println("Os Guardiões se preparam para a batalha!");
        
        // Criando uma lista polimórfica de personagens
        ArrayList<Personagem> herois = new ArrayList<>();
               
        // Adicionando Magos à lista
        herois.add(new Mago("Gandalf", 10, 100, 15.0));
        herois.add(new Mago("Merlin", 12, 120, 18.0));
        
        // Adicinando Guerreiros à lista
        herois.add(new Guerreiro("Aragorn", 15, 150, 25.0, 30.0));
        herois.add(new Guerreiro("Legolas", 8, 100, 20.0, 25.0));

        System.out.println("\n=== CADASTRO DOS HERÓIS ===");

        // Percorrendo a lista de personagens e demonstrando polimorfismo dinâmico
        for (Personagem personagem : herois) {
            personagem.exibirStatus();
            personagem.usarHabilidadeEspecial();
        }  
        
        System.out.println();

    }

}
