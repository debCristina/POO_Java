package exerciciosPolimorfismo;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.printf("""
                
               Titulo: %s
               Autor: %s
               Preco: %.2f
               """, titulo, autor, preco);
    }
}
