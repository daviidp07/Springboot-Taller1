package com.taller1.taller1.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProyectoDto {
  private Integer id;
  private String nom;
  private Integer pre;
  private Date fecI;
  private Date fecC;
}
