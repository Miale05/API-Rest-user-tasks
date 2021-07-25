package pe.mikidev.service;

import java.util.List;

import pe.mikidev.model.Usuario;

public interface IUsuarioService {
	Usuario registrar(Usuario usuario);
	public void eliminar(int idUsuario);
	Usuario findUsuarioById(int idUsuario);
	List<Usuario> listar();
}
