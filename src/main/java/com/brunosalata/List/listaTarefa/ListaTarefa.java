package com.brunosalata.List.listaTarefa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bruno Salata Lima - 16/05/2023
 * github.com/Brunosalata
 * @version 2.0.3
 * @project mBioLabv3
 */
public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionaTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTotalTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionaTarefa("Tarefa 1");
        listaTarefa.adicionaTarefa("Tarefa 2");
        listaTarefa.adicionaTarefa("Tarefa 3");
        System.out.println("Total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removeTarefa("Tarefa 2");
        System.out.println("Total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTotalTarefas();
    }
}
