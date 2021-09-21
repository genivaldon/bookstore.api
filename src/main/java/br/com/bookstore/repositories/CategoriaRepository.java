package br.com.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bookstore.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Integer> {
    
}
