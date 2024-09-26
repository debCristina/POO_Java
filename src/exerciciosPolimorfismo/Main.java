package exerciciosPolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Harry Potter", "J.K Rowling", 30));
        livros.add(new Livro("Jogos Vorazes", "Suzanne Collins", 20));
        livros.add(new Ebook("A revolução dos bichos", "George Orwell", 50, 1));

        for(Livro livro: livros){
            livro.exibirDetalhes();
        }
    }

}
