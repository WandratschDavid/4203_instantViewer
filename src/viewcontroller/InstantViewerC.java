package viewcontroller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.ImageBinding;

import java.io.IOException;

/**
 * @author David Wandratsch
 * @version 1.0, 14.12.2021, class InstantViewerC
 * @link https://github.com/WandratschDavid/4203_instantViewer
 */
public class InstantViewerC
{
    @FXML
    private TextField txtPicture;

    @FXML
    private ImageView imageView;

    private Stage stage;

    public static void show(Stage stage)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(InstantViewerC.class.getResource("InstantViewerV.fxml"));
            Parent root = (Parent) loader.load();

            InstantViewerC instantViewerC = loader.getController();
            instantViewerC.stage = stage;
            instantViewerC.init();

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("4203_instantViewer");
            stage.show();
        }
        catch (IOException ex)
        {
            System.err.printf("Error using %s!", "InstantViewerV.fxml");
            ex.printStackTrace();
            System.exit(1);
        }
    }

    @FXML
    void init()
    {
        imageView.imageProperty().bind(new ImageBinding(txtPicture.textProperty()));
        imageView.fitWidthProperty().bind(stage.widthProperty());
        imageView.fitHeightProperty().bind(stage.heightProperty());
    }
}