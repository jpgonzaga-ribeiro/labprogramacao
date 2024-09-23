/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardotp1;

/**
 * @author Aluno
 */
public class Aquaman extends Hero {
    private Integer QtdDias;

    public Aquaman(String name, Integer PowerLvl) {
        super(name, PowerLvl);
    }

    @Override
    public void usePower() {
        this.QtdDias = 12;
        System.out.println("Eu fico " + QtdDias + " dias debaixo dagua");
    }

}
