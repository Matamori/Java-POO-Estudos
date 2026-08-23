package controle;
import modelo.Cliente;
import modelo.Veiculo;
public class Principal {
    public static void  main(String[] args){
        Cliente cliente = new Cliente();
        cliente.nome = "Mateus";
        cliente.cpf = "0123456789";
        cliente.endereco = "Rua A, Numero 1";
        cliente.telefone = "21 012345678";
        cliente.email = "mateus96amorim@gmail.com";

        Veiculo veiculo = new Veiculo();
        veiculo.placa = "123-Abc";
        veiculo.modelo = "Cetla";
        veiculo.ano = 2004;
        veiculo.fabricante = "Chevrolet";
        veiculo.cor = "Prata";

        veiculo.cliente = cliente;
        System.out.println(veiculo.cliente.nome);
        System.out.println(veiculo.cliente.cpf);
        System.out.println(veiculo.cliente.endereco);
        System.out.println(veiculo.cliente.telefone);
        System.out.println(veiculo.cliente.email);

        cliente.veiculo = veiculo;
        System.out.println(cliente.veiculo.placa);
        System.out.println(cliente.veiculo.modelo);
        System.out.println(cliente.veiculo.ano);
        System.out.println(cliente.veiculo.fabricante);
        System.out.println(cliente.veiculo.cor);

    }
}
