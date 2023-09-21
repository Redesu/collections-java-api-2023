package main.java.generics.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;

    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        
        agendaContatos.adicionarContato("Contato 1", 123456);
        agendaContatos.adicionarContato("Contato 1", 0);
        agendaContatos.adicionarContato("Contato 1 0", 111111);
        agendaContatos.adicionarContato("Contato 11", 564879);
        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisaPorNome("Contato 11"));

        System.out.println("atualizado: "  + agendaContatos.atualizarNumeroContato("Contato 1 0", 1112));
        agendaContatos.exibirContato();



    }

    

}
