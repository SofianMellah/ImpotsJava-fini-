package com.afpa.www.bean;

public class Impots {
    private int age;
    private String sexe;

    public Impots(int age, String sexe){
        this.age = age;
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void calcule(){
        boolean imposable = ( age >= 20 && sexe.equalsIgnoreCase("Homme")) || (age >= 18 && age <= 35 && (sexe.equalsIgnoreCase("Femme")));
        if (imposable){
            System.out.println("Vous êtes imposable");
        } else {
            System.out.println("Vous n'êtes pas imposable");
        }
    }
}
