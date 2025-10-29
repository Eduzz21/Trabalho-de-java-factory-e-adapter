import java.util.UUID;

public class InstagramAdapter implements GerenciadorMidiaSocial {

    @Override
    public Publicacao agendarPost(Conteudo conteudo) {
        String id = UUID.randomUUID().toString();
        System.out.println("Agendando post no Instagram: " + conteudo.getTexto());
        return new Publicacao(id, "Instagram", "Agendado");
    }

    @Override
    public Publicacao publicarConteudo(Conteudo conteudo) {
        String id = UUID.randomUUID().toString();
        System.out.println("Publicando no Instagram: " + conteudo.getTexto());
        return new Publicacao(id, "Instagram", "Publicado");
    }

    @Override
    public Estatisticas obterEstatisticas(String idPublicacao) {
        System.out.println("Obtendo estastiticas do Instagram para a publicacao " + idPublicacao);
      
        int curtidas = (int) (Math.random() * 500);
        int comentarios = (int) (Math.random() * 100);
        int compartilhamentos = (int) (Math.random() * 50);
        return new Estatisticas(curtidas, comentarios, compartilhamentos);
    }
}
