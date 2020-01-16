package Conexoes;

public class TesteConexao {
    public static void main(String[] args) {
//Conexão com exception e Tratamento
        try (Conexao conexao = new Conexao() ) {
            conexao.lerDadosEx();
        }catch (Exception ex){
            System.out.println("Erro na conexão: T-T\n");
        }
//Conexão sem Exceptions
        try (Conexao conexao = new Conexao()){
            conexao.lerDados();
        }catch (Exception ex){
            System.out.println("Erro na conexão: T-T");
        }
    }
}
