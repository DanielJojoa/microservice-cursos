package com.danieljojoa.microservicios.app.cursos.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.danieljojoa.microservicios.app.cursos.models.entity.Curso;
import com.danieljojoa.microservicios.app.cursos.services.CursoService;
import com.danieljojoa.microservicios.commons.controllers.CommonController;

@RestController
public class CursoController extends CommonController<Curso, CursoService> {
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Curso curso,@PathVariable Long id){
		Optional <Curso> opt = this.service.findById(id);
		if(opt.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		Curso dbCurso = opt.get();
		dbCurso.setName(curso.getName());
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(dbCurso));
	}
}
