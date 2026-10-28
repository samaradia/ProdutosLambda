import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produtos> produtos = Arrays.asList(
                new Produtos("Smartphone", 800.0, "Eletrônicos"),
                new Produtos("Notebook", 1500.0, "Eletrônicos"),
                new Produtos("Teclado", 200.0, "Eletrônicos"),
                new Produtos("Cadeira", 300.0, "Móveis"),
                new Produtos("Monitor", 900.0, "Eletrônicos"),
                new Produtos("Mesa", 700.0, "Móveis")
        );

        List<Produtos> produtosFiltrados = produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletrônicos"))
                .filter(p -> p.getPreco() < 1000)
                .sorted((p1, p2)-> Double.compare(p1.getPreco(),p2.getPreco()))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(produtosFiltrados);




    }
}