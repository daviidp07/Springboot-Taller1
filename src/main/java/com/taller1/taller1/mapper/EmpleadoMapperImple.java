package com.taller1.taller1.mapper;

import java.util.ArrayList;
import java.util.List;

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
  public EmpleadoDto getDto(Empleado empleado) {
    if (empleado == null) {
      return null;
    }
    EmpleadoDto empleadoDto = new EmpleadoDto();
    empleadoDto.setId(empleado.getId());
    empleadoDto.setNom(empleado.getNom());
    empleadoDto.setDir(empleado.getDir());
    empleado.setTel(empleadoDto.getTel());
    return empleadoDto;
  }

  @Override
  public List<EmpleadoDto> getEmpleados(List<Empleado> empleados) {
    if (empleados == null) {
      return null;
    }
    List<EmpleadoDto> empleadosDto = new ArrayList<EmpleadoDto>(empleados.size());
    for (Empleado empleado : empleados) {
      empleadosDto.add(getDto(empleado));
    }
    return empleadosDto;
  }
}
