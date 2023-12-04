package ec.voto.api.dto;
import ec.voto.api.domain.Estudiante;
import ec.voto.api.domain.Mesa;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@ToString
public class VotacionDTO {
    private Long id;
    private EstudianteDTO estudiante;
    private MesaDTO mesa;
    private Date fecha;
    private String listas_de_votos;

}
