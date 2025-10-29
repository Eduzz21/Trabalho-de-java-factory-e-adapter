// Gerenciador de Redes Sociais (Faz uso dos Adapters)

import java.util.HashMap;
import java.util.Map;

public class GerenciadorRedesSociais {
    private Map<String, GerenciadorMidiaSocial> socialMediaAdapters = new HashMap<>();

    public GerenciadorRedesSociais() {
        // Adiciona os adapters
        socialMediaAdapters.put("Twitter", new TwitterAdapter());
        socialMediaAdapters.put("Instagram", new InstagramAdapter());
        socialMediaAdapters.put("LinkedIn", new LinkedInAdapter());
        socialMediaAdapters.put("TikTok", new TikTokAdapter());
    }

    public Publicacao publicar(String plataforma, Conteudo conteudo) {
        GerenciadorMidiaSocial adapter = socialMediaAdapters.get(plataforma);
        if (adapter != null) {
            return adapter.publicarConteudo(conteudo);
        }
        throw new IllegalArgumentException("Plataforma não suportada: " + plataforma);
    }

    public Estatisticas obterEstatisticas(String plataforma, String idPublicacao) {
        GerenciadorMidiaSocial adapter = socialMediaAdapters.get(plataforma);
        if (adapter != null) {
            return adapter.obterEstatisticas(idPublicacao);
        }
        throw new IllegalArgumentException("Plataforma não suportada: " + plataforma);
    }
}
