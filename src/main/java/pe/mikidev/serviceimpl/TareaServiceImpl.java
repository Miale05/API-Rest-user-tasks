package pe.mikidev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.mikidev.model.Tarea;
import pe.mikidev.repository.ITareaRepository;
import pe.mikidev.service.ITareaService;

@Service
public class TareaServiceImpl implements ITareaService {
	
	@Autowired
	private ITareaRepository dTarea;

	@Override
	@Transactional
	public Tarea registrar(Tarea tarea) {
		return dTarea.save(tarea);
		
	}

	@Override
	@Transactional
	public void eliminar(int idTarea) {
		dTarea.deleteById(idTarea);
		
	}

	@Override
	@Transactional()
	public Tarea findTareaById(int idTarea) {
		return dTarea.findById(idTarea).orElse(null);
	}

	@Override
	@Transactional()
	public List<Tarea> listar() {
		return dTarea.findAll();
	}

}
