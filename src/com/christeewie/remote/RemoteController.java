package com.christeewie.remote;

import java.util.Scanner;

public class RemoteController {
    // Remote only usable for one TV Instance
    Remote usedRemote;

    public RemoteController(Remote usedRemote) {

        this.usedRemote = usedRemote;
    }


    // Handle user input
    public void handler() {
        Scanner scan = new Scanner(System.in);


        if (scan.hasNextLine()) {
            if (scan.hasNextInt()) {
                switch (scan.nextInt()) {
                    case 0 -> usedRemote.powerTv();
                    case 1 -> usedRemote.volUp();
                    case 2 -> usedRemote.volDown();
                    case 3 -> usedRemote.channelUp();
                    case 4 -> usedRemote.channelDown();
                    case 9 -> usedRemote.switchBat();
                    default -> System.out.println("Unknown Command");
                }
            }
        }
    }
}

