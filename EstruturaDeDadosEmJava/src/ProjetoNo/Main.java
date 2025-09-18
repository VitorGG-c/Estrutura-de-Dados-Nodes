package ProjetoNo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* Exemplo com int
         No no1 = new No(1);
         No no2 = new No(2);
         No no3 = new No(3);*/

        // Exemplo com String
        No no1 = new No("Primeiro no");
        No no2 = new No("Segundo no");
        No no3 = new No("Terceiro no");


        //no1 -> no2 -> no3
        no1.setProximoNo(no2);
        no2.setProximoNo(no3);


        //Consultando todos os nós apontados por no1
        while (no1.getProximoNo() != null) {
            System.out.println(no1.getProximoNo());
            no1 = no1.getProximoNo();
        }

    }
}
