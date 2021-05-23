package com.danieljojoa.microservicios.app.cursos.repository;

import org.springframework.data.repository.CrudRepository;

import com.danieljojoa.microservicios.app.cursos.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {

}
