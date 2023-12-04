package ec.voto.api.service;

import ec.voto.api.dto.CursoDTO;

import java.util.List;
import java.util.Optional;

public interface GenericCrudService<DOMAIN, DTO> {

	public DTO save(DTO dto);

	public DTO update(DTO dto);

	public DTO delete(DTO dto);

	public abstract Optional<DOMAIN> find(DTO dto);

	public List<DTO> findAll(DTO dto);

	DOMAIN mapToDomain(DTO dto);

	DTO mapToDto(DOMAIN domain);
}
