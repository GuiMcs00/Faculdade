package main;
import java.time.LocalDateTime;



public class Atestado extends Medico{
	public Atestado(String nome, String matricula, LocalDateTime admissao) {
		super(nome, matricula, admissao);
		this.inicio = inicio;
		this.termino = termino;
		this.descricao = descricao;
		// TODO Auto-generated constructor stub
	}
	private LocalDateTime inicio;
	private LocalDateTime termino;
	private String descricao;
	public LocalDateTime getInicio() {
		return inicio;
	}
	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}
	public LocalDateTime getTermino() {
		return termino;
	}
	public void setTermino(LocalDateTime termino) {
		this.termino = termino;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Atestado() {
	}
	
}
