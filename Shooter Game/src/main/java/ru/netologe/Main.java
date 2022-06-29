package ru.netologe;

import ru.netologe.weapone.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        final int SIZE = 5;
        Weapon[] weapon = new Weapon[SIZE];
        weapon[0] = new Pistol();
        weapon[1] = new MachineGun();
        weapon[2] = new RPG();
        weapon[3] = new Slingshot();
        weapon[4] = new WaterGun();
        System.out.format("У игрока %d слотов с оружием," + " введите номер, чтобы выстрелить," + " -1 чтобы выйти%n", player.getSlotsCount());
        int slot;
        while (true) {
            slot = scanner.nextInt();
            if (slot == -1) {
                System.out.println("Game over!");
                return;
            } else player.shotWithWeapon(slot - 1);
        }
    }
}