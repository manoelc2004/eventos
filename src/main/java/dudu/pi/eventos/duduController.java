package dudu.pi.eventos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class duduController {

	@RequestMapping("/")
	public String dudu() {
		System.out.println("chamou o método");
		return "dudu";
	}
}
