/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portonaviolab;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andreneves
 * @version 1.0
 */


public class Porto {
     public ArrayList<Navio> navios;
     
       public Porto(){
        navios = new ArrayList<>();
    }
    
    void inserir(Navio n) {
        if(buscar(n.matricula) == null)    
        navios.add(n);
    }
    
    public Navio buscar(String matricula){
        for(Navio n:navios)
            if(matricula == n.matricula)
                return n;
        return null;
    }
    
    //listar
    
    public void listar(){
        for(Navio n: navios)
       System.out.println(n);  
     
}
}
