package org.example.cap1;

import java.util.ArrayList;
import java.util.List;

public class NomesQueRevelamSeuProposito {

//     Esse método está mal feito, pois não temos nenhuma clareza do que esse método está fazendo. Por exemplo o theList
//    não sabemos o que é ou de que tipo ele é.
    List<int[]> theList = new ArrayList<>();  // Criamos esse the list para não dar erro no código, nesse exemplo só
//    vamos levar em consideração o método

    public List<int[]> getThem(){
        List<int[]> list1 = new ArrayList<>();

        for (int[] x : theList){
            if (x[0] == 4)
                list1.add(x);
        }
        return list1;
    }

    // Escrevendo o código de maneira mais clara, onde só pelo leitura dele podemos identificar o que deseja fazer.
    // Digamos que estamos trabalhando em um jogo de campo minado.

//    public List<Cell> getFlaggedCells(){
//        List<int[]> flaggedCells = new ArrayList<int[]>();
//        for (int[] cell : gameBorad)
//            if (cell[STATUS_VALUE] == FLAGGED)
//                flaggedCells.add(cell);
//        return flaggedCells;
//    }

    // Com essas mudanças, podemos ver que o código ficou mais claro e mais fácil de entender, pois agora sabemos que
    // estamos trabalhando com um jogo de campo minado e que estamos pegando as células que estão com a bandeira.
}
