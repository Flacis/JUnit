package ru.netologe;

import ru.netologe.weapone.*;

class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new MachineGun(),
                new Pistol(),
                new RPG(),
                new Slingshot(),
                new WaterGun(),
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public int shotWithWeapon(int slot) {
        if (slot >= getSlotsCount() || slot < 0) {
            System.out.println("Выберите оружие");
        } else {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }
        return slot;
    }
}
