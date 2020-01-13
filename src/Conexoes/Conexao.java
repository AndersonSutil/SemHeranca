package Conexoes;

public class Conexao implements AutoCloseable {

    public Conexao(){
        System.out.println("Abrindo Conexao: ^^");
//        throw new IllegalStateException();
    }

    /**
     * Lendo os dados da conexao com Exception
     */
    public void lerDadosEx(){
        System.out.println("Lendo Dados: ~-~");
            throw new IllegalStateException();
    }

    /**
     * Lendo os dados da conexão sem Exception
     */
    public void lerDados(){
        System.out.println("Lendo Dados: >-<");
    }

    /**
     *Podemos usar o Close(): Unchecked/Checked com throws Exception na frente da Assinatura
     */
    @Override
    public void close()  {
        System.out.println("Fechando Conexao: (`-´)");
    }
}
