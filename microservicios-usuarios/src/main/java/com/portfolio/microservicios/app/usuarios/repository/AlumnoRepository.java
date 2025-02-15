package com.portfolio.microservicios.app.usuarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.portfolio.microservicios.commons.alumnos.models.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

	@Query("select a from Alumno a where upper(a.nombre) like upper(concat('%',?1,'%')) or upper(a.apellido) like upper(concat('%',?1,'%'))")
	public List<Alumno> findByNombreOrApellido(String term);

}
