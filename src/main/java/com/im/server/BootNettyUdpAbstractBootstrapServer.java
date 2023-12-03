package com.im.server;


import com.im.handler.BootNettyUdpSimpleChannelInboundHandler;
import com.im.service.BootNettyUdpBootstrap;
import io.netty.channel.ChannelPipeline;

public abstract class BootNettyUdpAbstractBootstrapServer implements BootNettyUdpBootstrap {


    void initChannelHandler(ChannelPipeline channelPipeline) {
        channelPipeline.addLast(new BootNettyUdpSimpleChannelInboundHandler());
    }


}
