package escolapoo;
import escola.Disciplina;
import escola.Professor;

public class AssociacaoMuitosParaMuitos {
	public static void main(String[] args) {
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("Matemática");
		disciplina1.setCargaHoraria(80);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("Português");
		disciplina2.setCargaHoraria(80);
		
		Professor professor1 = new Professor();
		professor1.setNome("Jão");
		professor1.setMatricula(123);
		professor1.setFormacaoAcademica("Licenciado");
		professor1.setSalario(10);		
		
		Professor professor2 = new Professor();
		professor2.setNome("Maria");
		professor2.setMatricula(999);
		professor2.setFormacaoAcademica("Licenciada");
		professor2.setSalario(30);
		
		//relação Jão com matemática
		professor1.adicionarDisciplina(disciplina1);
		disciplina1.adicionarProfessor(professor1);
		
		//relação Jão com português
		professor1.adicionarDisciplina(disciplina2);
		disciplina2.adicionarProfessor(professor1);
		
		//relação Maria com português
		professor2.adicionarDisciplina(disciplina2);
		disciplina2.adicionarProfessor(professor2);
		
		//listar as disciplinas do professor Jão
		System.out.println("Disciplinas do professor " + professor1.getNome());
		for (int i = 0; i < professor1.quantidadeDisciplinas(); i++) {
			//Disciplina disciplina = professor1.getDisciplina(i);
			//System.out.println(disciplina.getNome());
			System.out.println(professor1.getDisciplina(i).getNome());
		}
		
		//listar os professores da disciplina de português
		System.out.println("\nProfessores de " + disciplina2.getNome());
		for (int i = 0; i < disciplina2.quantidadeProfessor(); i++) {
			System.out.println(disciplina2.getProfessor(i).getNome() + ", Carga horária: " + disciplina2.getCargaHoraria());
		}		
	}
}
