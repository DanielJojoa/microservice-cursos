package com.danieljojoa.microservicios.app.cursos.services;

import org.springframework.stereotype.Service;

import com.danieljojoa.microservicios.app.cursos.models.entity.Curso;
import com.danieljojoa.microservicios.app.cursos.repository.CursoRepository;
import com.danieljojoa.microservicios.commons.services.CommonServiceImpl;
@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {



}
