import java.util.List;
import java.util.ArrayList;

public class SistemaAlunos {

    public static void main(String[] args) {
        // criei uma List, mas instanciei um ArrayList (polimorfismo)
        List<String> alunos = new ArrayList<>();

        
        alunos.add("Gabriel");
        alunos.add("Bruno");
        alunos.add("Carla");
        alunos.add("Isabela");
        alunos.add("Thais");
        alunos.add("Fabiano");
        // mostra alunos
        System.out.println(" Lista inicial de alunos ");
        mostrarAlunos(alunos);

        // remove um aluno
        alunos.remove("Bruno");

        System.out.println("\n Após remover Bruno ");
        mostrarAlunos(alunos);

        // verifica se algum aluno está presente na lista
        String busca = "Jorge";
        if (alunos.contains(busca)) {
            System.out.println("\n" + busca + " está cadastrada na lista.");
        } else {
            System.out.println("\n" + busca + " não está na lista.");
        }

        // mostrando o total de alunos
        System.out.println("\nTotal de alunos: " + alunos.size());
    }

    // método auxiliar para exibir os alunos (usando sobrecarga)
    public static void mostrarAlunos(List<String> lista) {
        for (String nome : lista) {
            System.out.println("- " + nome);
        }
    }
}
