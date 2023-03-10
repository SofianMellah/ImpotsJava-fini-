package com.afpa.www.main;

import com.afpa.www.bean.Impots;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = 0;
        System.out.println("Veuillez saisir votre âge :");
        age = sc.nextInt();
        String sexe = "";
        System.out.println("Veuillez saisir votre genre :");
        sexe = sc.next();
        if(sexe.equalsIgnoreCase("homme") || sexe.equalsIgnoreCase("femme")){
            Impots maVar = new Impots(age, sexe);
            maVar.calcule();
        }else{
            System.out.println("Merci d'entrer un sexe valide, ( Homme ou Femme ).");
        }
    }
}