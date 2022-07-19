package com.baz.examen.service.iface;

import java.util.List;

import com.baz.examen.model.AmigoDTO;
import com.baz.examen.model.UsuarioDTO;

public interface AdministracionService {
	
	public UsuarioDTO guardarUsuario(UsuarioDTO usuario);
	
	public List<UsuarioDTO> consultarUsuariosNotInIdUsuario(Integer idUsuario);

	public List<AmigoDTO> consultarAmigosByIdUsuario(Integer idUsuario);

}
