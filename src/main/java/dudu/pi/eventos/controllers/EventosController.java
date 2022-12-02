package dudu.pi.eventos.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import antlr.collections.List;
import dudu.pi.eventos.models.Evento;
import dudu.pi.eventos.models.convidado;
import dudu.pi.eventos.repositories.ConvidadoRepository;
import dudu.pi.eventos.repositories.EventoRepository;

@Controller
@RequestMapping("/eventos")
public class EventosController {
	
    @Autowired
	private EventoRepository er;
    @Autowired
    private ConvidadoRepository cr;
    
	@GetMapping("/form")
	public String form() {
	return "eventos/formevento";
}
	@PostMapping("/eventos")
	public String adicionar(Evento evento ) {
		
		System.out.println(evento);
		
		 er.save(evento);
		return "eventos/evento-adicionado";
	}
	@GetMapping
	public ModelAndView listar() {
		List<Evento> eventos = er.findAll();
		ModelAndView mv = new ModelAndView("eventos/lista");
		mv.addObject("eventos", evento);
		return mv;
	}
	@GetMapping("/{id}")
	public ModelAndView detalhar(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView();
		Optional<Evento> opt = er.findById(id)
		
				ModelAndView md;
				if (opt.isEmpty)) {
					md.setViewName("redirect:/eventos");
					return md;
				
				}
				md.setViewName("eventos/detalhe");
				Evento evento = opt.get();
				md.addObject("evento", evento);
				
				List<convidado> convidados = cr.findByEvento(evento);
				md.addObject("convidados", convidados);
				
				return md;
				
	}
	@PostMapping("/{idEvento}")
	public String savarConvidado(@PathVariable Long idEvento, Convidado convidado) {
		
		System.out.println("Id do evento:"+ idEvento);
		System.out.println("convidado");
        
		Optional<Evento> opt = er.findById(idEvento);
		if(opt.isEmpty()) {
			return "redirect/eventos";
		}
		Evento evento = opt.get()
		convidado.setEvento(evento);
		cr.save(convidado);
		
		return ("redirect:/eventos/{idEvento}");
		
	}
	@GetMapping("/{id}/remover")
	public String apagarEvento( @PathVariable Long id) {
		Optional<Evento> opt = er.findById(id);
		if(!opt.isEmpty()) {
			Evento evento = opt.get()
			er.delete(evento);
		}
		return "redirect:/eventos";
		
	}
}
