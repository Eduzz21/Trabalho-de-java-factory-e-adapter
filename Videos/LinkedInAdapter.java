// Adapter para LinkedIn
public class LinkedInAdapter implements GerenciadorMidiaSocial {
    @Override
    public Publicacao agendarPost(Conteudo conteudo) {
        // Simula a interação com a API do LinkedIn
        System.out.println("Agendando post no LinkedIn: " + conteudo.getTexto());
        return new Publicacao("67890", "LinkedIn", "Agendado");
    }

    @Override
    public Publicacao publicarConteudo(Conteudo conteudo) {
        // Simula a publicação no LinkedIn
        System.out.println("Publicando no LinkedIn: " + conteudo.getTexto());
        return new Publicacao("67890", "LinkedIn", "Publicado");
    }

    @Override
    public Estatisticas obterEstatisticas(String idPublicacao) {
        // Simula a obtenção de estatísticas do LinkedIn
        System.out.println("Obtendo estatisticas do LinkedIn para a publicacao " + idPublicacao);
        return new Estatisticas(150, 20, 10); // Exemplo fixo
    }
}
