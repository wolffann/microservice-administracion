package com.baz.examen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baz.examen.model.AmigoDTO;
import com.baz.examen.model.UsuarioDTO;
import com.baz.examen.service.iface.AdministracionService;
import com.baz.examen.service.iface.remote.EntityAdministracionServiceRemote;

@Service
public class AdministracionServiceImpl implements AdministracionService {
	
	@Autowired
	private EntityAdministracionServiceRemote entityAdministracionServiceRemote;
	
	@Override
	public UsuarioDTO guardarUsuario(UsuarioDTO usuario) {		
		return entityAdministracionServiceRemote.guardarUsuario(usuario);
	}
	
	@Override
	public List<UsuarioDTO> consultarUsuariosNotInIdUsuario(Integer idUsuario) {				
		return entityAdministracionServiceRemote.consultarUsuariosNotInIdUsuario(idUsuario);
	}

	@Override
	public List<AmigoDTO> consultarAmigosByIdUsuario(Integer idUsuario) {		
		return entityAdministracionServiceRemote.consultarAmigosByIdUsuario(idUsuario);
	}

}
