package ui;

import utilz.LoadSave;

import java.awt.*;
import java.awt.image.BufferedImage;

import static utilz.Constants.UI.URMButtons.URM_DEFAULT_SIZE;
import static utilz.Constants.UI.URMButtons.URM_SIZE;

public class UrmButton extends PauseButton {
    private BufferedImage[] imgs;
    private int rowIndex, index;
    private boolean mouseOver, mousePressed;

    public UrmButton(int x, int y, int width, int height, int rowIndex) {
        super(x, y, width, height);
        // TODO: coming soon

    }

    private void loadImgs() {
        // TODO: coming soon
    }

    public void update() {
        // TODO: coming soon

    }

    public void draw(Graphics g) {
        // TODO: coming soon
    }

    public void resetBools() {
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

}