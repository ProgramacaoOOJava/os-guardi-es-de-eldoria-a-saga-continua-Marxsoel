package eldoria;

public class Guerreiro extends Personagem {
    
    public Guerreiro(
            String nome,
            int nivel,
            int pontosDeVida,
            double poderBase,
            double forca
    ) {
        super(
                nome,
                "Guerreiro",
                nivel,
                pontosDeVida,
                poderBase
        );

    }

    @Override
        public void usarHabilidadeEspecial() {
            System.out.printf(
                    "Habilidade.......: %s desfere um golpe devastador!\n",
                    getNome()
            );
        }

       
}
