package gamestates;

import main.Game;
import ui.MenuButton;
import utilz.LoadSave;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class Menu extends State implements Statemethods {

    private MenuButton[] buttons = new MenuButton[3];
    private BufferedImage backgroundImg, backgroundImgPink;
    private int menuX, menuY, menuWidth, menuHeight;

    public Menu(Game game) {
        super(game);
        // TODO: coming soon

    }

    private void loadBackground() {
        // TODO: coming soon
    }

    private void loadButtons() {
        // TODO: coming soon
    }

    @Override
    public void update() {
        // TODO: coming soon
    }

    @Override
    public void draw(Graphics g) {
        // TODO: coming soon
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO: coming soon
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO: coming soon
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO: coming soon

    }

    private void resetButtons() {
        // TODO: coming soon

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO: coming soon

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO: coming soon

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO: coming soon
    }

}