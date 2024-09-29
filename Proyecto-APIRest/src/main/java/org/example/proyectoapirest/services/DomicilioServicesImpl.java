package org.example.proyectoapirest.services;

import jakarta.transaction.Transactional;
import org.example.proyectoapirest.entities.Domicilio;
import org.example.proyectoapirest.repositories.BaseRepository;
import org.example.proyectoapirest.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class DomicilioServicesImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServicesImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}
