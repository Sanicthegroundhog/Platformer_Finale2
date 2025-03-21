package ui;

public class VolumeButton {
}
package ui;

import utilz.LoadSave;

import java.awt.*;
        import java.awt.image.BufferedImage;

import static utilz.Constants.UI.VolumeButtons.*;

public class VolumeButton extends PauseButton {

    private BufferedImage[] imgs;
    private BufferedImage slider;
    private int index = 0;
    private boolean mouseOver, mousePressed;
    private int buttonX, minX, maxX;
    private float floatValue = 0f;

    public VolumeButton(int x, int y, int width, int height) {
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

    public void changeX(int x) {
        // TODO: coming soon


    }

    private void updateFloatValue() {
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

    public float getFloatValue() {
        // TODO: coming soon
        return 0;
    }
}