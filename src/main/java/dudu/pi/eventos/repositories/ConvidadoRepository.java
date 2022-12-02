package dudu.pi.eventos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dudu.pi.eventos.models.convidado;

public interface ConvidadoRepository extends JpaRepository<convidado, Long> {

	 List<convidado> findByEvento(Evento evento)
}
