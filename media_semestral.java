import java.util.Scanner;
import java.text.DecimalFormat;

public class media_semestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat formatter= new DecimalFormat("0.00");
		// Variavéis peso das provas
		int pesoProva = 3;
		int pesoProjeto = 3;
		int pesoLista = 2;
		int pesoMooc = 3;
		int pesoTotal = pesoProva + pesoProjeto+pesoLista+pesoMooc;
		
		//Captura de Infos e Apresentação PG
		
		System.out.println("Seja Bem Vindo ao Sistema de Notas da NextLevel");
		System.out.print("Qual o seu nome? ");
		String nome = sc.nextLine(); 
		System.out.println("Seja Bem Vindo "+nome+".");
		System.out.println("Nas próximas linhas preencha as notas e informações do aluno");
		System.out.print("Qual o nome do aluno: ");
		String nomeAluno = sc.nextLine();
		System.out.print("Digite a nota da nota da prova do aluno "+nomeAluno+":");
		double notaProva = sc.nextDouble();
		System.out.print("Digite a nota da nota do projeto do aluno "+nomeAluno+":");
		double notaProjeto = sc.nextDouble();
		System.out.print("Digite a nota da nota da lista de exercícios do aluno "+nomeAluno+":");
		double notaLista = sc.nextDouble();
		System.out.print("Digite a nota da nota do projeto MOOC do aluno "+nomeAluno+":");
		double notaMooc = sc.nextDouble();
		sc.close();
	
		//Calculos de Média Ponderada
		double notaProvaFn = notaProva * pesoProva; //Nota * Peso
		double notaProjetoFn = notaProjeto * pesoProjeto;
		double notaListaFn = notaLista * pesoProjeto;
		double notaMoocFn = notaMooc * pesoMooc;
		double notaSemTotal = notaProvaFn + notaProjetoFn + notaListaFn + notaMoocFn;
		
		
		// Fórmula aprovação
		double notaSemestreFn = notaSemTotal / pesoTotal;
		double exameNota = 10 - notaSemestreFn ;
		//Aprovado ou reprovado
		if (notaSemestreFn <= 8) {
			System.out.println("Situação do Aluno: REPROVADO");
		} else {
			System.out.println("Situação do Aluno: APROVADO");
		} 
		//Se aluno reprovado, exame
		
		if (notaSemestreFn < 8) {
			System.out.println("Para o aluno ser aprovado precisa tirar "+formatter.format(exameNota)+" na prova final.");
		}
		
		
		}
				
	}




