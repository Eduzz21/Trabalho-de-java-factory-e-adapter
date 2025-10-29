// Adapter para TikTok
public class TikTokAdapter implements GerenciadorMidiaSocial {
    @Override
    public Publicacao agendarPost(Conteudo conteudo) {
        // Simula a interação com a API do TikTok
        System.out.println("Agendando post no TikTok: " + conteudo.getTexto());
        return new Publicacao("09876", "TikTok", "Agendado");
    }

    @Override
    public Publicacao publicarConteudo(Conteudo conteudo) {
        // Simula a publicação no TikTok
        System.out.println("Publicando no TikTok: " + conteudo.getTexto());
        return new Publicacao("09876", "TikTok", "Publicado");
    }

    @Override
    public Estatisticas obterEstatisticas(String idPublicacao) {
        // Simula a obtenção de estatísticas do TikTok
        System.out.println("Obtendo estatistica do TikTok para a publicacao " + idPublicacao);
        return new Estatisticas(500, 50, 100); // Exemplo fixo
    }
}
