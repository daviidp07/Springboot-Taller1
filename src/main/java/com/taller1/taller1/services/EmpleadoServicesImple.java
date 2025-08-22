package com.taller1.taller1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taller1.taller1.dto.EmpleadoDto;
import com.taller1.taller1.mapper.EmpleadoMapper;
import com.taller1.taller1.models.Empleado;
import com.taller1.taller1.repositories.EmpleadoRepository;

@Service
public class EmpleadoServicesImple implements EmpleadoServices{
  @Autowired
  private EmpleadoRepository empleadoRepo;

  @Autowired
  private EmpleadoMapper empleadoMapper;

  @Override
  public EmpleadoDto getEmpleado(Integer id) {
    Empleado empleado = empleadoRepo.findById(id).get();
    return empleadoMapper.getDto(empleado);
  }

  @Override
  public EmpleadoDto setEmpleado(EmpleadoDto empleadoDto) {
    Empleado empleado = empleadoMapper.getEmpleado(empleadoDto);
    return empleadoMapper.getDto(empleadoRepo.save(empleado));
    }

  @Override
  public List<EmpleadoDto> getEmpleados() {
    List<Empleado> empleados = empleadoRepo.findAll();
    return empleadoMapper.getEmpleados(empleados);
  }
}
