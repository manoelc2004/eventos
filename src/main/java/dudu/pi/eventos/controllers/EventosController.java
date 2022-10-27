package dudu.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
	return "formevento";
}
	@PostMapping("/eventos")
	public String adicionar(Evento evento ) {
		System.out.println(evento);
		return "evento-adicionado";
	}
}
