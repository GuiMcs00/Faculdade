package main;
import java.time.LocalDateTime;


public class Atendente {
	private String nome;
	private LocalDateTime admissao;
	private String matricula;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDateTime getAdmissao() {
		return admissao;
	}
	public void setAdmissao(LocalDateTime admissao) {
		this.admissao = admissao;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Atendente(String nome, LocalDateTime admissao, String matricula) {
		super();
		this.nome = nome;
		this.admissao = admissao;
		this.matricula = matricula;
	}
	public Atendente() {
		
	}
	
	

}
