package main.java.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("contato 1", 123125);
        agendaContatos.adicionarContato("contato 2", 123125);
        agendaContatos.adicionarContato("contato 3", 123125);
        agendaContatos.adicionarContato("contato 4", 123125);
        agendaContatos.adicionarContato("contato 5", 123125);

        agendaContatos.removerContato("contato 3");
        agendaContatos.exibirContato();
        
        System.out.println(agendaContatos.pesquisarPorNome("contato 5"));

    }
}
