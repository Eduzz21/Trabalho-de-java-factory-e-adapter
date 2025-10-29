
// Classe Estatisticas - Para acompanhar os dados de engajamento da publicação
public class Estatisticas {
    private int curtidas;
    private int comentarios;
    private int compartilhamentos;

    public Estatisticas(int curtidas, int comentarios, int compartilhamentos) {
        this.curtidas = curtidas;
        this.comentarios = comentarios;
        this.compartilhamentos = compartilhamentos;
    }

    // Getters e Setters
    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getComentarios() {
        return comentarios;
    }

    public void setComentarios(int comentarios) {
        this.comentarios = comentarios;
    }

    public int getCompartilhamentos() {
        return compartilhamentos;
    }

    public void setCompartilhamentos(int compartilhamentos) {
        this.compartilhamentos = compartilhamentos;
    }
}
