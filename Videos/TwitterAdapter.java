// Adapter para Twitter
public class TwitterAdapter implements GerenciadorMidiaSocial {
    @Override
    public Publicacao agendarPost(Conteudo conteudo) {
        // Simula a interação com a API do Twitter
        System.out.println("Agendando post no Twitter: " + conteudo.getTexto());
        return new Publicacao("12345", "Twitter", "Agendado");
    }

    @Override
    public Publicacao publicarConteudo(Conteudo conteudo) {
        // Simula a publicação no Twitter
        System.out.println("Publicando no Twitter: " + conteudo.getTexto());
        return new Publicacao("12345", "Twitter", "Publicado");
    }

    @Override
    public Estatisticas obterEstatisticas(String idPublicacao) {
        // Simula a obtenção de estatísticas do Twitter
        System.out.println("Obtendo estatisticas do Twitter para a publicacao " + idPublicacao);
        return new Estatisticas(100, 10, 5); // Exemplo fixo
    }
}
