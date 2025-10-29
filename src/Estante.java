import java.util.ArrayList;
import java.util.List;

public class Estante {
    private String nome;
    private String genero;
    private int paginas;
    private List<Topico>historico;

    public Estante(String nome, String genero, int paginas, List<Topico> historico) {
        this.nome = nome;
        this.genero = genero;
        this.paginas = paginas;
        this.historico = new ArrayList<>();
    }
}
