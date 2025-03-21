package ui;

import gamestates.Gamestate;
import utilz.LoadSave;

import java.awt.*;
import java.awt.image.BufferedImage;

import static utilz.Constants.UI.Buttons.*;

public class MenuButton {
    private int xPos, yPos, rowIndex, index;
    private int xOffsetCenter = B_WIDTH / 2;
    private Gamestate state;
    private BufferedImage[] imgs;
    private boolean mouseOver, mousePressed;
    private Rectangle bounds;

    public MenuButton(int xPos, int yPos, int rowIndex, Gamestate state) {
        // TODO: coming soon

    }

    private void initBounds() {
        // TODO: coming soon

    }

    private void loadImgs() {
        // TODO: coming soon

    }

    public void draw(Graphics g) {
        // TODO: coming soon
    }

    public void update() {
        // TODO: coming soon

    }

    public boolean isMouseOver() {
        // TODO: coming soon
        return false;
    }

    public void setMouseOver(boolean mouseOver) {
        // TODO: coming soon
    }

    public boolean isMousePressed() {
        // TODO: coming soon
        return false;
    }

    public void setMousePressed(boolean mousePressed) {
        // TODO: coming soon
    }

    public Rectangle getBounds() {
        // TODO: coming soon
        return null;
    }

    public void applyGamestate() {
        // TODO: coming soon
    }

    public void resetBools() {
        // TODO: coming soon

    }
    public Gamestate getState() {
        // TODO: coming soon
        return null;
    }

}