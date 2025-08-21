package com.taller1.taller1.mapper;

import com.taller1.taller1.dto.EmpleadoDto;
import com.taller1.taller1.models.Empleado;

public interface EmpleadoMapper {
  Empleado getEmpleado(EmpleadoDto empleadoDto);
  EmpleadoDto getDto(Empleado empleado);
}
