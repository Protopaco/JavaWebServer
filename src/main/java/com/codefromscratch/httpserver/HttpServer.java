package com.codefromscratch.httpserver;

//Driver Class for the Http Server

import com.codefromscratch.httpserver.config.Configuration;
import com.codefromscratch.httpserver.config.ConfigurationManager;

public class HttpServer {

    public static void main(String[] args) {
        System.out.println("AHHH!");
        ConfigurationManager.getInstance().loadConfigurationFile("src/main/resources/http.json");
        Configuration conf = ConfigurationManager.getInstance().getCurrentConfiguration();

        System.out.println("Using Port: " + conf.getPort());
        System.out.println("Using WebRoot: " + conf.getWebroot());
    }
}
