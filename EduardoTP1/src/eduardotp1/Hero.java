/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardotp1;

/**
 *
 * @author Aluno
 */
public abstract class Hero {
    private String name;
    private Integer PowerLvl;

    public Hero(String name, Integer PowerLvl) {
        this.name = name;
        this.PowerLvl = PowerLvl;
    }

    public String getName() {
        return name;
    }

    public Integer getPowerLvl() {
        return PowerLvl;
    }

    
    abstract void usePower();

    @Override
    public String toString() {
        return "Nome do heroi = " + name + ", Nivel de poder=" + PowerLvl;
    }


}
