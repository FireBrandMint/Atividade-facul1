import jade.content.onto.Ontology;
import jade.core.Agent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserAgent extends Agent
{
    //to prevent fully qualified names from being used like core.example.HelloAgent
    //i moved this to the origin folder

    private ArrayList<String> books = new ArrayList<>();
    protected void setup ()
    {
        //addbehaviour adds shit in
        /*
        System.out.println("Perfil: \"" + this.getLocalName() + "\" sendo inicializado.");

        Scanner fodder1 = new Scanner(System.in);
        boolean escape = false;
        while (!escape)
        {
            System.out.println("Escolha um livro para \'" + this.getLocalName() + "\' comprar \n(digite 'pare' caso não queira comprar mais).");
            String livro = fodder1.nextLine();
            if(livro.equals("pare")) escape = true;
            else books.add(livro);
        }
         */

        System.out.println("Perfil \"" + this.getLocalName() + "\" (" + this.getName() + ") foi inicializado.");
        //System.out.print("Ele quer comprar os seguintes livros: " + (books.size() == 0 ? "NENHUM" : ""));
        //for(int i = 0; i < books.size(); ++i)
        //{
        //    System.out.print(books.get(i) + ", ");
        //}
        System.out.println();
        System.out.println("Info:");
        System.out.println(this.getAID());
        System.out.println("Endereços:");
        String whole = "";
        Iterator fodder2 = getAID().getAllAddresses();
        while (fodder2.hasNext())
            whole += (fodder2.next() + "\n");
        System.out.println(whole);
    }
}
