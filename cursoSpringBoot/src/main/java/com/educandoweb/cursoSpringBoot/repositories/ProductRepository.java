package com.educandoweb.cursoSpringBoot.repositories;


import com.educandoweb.cursoSpringBoot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Pode colocar, mas não é necessário
//Pois, nosso jpa repository ja é um repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    //Aqui vai pegar todos os métodos CRUD do Jpa Repository, com o tipo de dados que vamos passar Long, do ID
}
