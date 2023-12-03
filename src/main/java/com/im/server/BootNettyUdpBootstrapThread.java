package com.im.server;


import com.im.service.BootNettyUdpBootstrap;

public class BootNettyUdpBootstrapThread extends Thread {

    private final int port;

    public BootNettyUdpBootstrapThread(int port){
        this.port = port;
    }

    public void run() {
        BootNettyUdpBootstrap iotUdpBootstrap = new BootNettyUdpBootstrapServer();
        iotUdpBootstrap.startup(this.port);
    }


}
