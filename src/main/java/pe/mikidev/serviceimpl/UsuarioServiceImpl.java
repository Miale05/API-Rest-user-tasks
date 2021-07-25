package pe.mikidev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.mikidev.model.Usuario;
import pe.mikidev.repository.IUsuarioRepository;
import pe.mikidev.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private IUsuarioRepository dUsuario;

	@Override
	@Transactional
	public Usuario registrar(Usuario usuario) {
		return dUsuario.save(usuario);
	}

	@Override
	@Transactional
	public void eliminar(int idUsuario) {
		dUsuario.deleteById(idUsuario);
	}

	@Override
	@Transactional()
	public Usuario findUsuarioById(int idUsuario) {
		return dUsuario.findById(idUsuario).orElse(null);
	}

	@Override
	@Transactional()
	public List<Usuario> listar() {
		return dUsuario.findAll();
	}

}
