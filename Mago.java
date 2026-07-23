package eldoria;

public class Mago extends Personagem {
    
    public Mago(
            String nome,
            int nivel,
            int pontosDeVida,
            double poderBase
    ) {
        super(
                nome,
                "Mago",
                nivel,
                pontosDeVida,
                poderBase
        );
    }

    public void usarHabilidadeEspecial() {
        System.out.printf(
                "Habilidade.......: %s conjura um feitiço de proteção!\n",
                getNome()                
        );
    }
   
}
