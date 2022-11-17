package com.fiap.Stellantis.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fiap.Stellantis.models.Regional;
import com.fiap.Stellantis.models.Veiculo;
import com.fiap.Stellantis.respositories.RegionalRepository;
import com.fiap.Stellantis.respositories.VeiculoRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class StellantisService implements IStellantisService {

    @Autowired
    public RegionalRepository _regionalRepo;
    @Autowired
    public VeiculoRepository _veiculoRepo;

    public ResponseEntity saveVeiculo(Veiculo veiculo){

        try {

            List<Veiculo> veiculos = new ArrayList<>();
            veiculos.add(_veiculoRepo.save(veiculo));

            Regional regionalModel = new Regional(veiculos);
            _regionalRepo.save(regionalModel);

            return ResponseEntity.ok("Veiculo: " + veiculo.toString() + " Regional: " + regionalModel.toString());

        }catch (Exception e){

            return ResponseEntity.internalServerError().body("Erro: " + e.getMessage());

        }
    }
}
