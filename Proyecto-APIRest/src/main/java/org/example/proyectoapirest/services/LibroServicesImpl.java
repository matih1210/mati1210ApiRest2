package org.example.proyectoapirest.services;

import jakarta.transaction.Transactional;
import org.example.proyectoapirest.entities.Libro;
import org.example.proyectoapirest.repositories.BaseRepository;
import org.example.proyectoapirest.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class LibroServicesImpl extends BaseServiceImpl<Libro, Long> implements LibroService{

    @Autowired
    private LibroRepository libroRepository;

    public LibroServicesImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}
