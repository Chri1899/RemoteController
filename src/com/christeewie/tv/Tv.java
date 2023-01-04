package com.christeewie.tv;

public class Tv {
    private String[] channels;
    private int volume;
    private boolean power;
    private int curChannelIndex;
    private String currentChannel;

    public Tv(String[] channels) {
        this.channels = channels;
        this.volume = 50;
        this.power = false;
        this.curChannelIndex = 0;
        this.currentChannel = channels[this.curChannelIndex];
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
        if (this.volume == 0 && dir == -1 || this.volume == 100 && dir == 1) {
            this.volume = this.volume;
        } else {
            this.volume += dir;
        }
    }

    // Switch channel
    public void setChannel(int dir) {
        if (this.curChannelIndex == channels.length - 1 && dir == 1) {
            this.curChannelIndex = 0;
        } else if (this.curChannelIndex == 0 && dir == -1) {
            this.curChannelIndex = channels.length - 1;
        } else {
            this.curChannelIndex += dir;
        }

        this.currentChannel = channels[this.curChannelIndex];
    }

    // Returns Power Status
    public boolean getPower() {
        return this.power;
    }
}

