package pe.mikidev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.mikidev.model.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer>{

}
