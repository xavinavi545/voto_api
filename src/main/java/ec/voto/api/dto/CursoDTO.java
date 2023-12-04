package ec.voto.api.dto;

import ec.voto.api.domain.Estudiante;
import ec.voto.api.domain.Mesa;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@MappedSuperclass
@Getter
@Setter
@ToString
public class CursoDTO {
   private long id;
   private String nombreDelCurso;
   private String estudiantes;
   private String mesas;
}
