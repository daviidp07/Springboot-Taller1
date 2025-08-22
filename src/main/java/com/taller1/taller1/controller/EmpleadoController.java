package com.taller1.taller1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.taller1.taller1.dto.EmpleadoDto;
import com.taller1.taller1.services.EmpleadoServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class EmpleadoController {

  @Autowired
  private EmpleadoServices empleadoServ;

  @GetMapping("/getEmpleado/{id}")
  public ResponseEntity<EmpleadoDto> getEmpleado(@PathVariable Integer id) {
      return new ResponseEntity<>(empleadoServ.getEmpleado(id), HttpStatus.OK);
  }
  
  @GetMapping("/getEmpleados")
  public ResponseEntity<List<EmpleadoDto>> getEmpleados() {
      return new ResponseEntity<>(empleadoServ.getEmpleados(), HttpStatus.OK);
  }
  
  @PostMapping("/createEmleados")
  public ResponseEntity<EmpleadoDto> createEmpleados(@PathVariable EmpleadoDto empleadoDto) {
      return new ResponseEntity<>(empleadoServ.setEmpleado(empleadoDto), HttpStatus.OK);
  }
  
}
