package com.baz.examen.service.impl.remote;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.baz.examen.model.AmigoDTO;
import com.baz.examen.model.UsuarioDTO;
import com.baz.examen.service.iface.remote.EntityAdministracionServiceRemote;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class EntityAdministracionServiceFallback implements EntityAdministracionServiceRemote {

	@Override
	public UsuarioDTO guardarUsuario(UsuarioDTO usuario) {
		log.error("Error controlado, servicio entity administracion con endpoint /usuario no disponible, evitando timeout");
		return new UsuarioDTO();
	}

	@Override
	public List<UsuarioDTO> consultarUsuariosNotInIdUsuario(Integer idUsuario) {
		log.error("Error controlado, servicio entity administracion con endpoint /usuarios/notin/{idUsuario} no disponible, evitando timeout");
		return new ArrayList<UsuarioDTO>();
	}

	@Override
	public List<AmigoDTO> consultarAmigosByIdUsuario(Integer idUsuario) {
		log.error("Error controlado, servicio entity administracion con endpoint /amigos/usuario/{idUsuario} no disponible, evitando timeout");
		return new ArrayList<AmigoDTO>();
	}

}
