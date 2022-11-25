package main;
import java.time.LocalDateTime;

public class Doenca extends Consulta{
	public Doenca(LocalDateTime data, LocalDateTime hora, String local, String especialidade) {
		super(data, hora, local, especialidade);
		this.gravidade = gravidade;
		this.nome = nome;
		this.sintoma = sintoma;
		// TODO Auto-generated constructor stub
	}
	private String sintoma;
	private String gravidade;
	private String nome;
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	public String getGravidade() {
		return gravidade;
	}
	public void setGravidade(String gravidade) {
		this.gravidade = gravidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Doenca() {
		
	}
	

}
