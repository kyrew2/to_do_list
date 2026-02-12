import java.security.PublicKey;

//Classe e Atributos
public class Tarefa{
    private String titulo;
    private String descricao;
    private boolean concluida;

    //Método construtor
    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
    }
    public Tarefa(){

    }
    // GET E SET DE TITULO
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //GET E SET DE TAREFA CONCLUIDA
    public boolean isConcluida() {
        return concluida;
    }
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    //GET E SET DE DESCRICAO
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
