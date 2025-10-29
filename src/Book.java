public class Book extends Topico{
  private int paginas;

    public Book(String titulo, String autor, String genero, String sinopse, int ano, int paginas) {
        super(titulo, autor, genero, sinopse, ano);
        this.paginas = paginas;

    }

    @Override
    public void apresentarInformaçoes() {
        System.out.println("Livro: "+getTitulo()+ "Gênero: "+ getGenero()+ "Autor: "+ getAutor());
        System.out.println("Sinopse: "+ getSinopse() + "Páginas: " +paginas);
    }
}
