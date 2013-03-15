/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package despesateste2nb;

import java.util.Scanner;

/**
 *
 * @author Karlos
 */
public class Menu {

    
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args){

        int op;
        System.out.println("=MENU DE OPÇÕES DO PROGRAMA=");

        System.out.println("1 - Criar Despesa");
        System.out.println("2 - Criar Tipo Despesa");
        System.out.println("3 - .....");
        System.out.println("4 - Resgistar Despesa");
        

        System.out.println("Qual a sua opção? ");
        op = ler.nextInt();
        ler.nextLine();

   
    }
}
