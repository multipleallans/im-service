package com.im;


import com.im.server.BootNettyUdpBootstrapThread;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ImServiceApplication {

    private static int udpPort;
    @Value("${udp.port}")
    public void setUdpPort(int value) {
        udpPort = value;
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ImServiceApplication.class);
        app.run(args);
        BootNettyUdpBootstrapThread thread = new BootNettyUdpBootstrapThread(udpPort);
        thread.start();
        System.out.println( "Hello World!" );
    }
}
