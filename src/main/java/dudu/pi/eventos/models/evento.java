package dudu.pi.eventos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class evento {
	
	@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) 
	
	private Long id;
	private String nome;
	private String local;
	private String data;
	private String horário;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String Nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getlocal() {
		return local;
	}

	public void setdata(String data) {
		this.data = data;
	}

	public String getdata() {
		return data;
	}

	public void sethorario(String horário) {
		this.horário = horário;
	}

	public String gethorario() {
		return horário;
	}

}
