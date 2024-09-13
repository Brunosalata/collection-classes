package com.brunosalata.List.ordenação;

import com.brunosalata.List.ComparatorPorAltura;
import com.brunosalata.List.ComparatorPorIdade;
import com.brunosalata.List.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Bruno Salata Lima - 16/05/2023
 * github.com/Brunosalata
 * @version 2.0.3
 * @project mBioLabv3
 */
public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new com.brunosalata.List.ordenação.Pessoa(nome, idade, altura));
    }

    public List<com.brunosalata.List.ordenação.Pessoa> ordenarPorIdade() {
        List<com.brunosalata.List.ordenação.Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade, new ComparatorPorIdade());
        return pessoaPorIdade;
    }

    public List<com.brunosalata.List.ordenação.Pessoa> ordenarPorAltura() {
        List<com.brunosalata.List.ordenação.Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20,1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30,1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25,1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17,1.56);

        System.out.println(ordenacaoPessoa.pessoaList);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
