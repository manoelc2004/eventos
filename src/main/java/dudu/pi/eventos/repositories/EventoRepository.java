package dudu.pi.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dudu.pi.eventos.models.Evento;

public interface EventoRepository extends JpaRepository< Evento, Long> {

}
