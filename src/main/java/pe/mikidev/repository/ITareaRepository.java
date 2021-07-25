package pe.mikidev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.mikidev.model.Tarea;

@Repository
public interface ITareaRepository extends JpaRepository<Tarea,Integer>{

}
