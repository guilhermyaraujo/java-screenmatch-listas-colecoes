package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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
//      Orndenando listas
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("********** Ordenação *********");
        System.out.println(buscaPorArtista);
        System.out.println("********** Ordenação *********");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("********** Ordenação *********");

//        Definindo outros criterios de comparação
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);

//        Interface list




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
