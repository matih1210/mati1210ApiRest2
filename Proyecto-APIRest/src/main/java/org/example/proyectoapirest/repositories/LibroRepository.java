package org.example.proyectoapirest.repositories;

import org.example.proyectoapirest.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository

public interface LibroRepository extends BaseRepository<Libro, Long> {
}
