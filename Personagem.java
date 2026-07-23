package eldoria;

import java.util.Objects;

/*
 * Classe base para representar personagens do reino de Eldoria.
 * Aplica conceitos de encapsulamento, herança e polimorfismo.
 */
public abstract class Personagem {

    // Atributos privados (encapsulamento)
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    // Construtor que inicializa todos os atributos do personagem.
    public Personagem(
            String nome,
            String classe,
            int nivel,
            int pontosDeVida,
            double poderBase
    ) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Método que define a habilidade do personagem.
    // Deve ser sobrescrito pelas subclasses para implementar comportamentos específicos de cada tipo de personagem.
    public abstract void usarHabilidadeEspecial();

    // Exibe as informações gerais do personagem
    public void exibirStatus() {
        System.out.println("\nNome.............: " + nome);
        System.out.println("Classe...........: " + classe);
        System.out.println("Nível............: " + nivel);
        System.out.println("Pontos de vida...: " + pontosDeVida);
        System.out.printf("Poder base.......: %.2f%n", poderBase);
        //System.out.printf("Poder total......: %.2f%n", calcularPoderTotal());
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public void setPoderBase(double poderBase) {
        this.poderBase = poderBase;
    }
       
}




