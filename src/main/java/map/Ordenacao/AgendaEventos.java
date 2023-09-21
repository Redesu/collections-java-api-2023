package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirEventos() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O proximo evento:" + entry.getValue() + "Acontecerá na data " + entry.getKey());
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 2), "Evento 1", "Atraçao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 3), "Evento 2", "Atraçao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 4), "Evento 3", "Atraçao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 5), "Evento 4", "Atraçao 4");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 6), "Evento 5", "Atraçao 5");

        agendaEventos.exibirEventos();

        agendaEventos.obterProximoEvento();


    }

}
