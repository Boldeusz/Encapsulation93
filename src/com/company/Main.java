package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Player player = new Player();
//        player.name = "Marcin";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Marcin", 41,"Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
