package com.fiap.Stellantis.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.Stellantis.models.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}