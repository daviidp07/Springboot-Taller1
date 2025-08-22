package com.taller1.taller1.services;

import java.util.List;

import com.taller1.taller1.dto.EmpleadoDto;

public interface EmpleadoServices {
  public EmpleadoDto getEmpleado(Integer id);
  public EmpleadoDto setEmpleado(EmpleadoDto empleadoDto);
  public List<EmpleadoDto> getEmpleados();
}
