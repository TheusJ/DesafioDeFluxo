package dominio;

public class ParametrosInvalidosException extends Exception {
    
    public static void exibirMenssagemErro(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro.");
        }
    }

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
