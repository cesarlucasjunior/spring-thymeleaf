package com.cesarjunior.curso.dao;

import com.cesarjunior.curso.domain.Funcionario;

import java.util.List;

public interface FuncionarioDAO {

    void save(Funcionario departamento);

    void update(Funcionario departamento);

    void delete(Long id);

    Funcionario findById(Long id);

    List<Funcionario> findAll();
}
