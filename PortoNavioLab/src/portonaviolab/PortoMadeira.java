package portonaviolab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andreneves
 * @version 1.0
 */

public class PortoMadeira extends Navio{
    
      public int num_max_toneladas;

      public PortoMadeira (String matricula) {
            super(matricula);
      //passa parâmetro para o construtor da superclasse 
      }

    public int getNum_max_toneladas() {
        return num_max_toneladas;
    }

    public void setNum_max_toneladas(int num_max_toneladas) {
        this.num_max_toneladas = num_max_toneladas;
    } 
    
    public String toString() {
        return "Porta-Madeira{" + "Matricula= " + matricula + ", Nome= " + nome + ", Comprimento= " + comprimento + ", Número Máximo de Toneladas= "+ num_max_toneladas +'}';
    }
}
