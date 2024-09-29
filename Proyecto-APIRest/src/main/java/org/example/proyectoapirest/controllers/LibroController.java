package org.example.proyectoapirest.controllers;

import org.example.proyectoapirest.entities.Libro;
import org.example.proyectoapirest.services.LibroServicesImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")

public class LibroController extends BaseControllerImpl<Libro, LibroServicesImpl>{


}
