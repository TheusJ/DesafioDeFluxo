package dominio;

import dominio.ParametrosInvalidosException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author theusj
 */
public class Interacao {
    Scanner texto = new Scanner(System.in);

    
    
    public void imprimir(int num1, int num2) throws ParametrosInvalidosException{
        if(num1 > num2){
            throw new ParametrosInvalidosException("O segundo numero deve ser maior que o primeiro");
        
        }
        
        
        System.out.println("Parametro n1: "+num1 +"\nParametro n2: "+num2);
        for(int i = num1; i<num2; i++ ){
            System.out.println("Do "+i + " ate o "+num2);
        }
        
    }
    
        
    
}

        
    

