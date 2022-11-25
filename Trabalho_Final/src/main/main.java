package main;


import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;  
import main.Atendente;

public class main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String [] args) {
		
		opcoes();
	}
	public static void opcoes() {
		byte opcao = 0;
		do {
		   System.out.println("Menu de Opções do Sistema Clínica");
		   System.out.println("Informe:");
		   System.out.println("1. Atendente"); //Atendente
		   System.out.println("2. Atestado"); // Atestado
		   System.out.println("3. Consulta"); //Consulta
		   System.out.println("4. Diagnostico"); // Diagnostico  
		   System.out.println("5. Tratamento"); // Tratamento
		   System.out.println("6. Médico"); // Médico
		   System.out.println("7. Doenca"); // Doeença
		   System.out.println("8. Paciente"); // Paciente
		   System.out.println("0. Para sair");

		   opcao = sc.nextByte();
		   switch (opcao) {
			 case 1: atendente(); break;
			 case 2: atestado(); break;
			 case 3: consulta(); break;
			 case 4: diagnostico(); break;
			 case 5: tratamento(); break;
			 case 6: medico(); break;
			 case 7: doenca(); break;
			 case 8: paciente(); break;
		   }
	 	
		
		
	}while(opcao!=0); }
	
	  public static void atendente() {
		LocalDateTime now = LocalDateTime.now();
		Atendente teste = new Atendente ();
		teste.setNome("Pessoa X");			//Atendente
		teste.setAdmissao(now);
		System.out.println(teste.getNome());
		System.out.println(teste.getAdmissao());
	  }

	  public static void atestado() {
		  System.out.println("Atestado");
			LocalDateTime now = LocalDateTime.now();
		Atestado teste = new Atestado();
		teste.setInicio(now);
		teste.setTermino(now);
		teste.setDescricao("Descricao"); //Atestado
		System.out.println(teste.getInicio());
		System.out.println(teste.getTermino());
		System.out.println(teste.getDescricao());
	  }
	
	
	public static void consulta(){
			LocalDateTime now = LocalDateTime.now();
		Consulta teste = new Consulta();
		teste.setData(now);
		teste.setHora(now);
		teste.setLocal("Local");
		teste.setEspecialidade("Especialidade"); //Consulta
		System.out.println(teste.getData());
		System.out.println(teste.getHora());
		System.out.println(teste.getLocal());
		System.out.println(teste.getEspecialidade());
	}

	public static void diagnostico(){
			LocalDateTime now = LocalDateTime.now();
		Diagnostico teste = new Diagnostico();
		teste.setAlta(now);
		teste.setInternacao(now);
		System.out.println(teste.getAlta());
		System.out.println(teste.getInternacao());
	}

	public static void tratamento(){
			LocalDateTime now = LocalDateTime.now();
		Tratamento teste = new Tratamento();
		teste.setDiagnostico("Diagnostico");
		teste.setRemedio("Remedio");
		teste.setTratamento("Tratamento");
		System.out.println(teste.getDiagnostico());
		System.out.println(teste.getRemedio());
		System.out.println(teste.getTratamento());
		}

	public static void medico(){
			LocalDateTime now = LocalDateTime.now();
		Medico teste = new Medico();
		teste.setNome("Nome");
		teste.setMatricula("Matricula");
		teste.setAdmissao(now);
		System.out.println(teste.getNome());
		System.out.println(teste.getMatricula());
		System.out.println(teste.getAdmissao());
	}

	public static void doenca(){
			LocalDateTime now = LocalDateTime.now();
		Doenca teste = new Doenca();
		teste.setNome("Doenca");
		teste.setGravidade("Gravidade");
		teste.setSintoma("Sintoma");
		System.out.println(teste.getNome());
		System.out.println(teste.getGravidade());
		System.out.println(teste.getSintoma());
		}


	public static void paciente(){
		Paciente teste = new Paciente();
		teste.setNome("Nome do Paciente");
		teste.setEndereco("Endereco do Paciente");
		teste.setTelefone("Telefone do Paciente");
		teste.setCpf("Cpf do Paciente");
		System.out.println(teste.getNome());
		System.out.println(teste.getEndereco());
		System.out.println(teste.getTelefone());
		System.out.println(teste.getCpf());
	}
}


	