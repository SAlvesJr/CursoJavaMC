package com.SAlvesjr.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SAlvesjr.cursomc.domain.Cliente;
import com.SAlvesjr.cursomc.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	ClienteService clienteService;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Cliente> find(@PathVariable Long id) {
		Cliente obj = clienteService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
