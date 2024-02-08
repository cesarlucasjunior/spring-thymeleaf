package com.cesarjunior.curso.dao;

import com.cesarjunior.curso.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioRepository extends AbstractDAO<Funcionario, Long> implements FuncionarioDAO {
}
