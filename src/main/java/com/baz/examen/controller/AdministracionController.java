package com.baz.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.baz.examen.model.AmigoDTO;
import com.baz.examen.model.UsuarioDTO;
import com.baz.examen.service.iface.AdministracionService;

@RestController
public class AdministracionController {
	
	@Autowired
	private AdministracionService administracionService;
	
	@PostMapping("/usuario")
	public ResponseEntity<UsuarioDTO> guardarUsuario(@RequestBody UsuarioDTO usuario) {
		return new ResponseEntity<>(administracionService.guardarUsuario(usuario), HttpStatus.CREATED);
	}
	
	@GetMapping("/usuarios/notin/{idUsuario}")
	public ResponseEntity<List<UsuarioDTO>> consultarUsuariosNotInIdUsuario(@PathVariable Integer idUsuario) {
		return new ResponseEntity<>(administracionService.consultarUsuariosNotInIdUsuario(idUsuario), HttpStatus.OK);
	}

	@GetMapping("/amigos/usuario/{idUsuario}")
	public ResponseEntity<List<AmigoDTO>> consultarAmigosByIdUsuario(@PathVariable Integer idUsuario) {
		return new ResponseEntity<>(administracionService.consultarAmigosByIdUsuario(idUsuario), HttpStatus.OK);
	}
	
}
