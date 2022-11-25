package main;
import java.time.LocalDateTime;

public class Tratamento extends Consulta{
	public Tratamento(LocalDateTime data, LocalDateTime hora, String local, String especialidade) {
		super(data, hora, local, especialidade);
		this.diagnostico = diagnostico;
		this.remedio = remedio;
		this.tratamento = tratamento;
		// TODO Auto-generated constructor stub
	}
	private String diagnostico;
	private String remedio;
	private String tratamento;
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getRemedio() {
		return remedio;
	}
	public void setRemedio(String remedio) {
		this.remedio = remedio;
	}
	public String getTratamento() {
		return tratamento;
	}
	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
	public Tratamento() {
		
	}
	

}
