/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardotp1;

/**
 * @author Aluno
 */
public class Flash extends Hero {

    private String velocidade;

    public Flash(String name, Integer PowerLvl) {
        super(name, PowerLvl);
    }

    @Override
    public void usePower() {
        this.velocidade = "luz";
        System.out.println("Eu corro na velocidade da " + velocidade);
    }

}
