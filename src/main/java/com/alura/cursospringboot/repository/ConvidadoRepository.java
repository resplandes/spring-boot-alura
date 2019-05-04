package com.alura.cursospringboot.repository;

import com.alura.cursospringboot.modelo.Convidado;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {
}
