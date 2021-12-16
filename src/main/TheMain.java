package main;

import javafx.application.Application;
import javafx.stage.Stage;
import viewcontroller.InstantViewerC;

/**
 * @author David Wandratsch
 * @version 1.0, 14.12.2021, class TheMain
 * @link https://github.com/WandratschDavid/4203_instantViewer
 */
public class TheMain extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        InstantViewerC.show(primaryStage);
    }
}