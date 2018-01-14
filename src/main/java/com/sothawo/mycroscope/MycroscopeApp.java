/*
 * (c) Copyright 2018 sothawo
 */
package com.sothawo.mycroscope;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * @author P.J. Meisch (pj.meisch@sothawo.com)
 */
public class MycroscopeApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Mycroscope");
        Scene scene = new Scene(new Label("this is the mycroscope app!"), 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
