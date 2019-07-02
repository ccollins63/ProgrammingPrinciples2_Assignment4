//Cameron Collins

package SquareFractals;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class SquareFractals extends Application
{
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage)
    {
        SquarePane squarePane = new SquarePane();
        TextField tfOrder     = new TextField();

        tfOrder.setOnAction(
                e -> squarePane.setOrder(Integer.parseInt(tfOrder.getText())));
        tfOrder.setPrefColumnCount(4);
        tfOrder.setAlignment(Pos.BOTTOM_RIGHT);

        // Pane to hold label, text field, and a button
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(new Label("Enter an order: "), tfOrder);
        hBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(squarePane);
        borderPane.setBottom(hBox);

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 200, 210);
        primaryStage.setTitle("SquareFractals"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        scene.widthProperty().addListener(ov -> squarePane.paint());
        scene.heightProperty().addListener(ov -> squarePane.paint());
    }

    //pane to display square
    static class SquarePane extends Pane
    {
        private int order = 0;

        /** Set a new order */
        public void setOrder(int order)
        {
            this.order = order;
            paint();
        }

        SquarePane()
        {
        }

        protected void paint()
        {
            Point2D p1 = new Point2D(getWidth() - 10, getHeight() - 10);
            Point2D p2 = new Point2D(10, getHeight() - 10);
            Point2D p3 = new Point2D(10, 10);
            Point2D p4 = new Point2D(getWidth() - 10, 10);

            this.getChildren().clear(); // Clear the pane before redisplay

            displaySquares(order, p1, p2, p3, p4);
        }

        private Color getRandomColor()
        {
            return new Color(Math.random( ), Math.random( ), Math.random( ), Math.random( ));
        }

        //display square with given coordinates
        private void displaySquares(int order, Point2D p1, Point2D p2, Point2D p3, Point2D p4)
        {
            //if it is the last time, do not call upon the display method again
            if (order == 0)
            {
                Polygon square = new Polygon();
                square.getPoints().addAll(p1.getX(), p1.getY(), p2.getX(), p2.getY(), p3.getX(), p3.getY(), p4.getX(), p4.getY());
                square.setStroke(Color.BLACK);
                square.setFill(getRandomColor());

                this.getChildren().add(square);
            }

            else
            {
                Polygon square = new Polygon();
                square.getPoints().addAll(p1.getX(), p1.getY(), p2.getX(), p2.getY(), p3.getX(), p3.getY(), p4.getX(), p4.getY());
                square.setStroke(Color.BLACK);
                square.setFill(getRandomColor());

                this.getChildren().add(square);
                //get midpoints
                Point2D p12 = p1.midpoint(p2);
                Point2D p23 = p2.midpoint(p3);
                Point2D p34 = p3.midpoint(p4);
                Point2D p41 = p4.midpoint(p1);

                displaySquares(order - 1, p12, p23, p34, p41);
            }
        }
    }
}