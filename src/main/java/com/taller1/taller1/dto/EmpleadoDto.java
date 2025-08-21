package com.taller1.taller1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmpleadoDto {
  private Integer id;
  private String nom;
  private String ape;
  private String dir;
  private Long tel;
}
