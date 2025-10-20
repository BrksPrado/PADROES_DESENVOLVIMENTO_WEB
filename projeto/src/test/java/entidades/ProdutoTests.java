package entidades;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class ProdutoTests {
    @Test
    @Transactional
    public void testBuscaUmaCategoriaBuscaUmFabricanteSalvaUmProduto() {
        Categoria categoria = Categoria.findById(2);
        Fabricante fabricante = Fabricante.findById(1);

        Produto produto = new Produto ();
        produto.nome = "Fanta Laranja 2 Litros";
        produto.preco = 9.00;
        produto.quantidade = 30;
        produto.validade = LocalDate.of(2026, 4, 30);
        produto.categoria = categoria;
        produto.fabricante = fabricante;

        produto.persist();
        Assertions.assertEquals(2, produto.codigo);
    }

}
