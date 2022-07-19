package com.baz.examen.service.iface.remote;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.baz.examen.model.AmigoDTO;
import com.baz.examen.model.UsuarioDTO;
import com.baz.examen.service.impl.remote.EntityAdministracionServiceFallback;

//@FeignClient(name = "entity-administracion", url = "localhost:8080", fallback=EntityAdministracionServiceFallback.class)
@FeignClient(name = "entity-administracion", fallback=EntityAdministracionServiceFallback.class)
public interface EntityAdministracionServiceRemote {

	@PostMapping("/usuario")
	public UsuarioDTO guardarUsuario(@RequestBody UsuarioDTO usuario);
	
	@GetMapping("/usuarios/notin/{idUsuario}")
	public List<UsuarioDTO> consultarUsuariosNotInIdUsuario(@PathVariable Integer idUsuario);
	
	@GetMapping("/amigos/usuario/{idUsuario}")
	public List<AmigoDTO> consultarAmigosByIdUsuario(@PathVariable Integer idUsuario);
	
}
