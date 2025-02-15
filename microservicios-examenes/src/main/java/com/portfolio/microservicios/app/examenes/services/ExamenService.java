package com.portfolio.microservicios.app.examenes.services;

import java.util.List;

import com.portfolio.microservicios.commons.examenes.models.entity.Asignatura;
import com.portfolio.microservicios.commons.examenes.models.entity.Examen;
import com.portfolio.microservicios.commons.services.CommonService;

public interface ExamenService extends CommonService<Examen> {

	public List<Examen> findByNombre(String term);

	public Iterable<Asignatura> findAllAsigntauras();

	public Iterable<Long> findExamenesIdsConRespuestasByPreguntaIds(Iterable<Long> preguntaIds);
}
