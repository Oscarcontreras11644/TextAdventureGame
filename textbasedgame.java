import org.w3c.dom.xpath.XPathNamespace;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
import java.io.*;

//Oscar contreras
public class textbasedgame {
    public static void main(String[] args) {
        Scanner scan1 =new Scanner(System.in);
        String GM = null;
        Player p1 = new Player();

        //Asking player for name
        System.out.println("welcome to the game, what is your name");
        String phase = scan1.nextLine();
        System.out.println("hello" + phase + " are you ready to play the game");
        System.out.println("easy: 1 \n medium :2\n hard: 3");

        //setting the difficulty
        Scanner GameMode = new Scanner(System.in);
        GM = GameMode.nextLine();
        if(GM.equals("1")) {
            p1.Playerhealth(50);
            p1.Playerdmg(25);
        }
        else if (GM.equals("2")) {
            p1.Playerhealth(40);
            p1.Playerdmg(20);
        }
        else if (GM.equals("3")) {
            p1.Playerhealth(30);
            p1.Playerdmg(15);
        }
        else(
                System.out.println("please pick a proper difficulty");
                    )
        // create health pot variables
        int healthPotHealing = 30;
        int healthPotDrop = 50;
        int healthPotNum;

        // main game loop
        boolean running = true;

        do (
                while(p1.GetHealth() > 0) {
                    // first dialog of every fresh round
            System.out.println("\t" + PName +  "'s HP: " + p1.GetHealth());
            System.out.println("\t\nwhat would you like to do?");
            System.out.println("\t1. Explore!");
            System.out.println("t2. heal!");
            System.out.println("\t3. Exit!");

        }
}
