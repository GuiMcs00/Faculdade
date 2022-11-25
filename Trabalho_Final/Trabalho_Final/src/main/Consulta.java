package main;

import java.time.LocalDateTime;
;


public class Consulta {
	private LocalDateTime data;
	private LocalDateTime hora;
	private String local;
	private String especialidade;
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public LocalDateTime getHora() {
		return hora;
	}
	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public Consulta(LocalDateTime data, LocalDateTime hora, String local, String especialidade) {
		super();
		this.data = data;
		this.hora = hora;
		this.local = local;
		this.especialidade = especialidade;
	}
	public Consulta() {
		
	}
	

}
