package main;

public class Main {
    public static void main(String[] args) {

        GPanel gPanel = new GPanel();
        GameWindow gameWindow = new GameWindow(gPanel);
        gPanel.requestFocus();

    }
}