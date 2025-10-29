public class Main {
    public static void main(String[] args) {
        // Criando o gerenciador com Factory
        GerenciadorRedesSociais gerenciador = new GerenciadorRedesSociais();

        // Criando o conteúdo (apenas texto, sem imagem)
        Conteudo conteudo = new Conteudo("Promocao de lancamento!");

        // Publicando nas redes sociais usando a Factory
        Publicacao publicacaoTwitter = gerenciador.publicar("Twitter", conteudo);
        Publicacao publicacaoInstagram = gerenciador.publicar("Instagram", conteudo);
        Publicacao publicacaoLinkedIn = gerenciador.publicar("LinkedIn", conteudo);
        Publicacao publicacaoTikTok = gerenciador.publicar("TikTok", conteudo);

        // Obtendo estatísticas
        Estatisticas estatisticasTwitter = gerenciador.obterEstatisticas("Twitter", publicacaoTwitter.getId());
        Estatisticas estatisticasInstagram = gerenciador.obterEstatisticas("Instagram", publicacaoInstagram.getId());
        Estatisticas estatisticasLinkedIn = gerenciador.obterEstatisticas("LinkedIn", publicacaoLinkedIn.getId());
        Estatisticas estatisticasTikTok = gerenciador.obterEstatisticas("TikTok", publicacaoTikTok.getId());

        // Exibindo resultados
        System.out.println("Estatisticas do Twitter: " + estatisticasTwitter.getCurtidas());
        System.out.println("Estatisticas do Instagram: " + estatisticasInstagram.getCurtidas());
        System.out.println("Estatisticas do LinkedIn: " + estatisticasLinkedIn.getCurtidas());
        System.out.println("Estatisticas do TikTok: " + estatisticasTikTok.getCurtidas());
    }
}
