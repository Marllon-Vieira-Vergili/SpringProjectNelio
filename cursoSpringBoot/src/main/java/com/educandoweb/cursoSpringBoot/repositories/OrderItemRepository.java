package com.educandoweb.cursoSpringBoot.repositories;


import com.educandoweb.cursoSpringBoot.entities.OrderItem;
import com.educandoweb.cursoSpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Pode colocar, mas não é necessário
//Pois, nosso jpa repository ja é um repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    //Aqui vai pegar todos os métodos CRUD do Jpa Repository, com o tipo de dados que vamos passar Long, do ID
}
