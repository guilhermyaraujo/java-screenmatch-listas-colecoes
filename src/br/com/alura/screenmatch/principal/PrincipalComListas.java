package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
//    Copiando os filmes e series para testar nova arrayList
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderose chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);


        //      Criando arraylist
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);




//        Fazendo um for para imprimir um arrayList
        for (Titulo item: lista){
            System.out.println(item.getNome());
//            Fazendo um type casting para quando chamar item receber filme
            Filme filme = (Filme) item;
            System.out.println("Classificação" + filme.getClassificacao());
//            Reescrita mais limpa desse for:
            /*
            lista.forEach (lista ->System.out.println(lista));
            * */

        }

    }
}
