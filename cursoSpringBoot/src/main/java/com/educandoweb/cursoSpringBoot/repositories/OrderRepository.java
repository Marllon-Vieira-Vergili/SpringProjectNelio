package com.educandoweb.cursoSpringBoot.repositories;


import com.educandoweb.cursoSpringBoot.entities.Order;
import com.educandoweb.cursoSpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Pode colocar, mas não é necessário
//Pois, nosso jpa repository ja é um repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
