package br.com.gabrielsiqueira.MyStore.repository;

import br.com.gabrielsiqueira.MyStore.model.ProductModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {

    public Page<ProductModel> findByNameContainsIgnoreCase(String name, Pageable pageable);

    public Page<ProductModel> findAll(Pageable pageable);
}