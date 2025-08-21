package com.taller1.taller1.mapper;

import com.taller1.taller1.dto.ProyectoDto;
import com.taller1.taller1.models.Proyecto;

public interface ProyectoMapper {
  Proyecto getProyecto(ProyectoDto proyectoDto);
  ProyectoDto getDto(Proyecto proyecto);
}
