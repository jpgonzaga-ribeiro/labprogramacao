/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardotp1;

/**
 * @author Aluno
 */
public class Batman extends Hero {

    public Batman(String name, Integer PowerLvl) {
        super(name, PowerLvl);
    }

    @Override
    public void usePower() {
        System.out.println("Eu sou rico");
    }

}
