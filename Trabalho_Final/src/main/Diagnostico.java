package main;
import java.time.LocalDateTime;


public class Diagnostico extends Medico{
	public Diagnostico(String nome, String matricula, LocalDateTime admissao) {
		super(nome, matricula, admissao);
		this.alta = alta;
		this.internacao = internacao;
		// TODO Auto-generated constructor stub
	}
	private LocalDateTime alta;
	private LocalDateTime internacao;
	public LocalDateTime getAlta() {
		return alta;
	}
	public void setAlta(LocalDateTime alta) {
		this.alta = alta;
	}
	public LocalDateTime getInternacao() {
		return internacao;
	}
	public void setInternacao(LocalDateTime internacao) {
		this.internacao = internacao;
	}
	
	public Diagnostico() {
		
		}
	

}
