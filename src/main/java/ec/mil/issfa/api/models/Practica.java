package ec.mil.issfa.api.models;

public class Practica {

    public String Verificar(int numero){
        double multiplo3 = numero%3;
        double multiplo5 = numero%5;
        if(multiplo3==0 && multiplo5 ==0)
            return "FIZZBUZZ";
        if(multiplo3==0 )
            return "FIZZ";    
        if( multiplo5 ==0)
            return "BUZZ";    
         return ""+numero;

    }
    
}
