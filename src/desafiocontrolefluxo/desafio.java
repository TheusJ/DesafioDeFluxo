package desafiocontrolefluxo;

import dominio.Interacao;
import dominio.ParametrosInvalidosException;

/**
 *
 * @author TheusJ
 * @since 02/05/2024
 */
public class desafio {
    public static void main(String[] args) {
        Interacao interacao = new Interacao();
        
        try {
                interacao.imprimir(6, 5);

        }
        catch(ParametrosInvalidosException e){
            System.err.println(e.getMessage());
            
        }
        
    }
    
}
