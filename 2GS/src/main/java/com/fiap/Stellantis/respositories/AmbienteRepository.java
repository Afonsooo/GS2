package com.fiap.Stellantis.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.Stellantis.models.Ambiente;

public interface AmbienteRepository extends JpaRepository<Ambiente, Long> {
}