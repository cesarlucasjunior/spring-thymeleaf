package com.cesarjunior.curso.dao;

import com.cesarjunior.curso.domain.Cargo;
import org.springframework.stereotype.Repository;

@Repository
public class CargoRepository extends AbstractDAO<Cargo, Long> implements CargoDAO {
}
