package org.example.proyectoapirest.services;

import org.example.proyectoapirest.entities.Localidad;
import org.example.proyectoapirest.repositories.BaseRepository;
import org.example.proyectoapirest.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service

public class LocalidadServicesImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadSevice {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServicesImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
