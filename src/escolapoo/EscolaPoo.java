package escolapoo;
import escola.Disciplina;

public class EscolaPoo {

	public static void main(String[] args) {
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("Matemática");
		disciplina1.setCargaHoraria(-10);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("Geografia");
		disciplina2.setCargaHoraria(10);
		
		System.out.println(disciplina1.getNome());
		System.out.println(disciplina1.getCargaHoraria());
		System.out.println(disciplina2.getNome());
		System.out.println(disciplina2.getCargaHoraria());
		
	}
	
}
