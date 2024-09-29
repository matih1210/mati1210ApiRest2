package org.example.proyectoapirest.controllers;

import org.example.proyectoapirest.entities.Localidad;
import org.example.proyectoapirest.services.LocalidadServicesImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")

public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServicesImpl> {


}
