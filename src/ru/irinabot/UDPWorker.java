package ru.irinabot;

import java.net.DatagramSocket;

public class UDPWorker extends Thread {

    DatagramSocket socket;

    public UDPWorker(DatagramSocket socket) {
        this.socket = socket;
    }

    @Override
    public void run( )
    {

    }
}
