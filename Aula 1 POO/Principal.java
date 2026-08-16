public class Principal {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Mateus";
        aluno1.endereco = "Rua das Flores, 125";
        aluno1.telefone = "(48) 99999-1234";
        aluno1.email = "mateus@email.com";
        aluno1.matricula = "2026001";
        System.out.println(aluno1.nome);
        System.out.println(aluno1.endereco);
        System.out.println(aluno1.telefone);
        System.out.println(aluno1.email);
        System.out.println(aluno1.matricula);

    }
}
