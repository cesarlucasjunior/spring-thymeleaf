package com.cesarjunior.curso.dao;

import com.cesarjunior.curso.domain.Departamento;

import java.util.List;

public interface DepartamentoDAO {

    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();
}
