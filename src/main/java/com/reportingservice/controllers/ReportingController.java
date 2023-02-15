package com.reportingservice.controllers;

import com.reportingservice.dtos.LocalizacaoDto;
import com.reportingservice.services.LocalizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/v1/denuncias")
public class ReportingController {

    @Autowired
    private LocalizacaoService localizacaoService;

    @PostMapping
    public ResponseEntity<LocalizacaoDto> insert(@RequestBody LocalizacaoDto local){
        local = localizacaoService.insert(local);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(local.getId())
                .toUri();
        return ResponseEntity.created(uri).body(local);
    }
}
