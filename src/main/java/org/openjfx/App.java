package org.openjfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    private Cell[][] cell = new Cell[3][3];
    private String player1;
    private String player2;
    private bool gameIsNotOver = true;



    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }
    public class Cell extends Pane{
        private int token = 99;
        private int coordinateX;
        private int coordinateY;
        Cell(int i ,int j){
            setOnMouseClicked(e->handleClick());
            coordinateX = i;
            coordinateY = j;
        }
        public int getToken(){
            return token;
        }
        private void handleClick(){

            if()
        }
        private void placeToken(int token){
            if(token==99) {
                this.token=token;
            }else{
                System.out.print("Error placing in the full square");
            }


        }
        private boolean checkIsWin(){
            int row;
            int column;
            int sum = 0;
            for(row = 0 ; row<3;row++){
                if(cell[row][coordinateY].getToken()==99) {
                    break;
                }
                sum+=cell[row][coordinateY].getToken();
            }
            if((sum==0 || sum==1 || sum==3) && row==3){
                return true;
            }

            sum = 0;
            for(column = 0;column<3;column++){
                if(cell[coordinateX][column].getToken()==99){
                    break;
                }
                sum+=cell[coordinateX][column].getToken();
            }
            if((sum==0 || sum==1 || sum==3) && column==3){
                return true;
            }

            return false;

        }
        private boolean checkIsFull(){
            for(int i = 0 ;i<cell.length;i++){
                for(int j = 0;j<cell[i].length;j++){
                    if(cell[i][j].getToken==99){
                        return false;
                    }
                }
            }
            return true;

        }
    }
    private void

    public static void main(String[] args) {
        launch();
    }

}