// Interface Unificada
public interface GerenciadorMidiaSocial {
    Publicacao agendarPost(Conteudo conteudo);
    Publicacao publicarConteudo(Conteudo conteudo);
    Estatisticas obterEstatisticas(String idPublicacao);
}
