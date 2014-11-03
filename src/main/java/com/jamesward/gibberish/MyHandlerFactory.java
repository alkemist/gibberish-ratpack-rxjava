package com.jamesward.gibberish;

import ratpack.handling.Handler;
import ratpack.launch.HandlerFactory;
import ratpack.launch.LaunchConfig;
import ratpack.rx.RxRatpack;

public class MyHandlerFactory implements HandlerFactory {
    public Handler create(LaunchConfig launchConfig) throws Exception {

        RxRatpack.initialize();

        return new GibberishHandler();
    }
}