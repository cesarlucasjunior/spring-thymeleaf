package com.cesarjunior.curso.dao;

import com.cesarjunior.curso.domain.Cargo;

import java.util.List;

public interface CargoDAO {
    void save(Cargo departamento);

    void update(Cargo departamento);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
