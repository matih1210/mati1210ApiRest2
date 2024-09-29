package org.example.proyectoapirest.controllers;

import org.example.proyectoapirest.entities.Domicilio;
import org.example.proyectoapirest.services.DomicilioService;
import org.example.proyectoapirest.services.DomicilioServicesImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")

public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServicesImpl>{


}
