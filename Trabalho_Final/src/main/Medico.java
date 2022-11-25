package main;
import java.time.LocalDateTime;

public class Medico {
	private String nome;
	private String matricula;
	private LocalDateTime admissao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public LocalDateTime getAdmissao() {
		return admissao;
	}
	public void setAdmissao(LocalDateTime admissao) {
		this.admissao = admissao;
	}
	
	public Medico(String nome, String matricula, LocalDateTime admissao) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.admissao = admissao;
	}
	public Medico() {
		
	}
	

}
