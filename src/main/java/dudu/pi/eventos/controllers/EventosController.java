package dudu.pi.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dudu.pi.eventos.models.Evento;
import dudu.pi.eventos.repositories.EventoRepository;

@Controller
@RequestMapping("/eventos")
public class EventosController {
	@Autowired
	private EventoRepository er;

	@RequestMapping("/eventos/form")
	public String form() {
		return "eventos/formevento";
	}

	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
		System.out.println(evento);
		er.save(evento);
		return "eventos/evento-adicionado";
	}

	@GetMapping("/eventos")
	public String Listar() {
		List<Evento> eventos = er.findAll()
				ModelAndView mv = new ModelAndView("eventos/lista")
			mv.addObject("eventos", eventos);
		return mv;
	}
}
