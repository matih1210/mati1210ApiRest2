package org.example.proyectoapirest.services;

import org.example.proyectoapirest.entities.Autor;
import org.example.proyectoapirest.repositories.AutorRepository;
import org.example.proyectoapirest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AutorServicesImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServicesImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
