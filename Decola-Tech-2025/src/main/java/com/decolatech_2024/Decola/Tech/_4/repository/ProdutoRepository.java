package com.decolatech_2024.Decola.Tech._4.repository;

    import org.springframework.data.jpa.repository.JpaRepository;
    import com.decolatech_2024.Decola.Tech._4.model.Produto;
    
    public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    }
