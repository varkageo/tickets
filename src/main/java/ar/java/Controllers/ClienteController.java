package ar.java.Controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import ar.java.DTO.ClienteDTO;
import ar.java.Models.Cliente;
import ar.java.Repositories.ClienteRepository;

import java.lang.*;

@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/")
	public ArrayList<ClienteDTO> listarTodos(){
		
		ClienteDTO clienteDTO;
		Cliente unCliente;
		
		ArrayList<ClienteDTO>respuesta = new ArrayList<ClienteDTO>();
		Iterable<Cliente>listaClientes;
		
		listaClientes = this.clienteRepository.findAll();
		
		Iterator<Cliente> it = listaClientes.iterator();
		while(it.hasNext()) {
			
			unCliente = it.next();
			if (unCliente.getBorrado()!=true) {
				
				clienteDTO = new ClienteDTO();
				
				clienteDTO.setNombre(unCliente.getNombre());
				clienteDTO.setApellido(unCliente.getApellido());
				clienteDTO.setMail(unCliente.getMail());
				
				System.out.println(clienteDTO.getNombre());
				respuesta.add(clienteDTO);
				
			}
		}
		return respuesta;
	}
	
	@GetMapping("/{id}")
	public ClienteDTO listarUno(@PathVariable Integer id) {
		
		ClienteDTO respuesta = new ClienteDTO();
		
		Cliente unCliente = clienteRepository.findById(id).orElse(null);
		
		if(unCliente==null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "cliente no encontrado");
		}
		
		respuesta.setNombre(unCliente.getNombre());
		respuesta.setApellido(unCliente.getApellido());
		respuesta.setMail(unCliente.getMail());
		respuesta.setId(unCliente.getId());
		
		return respuesta;

	}
	
	@PostMapping("/")
	public ClienteDTO guardar(@RequestBody ClienteDTO body) {
		
		ClienteDTO respuesta = new ClienteDTO();
		
		Cliente clienteGuardar = new Cliente();
		
		clienteGuardar.setNombre(body.getNombre());
		clienteGuardar.setApellido(body.getApellido());
		clienteGuardar.setMail(body.getMail());
		
		this.clienteRepository.save(clienteGuardar);
		
		respuesta.setNombre(clienteGuardar.getNombre());
		respuesta.setApellido(clienteGuardar.getApellido());
		respuesta.setMail(clienteGuardar.getMail());
		respuesta.setId(clienteGuardar.getId());
		
		return respuesta;
		
	}
	

}
