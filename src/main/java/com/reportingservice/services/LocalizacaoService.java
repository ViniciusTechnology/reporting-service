package com.reportingservice.services;

import com.reportingservice.dtos.LocalizacaoDto;
import com.reportingservice.entities.Localizacao;
import com.reportingservice.exceptions.ResourceNotFoundException;
import com.reportingservice.repositories.LocalizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LocalizacaoService {

    @Autowired
    private LocalizacaoRepository localizacaoRepository;


    @Transactional
    public LocalizacaoDto insert(LocalizacaoDto dto) {
        try {
            Localizacao local = new Localizacao();
            local.setLatitude(local.getLatitude());
            local.setLongitude(local.getLongitude());
            local = localizacaoRepository.save(local);
            return new LocalizacaoDto(local);
        } catch (EntityNotFoundException a) {
            throw new ResourceNotFoundException("Endereço não encontrado para essa localidade" + dto);
        }
    }
}
