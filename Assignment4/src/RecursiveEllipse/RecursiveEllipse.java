//Cameron Collins

package RecursiveEllipse;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;

public class RecursiveEllipse extends Application
{
    public Pane pane = new Pane();

    public void start(Stage primaryStage)
    {
        //sets window width and height
        double width  = 500 ;
        double height = 600 ;

        //sets the default ellipse parameters
        double radiusHorizontal = (width / 2) - 10;
        double radiusVertical   = (height / 2) - 10;

        addEllipses(radiusHorizontal, radiusVertical);

        Scene scene = new Scene(pane, width, height);
        primaryStage.setTitle("Ellipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //recursive to create ellipses
    public  void addEllipses(double horizontal, double vertical)
    {
        if (horizontal <= 10 || vertical <= 10)
        {

            createEllipse(horizontal, vertical);
        }

        else
        {
            createEllipse(horizontal, vertical);
            addEllipses(horizontal - 25, vertical - 25); //sets the padding
        }
    }

    //generates random color
    private Color getRandomColor()
    {
        return new Color(Math.random( ), Math.random( ), Math.random( ), Math.random( ));
    }

    //creates the ellipse with random colors
    private void createEllipse(double horizontal, double vertical)
    {
        Ellipse ellipse = new Ellipse(horizontal, vertical);
        ellipse.centerXProperty( ).bind(pane.widthProperty( ).divide(2.0));
        ellipse.centerYProperty( ).bind(pane.heightProperty( ).divide(2.0));
        ellipse.setStroke(getRandomColor());
        ellipse.setFill(Color.TRANSPARENT);
        ellipse.setStrokeWidth(10);
        pane.getChildren().add(ellipse);

    }
}