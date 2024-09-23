/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eduardotp1;

import java.util.ArrayList;

/**
 * @author Aluno
 */
public class EduardoTP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Batman batman = new Batman("Batman", 12);
        Superman superman = new Superman("Superman", 10);
        Aquaman aquaman = new Aquaman("Aquaman", 8);
        Flash flash = new Flash("Flash", 15);


        ArrayList<Hero> heros = new ArrayList<>();
        heros.add(batman);
        heros.add(superman);
        heros.add(aquaman);
        heros.add(flash);


        System.out.println("-------------------------------------------------");

        for (Hero h : heros) {
            System.out.println("Eu sou o " + h.getName());
            System.out.println("Meu poder eh: " + h.getPowerLvl());
            h.usePower();
            System.out.println("-------------------------------------------------");
        }
    }

}
