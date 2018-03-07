/* Shaun Dobbs
 * CSCI 1302
 * Assignment 5
 * March 30, 2016
 * Purpose : Create a graphical user interface that calculates a GPA
 */
package passign5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class PAssign5 extends Application {

    Label title = new Label("GPA Calculator");
    Label semester1 = new Label("Semester 1");
    Label semester2 = new Label("Semester 2");
    Label grade = new Label("Grade");
    Label grade2 = new Label("Grade");
    Label hours = new Label("Hours");
    Label hours2 = new Label("Hours");
    Label c1 = new Label("Course 1");
    Label c2 = new Label("Course 2");
    Label c3 = new Label("Course 3");
    Label c4 = new Label("Course 4");
    Label c5 = new Label("Course 5");
    Label c12 = new Label("Course 1");
    Label c22 = new Label("Course 2");
    Label c32 = new Label("Course 3");
    Label c42 = new Label("Course 4");
    Label c52 = new Label("Course 5");
    Label error = new Label();
    Label error2 = new Label();

    Button calculate = new Button("Calculate");
    Button reset = new Button("Reset");

    TextField gc1 = new TextField("A");
    TextField gc2 = new TextField("A");
    TextField gc3 = new TextField("A");
    TextField gc4 = new TextField("A");
    TextField gc5 = new TextField("A");

    TextField hc1 = new TextField("0");
    TextField hc2 = new TextField("0");
    TextField hc3 = new TextField("0");
    TextField hc4 = new TextField("0");
    TextField hc5 = new TextField("0");

    TextField gc12 = new TextField("A");
    TextField gc22 = new TextField("A");
    TextField gc32 = new TextField("A");
    TextField gc42 = new TextField("A");
    TextField gc52 = new TextField("A");

    TextField hc12 = new TextField("0");
    TextField hc22 = new TextField("0");
    TextField hc32 = new TextField("0");
    TextField hc42 = new TextField("0");
    TextField hc52 = new TextField("0");

    TextField textFieldgpa = new TextField("Semester 1 GPA");
    TextField textFieldgpa2 = new TextField("Semester 2 GPA");
    TextField tfOverall = new TextField("Overall GPA");

    @Override
    public void start(Stage primaryStage) {

        GridPane gp0 = new GridPane();
        gp0.setAlignment(Pos.TOP_CENTER);
        gp0.setHgap(5.0);
        gp0.setVgap(5.0);
        gp0.add(title, 1, 0);
        gp0.add(semester1, 1, 1);

        GridPane gp1 = new GridPane();
        gp1.setAlignment(Pos.TOP_CENTER);
        gp1.setHgap(5.0);
        gp1.setVgap(5.0);

        gp1.add(grade, 1, 1);
        gp1.add(hours, 2, 1);
        gp1.add(c1, 0, 2);
        gp1.add(c2, 0, 3);
        gp1.add(c3, 0, 4);
        gp1.add(c4, 0, 5);
        gp1.add(c5, 0, 6);

        gp1.add(gc1, 1, 2);
        gp1.add(gc2, 1, 3);
        gp1.add(gc3, 1, 4);
        gp1.add(gc4, 1, 5);
        gp1.add(gc5, 1, 6);

        gp1.add(hc1, 2, 2);
        gp1.add(hc2, 2, 3);
        gp1.add(hc3, 2, 4);
        gp1.add(hc4, 2, 5);
        gp1.add(hc5, 2, 6);

        gp1.add(error, 1, 7);

        gp1.add(textFieldgpa, 2, 7);

        GridPane gp2 = new GridPane();
        gp2.setAlignment(Pos.TOP_CENTER);
        gp2.setHgap(5.0);
        gp2.setVgap(5.0);
        gp2.add(semester2, 1, 1);

        GridPane gp3 = new GridPane();
        gp3.setAlignment(Pos.TOP_CENTER);
        gp3.setHgap(5.0);
        gp3.setVgap(5.0);

        gp3.add(grade2, 1, 1);
        gp3.add(hours2, 2, 1);
        gp3.add(c12, 0, 2);
        gp3.add(c22, 0, 3);
        gp3.add(c32, 0, 4);
        gp3.add(c42, 0, 5);
        gp3.add(c52, 0, 6);

        gp3.add(gc12, 1, 2);
        gp3.add(gc22, 1, 3);
        gp3.add(gc32, 1, 4);
        gp3.add(gc42, 1, 5);
        gp3.add(gc52, 1, 6);

        gp3.add(hc12, 2, 2);
        gp3.add(hc22, 2, 3);
        gp3.add(hc32, 2, 4);
        gp3.add(hc42, 2, 5);
        gp3.add(hc52, 2, 6);

        gp3.add(error2, 1, 7);

        gp3.add(textFieldgpa2, 2, 7);

        GridPane gp4 = new GridPane();
        gp4.setAlignment(Pos.BOTTOM_CENTER);
        gp4.setHgap(5.0);
        gp4.setVgap(5.0);

        gp4.add(tfOverall, 1, 0);

        GridPane gp5 = new GridPane();
        gp5.setAlignment(Pos.CENTER);
        gp5.setHgap(5.0);
        gp5.setVgap(5.0);

        gp5.add(calculate, 1, 0);
        gp5.add(reset, 2, 0);

        VBox vb = new VBox();
        vb.getChildren().addAll(gp0, gp1, gp2, gp3, gp4, gp5);

        Scene scene = new Scene(vb, 450, 550);

        vb.setAlignment(Pos.CENTER);

        primaryStage.setTitle("GPA Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

        calculate.setOnAction(e -> calculate());
        reset.setOnAction(e -> reset());
    }

    private void calculate() {
        String g1 = gc1.getText();
        String g2 = gc2.getText();
        String g3 = gc3.getText();
        String g4 = gc4.getText();
        String g5 = gc5.getText();

        String g12 = gc12.getText();
        String g22 = gc22.getText();
        String g32 = gc32.getText();
        String g42 = gc42.getText();
        String g52 = gc52.getText();

        double h1 = Integer.parseInt(hc1.getText());
        double h2 = Integer.parseInt(hc2.getText());
        double h3 = Integer.parseInt(hc3.getText());
        double h4 = Integer.parseInt(hc4.getText());
        double h5 = Integer.parseInt(hc5.getText());

        double h12 = Integer.parseInt(hc12.getText());
        double h22 = Integer.parseInt(hc22.getText());
        double h32 = Integer.parseInt(hc32.getText());
        double h42 = Integer.parseInt(hc42.getText());
        double h52 = Integer.parseInt(hc52.getText());

        double totalHours = h1 + h2 + h3 + h4 + h5;
        double totalHours2 = h12 + h22 + h32 + h42 + h52;

        double c1, c2, c3, c4, c5;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        double t1, t2, t3, t4, t5;

        double c12, c22, c32, c42, c52;
        c12 = 0;
        c22 = 0;
        c32 = 0;
        c42 = 0;
        c52 = 0;
        double t12, t22, t32, t42, t52;

        if ("A".equals(g1) || "a".equals(g1)) {
            c1 = 4.0;
        } else if ("B".equals(g1) || "b".equals(g1)) {
            c1 = 3.0;
        } else if ("C".equals(g1) || "c".equals(g1)) {
            c1 = 2.0;
        } else if ("D".equals(g1) || "d".equals(g1)) {
            c1 = 1.0;
        } else if ("F".equals(g1) || "f".equals(g1)) {
            c1 = 0.0;
        } else {
            error.setText("Error: check input");
        }

        if ("A".equals(g2) || "a".equals(g2)) {
            c2 = 4.0;
        } else if ("B".equals(g2) || "b".equals(g2)) {
            c2 = 3.0;
        } else if ("C".equals(g2) || "c".equals(g2)) {
            c2 = 2.0;
        } else if ("D".equals(g2) || "d".equals(g2)) {
            c2 = 1.0;
        } else if ("F".equals(g2) || "f".equals(g2)) {
            c2 = 0.0;
        } else {
            error.setText("Error: check input");
        }

        if ("A".equals(g3) || "a".equals(g3)) {
            c3 = 4.0;
        } else if ("B".equals(g3) || "b".equals(g3)) {
            c3 = 3.0;
        } else if ("C".equals(g3) || "c".equals(g3)) {
            c3 = 2.0;
        } else if ("D".equals(g3) || "d".equals(g3)) {
            c3 = 1.0;
        } else if ("F".equals(g3) || "f".equals(g3)) {
            c3 = 0.0;
        } else {
            error.setText("Error: check input");
        }

        if ("A".equals(g4) || "a".equals(g4)) {
            c4 = 4.0;
        } else if ("B".equals(g4) || "b".equals(g4)) {
            c4 = 3.0;
        } else if ("C".equals(g4) || "c".equals(g4)) {
            c4 = 2.0;
        } else if ("D".equals(g4) || "d".equals(g4)) {
            c4 = 1.0;
        } else if ("F".equals(g4) || "f".equals(g4)) {
            c4 = 0.0;
        } else {
            error.setText("Error: check input");
        }

        if ("A".equals(g5) || "a".equals(g5)) {
            c5 = 4.0;
        } else if ("B".equals(g5) || "b".equals(g5)) {
            c5 = 3.0;
        } else if ("C".equals(g5) || "c".equals(g5)) {
            c5 = 2.0;
        } else if ("D".equals(g5) || "d".equals(g5)) {
            c5 = 1.0;
        } else if ("F".equals(g5) || "f".equals(g5)) {
            c5 = 0.0;
        } else {
            error.setText("Error: check input");
        }

        if ("A".equals(g12) || "a".equals(g12)) {
            c12 = 4.0;
        } else if ("B".equals(g12) || "b".equals(g12)) {
            c12 = 3.0;
        } else if ("C".equals(g12) || "c".equals(g12)) {
            c12 = 2.0;
        } else if ("D".equals(g12) || "d".equals(g12)) {
            c12 = 1.0;
        } else if ("F".equals(g12) || "f".equals(g12)) {
            c12 = 0.0;
        } else {
            error2.setText("Error: check input");
        }

        if ("A".equals(g22) || "a".equals(g22)) {
            c22 = 4.0;
        } else if ("B".equals(g22) || "b".equals(g22)) {
            c22 = 3.0;
        } else if ("C".equals(g22) || "c".equals(g22)) {
            c22 = 2.0;
        } else if ("D".equals(g22) || "d".equals(g22)) {
            c22 = 1.0;
        } else if ("F".equals(g22) || "f".equals(g22)) {
            c22 = 0.0;
        } else {
            error2.setText("Error: check input");
        }

        if ("A".equals(g32) || "a".equals(g32)) {
            c32 = 4.0;
        } else if ("B".equals(g32) || "b".equals(g32)) {
            c32 = 3.0;
        } else if ("C".equals(g32) || "c".equals(g32)) {
            c32 = 2.0;
        } else if ("D".equals(g32) || "d".equals(g32)) {
            c32 = 1.0;
        } else if ("F".equals(g32) || "f".equals(g32)) {
            c32 = 0.0;
        } else {
            error2.setText("Error: check input");
        }

        if ("A".equals(g42) || "a".equals(g42)) {
            c42 = 4.0;
        } else if ("B".equals(g42) || "b".equals(g42)) {
            c42 = 3.0;
        } else if ("C".equals(g42) || "c".equals(g42)) {
            c42 = 2.0;
        } else if ("D".equals(g42) || "d".equals(g42)) {
            c42 = 1.0;
        } else if ("F".equals(g42) || "f".equals(g42)) {
            c42 = 0.0;
        } else {
            error2.setText("Error: check input");
        }

        if ("A".equals(g52) || "a".equals(g52)) {
            c52 = 4.0;
        } else if ("B".equals(g52) || "b".equals(g52)) {
            c52 = 3.0;
        } else if ("C".equals(g52) || "c".equals(g52)) {
            c52 = 2.0;
        } else if ("D".equals(g52) || "d".equals(g52)) {
            c52 = 1.0;
        } else if ("F".equals(g52) || "f".equals(g52)) {
            c52 = 0.0;
        } else {
            error2.setText("Error: check input");
        }

        t1 = c1 * h1;
        t2 = c2 * h2;
        t3 = c3 * h3;
        t4 = c4 * h4;
        t5 = c5 * h5;

        t12 = c12 * h12;
        t22 = c22 * h22;
        t32 = c32 * h32;
        t42 = c42 * h42;
        t52 = c52 * h52;

        double total = t1 + t2 + t3 + t4 + t5;
        double total2 = t12 + t22 + t32 + t42 + t52;

        double gpa = total / totalHours;
        double gpa2 = total2 / totalHours2;

        textFieldgpa.setText(String.format("%.2f", gpa));
        textFieldgpa2.setText(String.format("%.2f", gpa2));
        double overallGPA = (gpa + gpa2) / 2;
        tfOverall.setText(String.format("%.2f", overallGPA));
    }

    private void reset() {
        gc1.setText("A");
        gc2.setText("A");
        gc3.setText("A");
        gc4.setText("A");
        gc5.setText("A");

        hc1.setText("0");
        hc2.setText("0");
        hc3.setText("0");
        hc4.setText("0");
        hc5.setText("0");

        gc12.setText("A");
        gc22.setText("A");
        gc32.setText("A");
        gc42.setText("A");
        gc52.setText("A");

        hc12.setText("0");
        hc22.setText("0");
        hc32.setText("0");
        hc42.setText("0");
        hc52.setText("0");

        textFieldgpa.setText("Semester 1 GPA");
        textFieldgpa2.setText("Semester 2 GPA");
        tfOverall.setText("Overall GPA");

        error.setText("");
        error2.setText("");

    }

    public static void main(String[] args) {
        launch(args);
    }
}
