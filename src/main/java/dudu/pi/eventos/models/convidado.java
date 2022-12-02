package dudu.pi.eventos.models;
 

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManytoOne;


 @Entity
public class convidado {

	 @Id
	 @GeneratedValue(Strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String nome;
	 private String rg;
	 public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	 @ManytoOne
	private Evento evento;{
}
	@Override
 public String toString() { 
	 return "convidado [id= " + id + ", nome=" + nome + ", rg=" + rg +", evento= " + evento +"]";
 }
	 
 }
