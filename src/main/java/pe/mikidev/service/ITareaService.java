package pe.mikidev.service;

import java.util.List;

import pe.mikidev.model.Tarea;

public interface ITareaService {
	Tarea registrar(Tarea tarea);
	public void eliminar(int idTarea);
	Tarea findTareaById(int idTarea);
	List<Tarea> listar();
}
