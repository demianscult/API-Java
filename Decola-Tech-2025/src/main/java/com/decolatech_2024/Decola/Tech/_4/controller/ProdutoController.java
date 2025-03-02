package com.decolatech_2025.Decola.Tech._4.controller;

import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;
    import com.decolatech_2025.Decola.Tech._4.model.Produto;
    import com.decolatech_2025.Decola.Tech._4.repository.ProdutoRepository;

    import java.util.List;

    @RestController
    @RequestMapping("/produtos")
    public class ProdutoController {

        @Autowired
        private ProdutoRepository produtoRepository;

        @GetMapping
        public List<Produto> listarProdutos() {
            return produtoRepository.findAll();
        }

        @PostMapping
        public Produto criarProduto(@RequestBody Produto produto) {
            return produtoRepository.save(produto);
        }

        // Outros métodos para atualizar, deletar, etc.
    }
