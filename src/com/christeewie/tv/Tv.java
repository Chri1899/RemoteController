package com.christeewie.tv;

public class Tv {
    private String[] channels;
    private int volume;
    private boolean power;
    private String currentChannel;

    public Tv(String[] channels) {
        this.channels = channels;
        this.volume = 50;
        this.power = false;
        this.currentChannel = channels[0];
    }

    // Print TV Design
    public void printTv() {
        if (power) {
            System.out.println("+----------------------+");
            System.out.println("|                      |");
            System.out.println("|      " + this.currentChannel + "     |");
            System.out.println("|                      |");
            System.out.println("|      Volume: " + this.volume + "      |");
            System.out.println("|                      |");
            System.out.println("+----------------------+");
        }
    }

    // Toggle TV on and off
    public void togglePower() {
        this.power = !power;
    }

    // Adjust TV Volume
    public void setVolume(int dir) {
        this.volume += dir;
    }

    // TODO Channel Switch
    public void setChannel(int dir) {
    }

    // Returns Power Status
    public boolean getPower() {
        return this.power;
    }
}

