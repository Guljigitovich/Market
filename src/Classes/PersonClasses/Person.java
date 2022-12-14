package Classes.PersonClasses;

import Enums.Gender;
import Enums.Nationality;
import Enums.PositionMan;

import java.math.BigDecimal;

public class Person {
    private String name;
    private int age;
    private Gender gender;
    private BigDecimal money ;
    private PositionMan positionMan;
    private Nationality nationality;

    public Person(String name, int age, Gender gender, BigDecimal money, PositionMan positionMan, Nationality nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.money = money;
        this.positionMan = positionMan;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public PositionMan getPositionMan() {
        return positionMan;
    }

    public void setPositionMan(PositionMan positionMan) {
        this.positionMan = positionMan;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return String.format("""
                 Full name : %s
                Age : %s
                Gender : %s
                Money : %s
                Speciality : %s
                Nationality : %s
                ---------------------------
                """,getName(),getAge(),getGender(),getMoney(),getPositionMan(),getNationality());
    }
}
