package CAP01_FirstCode;

/* ----------------------------------------------------------------- */
public class FirstCode {
    public static void main(String[] args) {
        Cachorro cat = new Cachorro("July", "Caramelo", 2);

        System.out.println("Hello World!");
        System.out.println(cat.toString());

        Livro book = new Livro("O problema dos 3 corpos", 300);
        System.out.println(book.toString());
    }
}
/* ----------------------------------------------------------------- */
class Livro{
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
/* ----------------------------------------------------------------- */