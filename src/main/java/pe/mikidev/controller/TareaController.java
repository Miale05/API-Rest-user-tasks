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

import pe.mikidev.model.Tarea;
import pe.mikidev.service.ITareaService;

@RestController
@RequestMapping("/apiTarea")
@CrossOrigin(origins = {"*"})
public class TareaController {

	@Autowired
	private ITareaService tService;
	
	@PostMapping("/save")
	public Tarea insertar(@RequestBody Tarea t) {
		return tService.registrar(t);
	}
	
	@PutMapping("/update/{id}")
	public Tarea modificar(@RequestBody Tarea t, @PathVariable Integer id) {
		Tarea objTarea = tService.findTareaById(id);
		
		objTarea.setTituloTarea(t.getTituloTarea());
		objTarea.setDescripcionTarea(t.getDescripcionTarea());
		objTarea.setFechaFin(t.getFechaFin());
		objTarea.setUsuario(t.getUsuario());
		
		return tService.registrar(objTarea);
	}
	
	@DeleteMapping("/delete/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		tService.eliminar(id);
	}
	
	@GetMapping("/tareas")
	public List<Tarea> listar() {
		return tService.listar();
	}
	
	@GetMapping("/tarea/{id}")
	public Tarea show(@PathVariable Integer id) {
		return tService.findTareaById(id); 
	}
	
}
