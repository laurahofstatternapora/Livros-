public abstract class Topico {
    private String titulo;
    private String autor;
    private String genero;
    private String sinopse;
    private int ano;

    public Topico(String titulo, String autor, String genero, String sinopse, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.sinopse = sinopse;
        this.ano = ano;
    }

    public abstract void apresentarInformaçoes();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
