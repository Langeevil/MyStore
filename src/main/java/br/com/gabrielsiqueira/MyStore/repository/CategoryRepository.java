package br.com.gabrielsiqueira.MyStore.repository;

import br.com.gabrielsiqueira.MyStore.model.CategoryModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {
    Page<CategoryModel> findByNameContainsIgnoreCase(String name, Pageable pageable);
}
