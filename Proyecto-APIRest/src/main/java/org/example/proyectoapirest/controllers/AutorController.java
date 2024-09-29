package org.example.proyectoapirest.controllers;

import org.example.proyectoapirest.entities.Autor;
import org.example.proyectoapirest.services.AutorService;
import org.example.proyectoapirest.services.AutorServicesImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")

public class AutorController extends BaseControllerImpl<Autor, AutorServicesImpl> {


}
