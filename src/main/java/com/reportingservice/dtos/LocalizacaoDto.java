package com.reportingservice.dtos;

import com.reportingservice.entities.Denuncia;
import com.reportingservice.entities.Localizacao;

import java.util.ArrayList;
import java.util.List;

public class LocalizacaoDto {
    private Long id;
    private Double latitude;
    private Double longitude;



    public LocalizacaoDto(){

    }

    public LocalizacaoDto(Long id, Double latitude, Double longitude, String nome, String cpf) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;

    }
    public LocalizacaoDto(Localizacao entity) {
        this.id = entity.getId();
        this.latitude = entity.getLatitude();
        this.longitude = entity.getLongitude();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}
