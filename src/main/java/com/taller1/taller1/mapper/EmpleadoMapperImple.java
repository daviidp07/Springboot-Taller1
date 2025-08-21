package com.taller1.taller1.mapper;

import org.springframework.stereotype.Component;

import com.taller1.taller1.dto.EmpleadoDto;
import com.taller1.taller1.models.Empleado;

@Component
public class EmpleadoMapperImple implements EmpleadoMapper{
  @Override
  public Empleado getEmpleado(EmpleadoDto empleadoDto) {
    if (empleadoDto == null) {
      return null;
    }
    Empleado empleado = new Empleado();
    empleado.setId(empleadoDto.getId());
    empleado.setNom(empleadoDto.getNom());
    empleado.setApe(empleadoDto.getApe());
    empleado.setDir(empleadoDto.getDir());
    empleado.setTel(empleadoDto.getTel());
    return empleado;
  }

  @Override
  public EmpleadoDto getDto(Empleado empleado)
}
