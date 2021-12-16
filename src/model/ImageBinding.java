package model;

import javafx.beans.binding.ObjectBinding;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

/**
 * @author David Wandratsch
 * @version 1.0, 14.12.2021, class ImageBinding
 * @link https://github.com/WandratschDavid/4203_instantViewer
 */
public class ImageBinding extends ObjectBinding<Image>
{
    private final StringProperty fileName;

    public ImageBinding(StringProperty fileName)
    {
        super.bind(fileName);
        this.fileName = fileName;
    }

    @Override
    protected Image computeValue()
    {
        try
        {
            return new Image(fileName.get(), true);
        }
        catch (Exception ex)
        {
            System.out.println("Not a full/valid file name!");
        }
        return null;
    }
}