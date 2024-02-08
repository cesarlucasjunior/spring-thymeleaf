package com.cesarjunior.curso.dao;

import com.cesarjunior.curso.domain.Departamento;
import org.springframework.stereotype.Repository;

@Repository
public class DepartamentoRepository extends AbstractDAO<Departamento, Long> implements DepartamentoDAO {
}
