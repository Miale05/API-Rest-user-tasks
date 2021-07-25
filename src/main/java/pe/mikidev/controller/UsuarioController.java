package pe.mikidev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.mikidev.model.Usuario;
import pe.mikidev.service.IUsuarioService;

@RestController
@RequestMapping("/apiUsuario")
@CrossOrigin(origins = {"*"})
public class UsuarioController {

	@Autowired
	private IUsuarioService uService;
	
	@PostMapping("/save")
	public Usuario insertar(@RequestBody Usuario u) {
		return uService.registrar(u);
	}
	
	@PutMapping("/update/{id}")
	public Usuario modificar(@RequestBody Usuario u, @PathVariable Integer id) {
		Usuario objUsuario = uService.findUsuarioById(id);
		
		objUsuario.setNombresUsuario(u.getNombresUsuario());
		objUsuario.setMaternoUsuario(u.getMaternoUsuario());
		objUsuario.setPaternoUsuario(u.getPaternoUsuario());
		objUsuario.setFechaNacimiento(u.getFechaNacimiento());
		objUsuario.setCorreoUsuario(u.getCorreoUsuario());
		objUsuario.setOcupacionUsuario(u.getOcupacionUsuario());
		
		return uService.registrar(objUsuario);
	}
	
	@DeleteMapping("/delete/{id}")
	public void eliminar(@PathVariable Integer id) {
		uService.eliminar(id);
	}
	
	@GetMapping("/usuarios")
	public List<Usuario> listar() {
		return uService.listar();
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario show(@PathVariable Integer id) {
		return uService.findUsuarioById(id);
	}
	
}
