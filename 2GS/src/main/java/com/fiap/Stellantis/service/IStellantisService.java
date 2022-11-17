package com.fiap.Stellantis.service;

import org.springframework.http.ResponseEntity;

import com.fiap.Stellantis.models.Veiculo;
import com.fiap.Stellantis.respositories.RegionalRepository;
import com.fiap.Stellantis.respositories.VeiculoRepository;

public interface IStellantisService {

    public ResponseEntity saveVeiculo(Veiculo veiculo);
}
