// Classe Conteudo - Representa o conteúdo a ser postado (somente texto)
public class Conteudo {
    private String texto;

    public Conteudo(String texto) {
        this.texto = texto;
    }

    // Getter e Setter
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
