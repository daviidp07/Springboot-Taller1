package com.taller1.taller1.mapper;

import org.springframework.stereotype.Component;

import com.taller1.taller1.dto.ProyectoDto;
import com.taller1.taller1.models.Proyecto;

@Component
public class ProyectoMapperImple implements ProyectoMapper{
  @Override
  public Proyecto getProyecto(ProyectoDto proyectoDto){
    if (proyectoDto == null){
    return null;
    }
    Proyecto proyecto = new Proyecto();
    proyecto.setId(proyectoDto.getId());
    proyecto.setNombre(proyectoDto.getNom());
    proyecto.setPresupuesto(proyectoDto.getPre());
    proyecto.setFechainicio(proyectoDto.getFecI());
    proyecto.setFechacierre(proyectoDto.getFecC());
    return proyecto;
  }

  @Override
  public ProyectoDto getDto(Proyecto proyecto){
    if (proyecto == null){
      return null;
    }

    ProyectoDto proyectoDto = new ProyectoDto();
    proyectoDto.setId(proyecto.getId());
    proyectoDto.setNom(proyecto.getNombre());
    proyectoDto.setPre(proyecto.getPresupuesto());
    proyectoDto.setFecI(proyecto.getFechainicio());
    proyectoDto.setFecC(proyecto.getFechacierre());
    return proyectoDto;
  }

}
