package com.christeewie.remote;

import com.christeewie.tv.Tv;

public class Remote {

    private int battery;
    private final Tv usedTv;

    public Remote(Tv usedTv) {
        this.battery = 100;
        this.usedTv = usedTv;
    }

    // Print Remote Layout
    public void printRemote() {
        System.out.println("+----------------------+");
        System.out.println("| Toggle Power [0]     |");
        System.out.println("|                      |");
        System.out.println("| Vol. Up      [1]     |");
        System.out.println("| Vol. Down    [2]     |");
        System.out.println("|                      |");
        System.out.println("| Channel Up   [3]     |");
        System.out.println("| Channel Down [4]     |");
        System.out.println("|                      |");
        System.out.println("| Switch Bat.  [9]     |");
        System.out.println("| Battery Stat: " + battery + "    |");
        System.out.println("+----------------------+");
    }

    // Toggle TV Power
    public void powerTv() {
        usedTv.togglePower();
    }

    // Volume Up
    public void volUp() {
        if (usedTv.getPower()) {
            usedTv.setVolume(1);
            System.out.println("Volume successfully adjusted!");
        } else {
            System.out.println("The TV is currently not running.");
        }
    }

    // Volume Down
    public void volDown() {
        if (usedTv.getPower()) {
            usedTv.setVolume(-1);
            System.out.println("Volume successfully adjusted!");
        } else {
            System.out.println("The TV is currently not running.");
        }
    }

    // TODO Channel Up
    public void channelUp() {
        if (usedTv.getPower()) {
            usedTv.setChannel(1);
            System.out.println("Channel successfully adjusted!");
        } else {
            System.out.println("The TV is currently not running.");
        }
    }

    // TODO Channel Down
    public void channelDown() {
        if (usedTv.getPower()) {
            usedTv.setChannel(-1);
            System.out.println("Volume successfully adjusted!");
        } else {
            System.out.println("The TV is currently not running.");
        }
    }

    // TODO Switch Battery
    public void switchBat() {
    }
}
