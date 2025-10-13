package br.com.gabrielsiqueira.MyStore.repository;

import br.com.gabrielsiqueira.MyStore.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {
    public List<CategoryModel> findByNameContainsIgnoreCaseOrderByName(String name);
}
