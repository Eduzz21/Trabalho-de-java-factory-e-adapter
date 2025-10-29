// Classe Publicacao - Representa uma publicação
public class Publicacao {
    private String id;
    private String plataforma;
    private String status;

    public Publicacao(String id, String plataforma, String status) {
        this.id = id;
        this.plataforma = plataforma;
        this.status = status;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}