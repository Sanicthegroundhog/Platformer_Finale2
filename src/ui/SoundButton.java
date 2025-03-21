package ui;

import ui.PauseButton;
import utilz.LoadSave;

import java.awt.*;
import java.awt.image.BufferedImage;

import static utilz.Constants.UI.PauseButtons.SOUND_SIZE_DEFAULT;

public class SoundButton extends PauseButton {

    private BufferedImage[][] soundImgs;
    private boolean mouseOver, mousePressed;
    private boolean muted;
    private int rowIndex, colIndex;

    public SoundButton(int x, int y, int width, int height) {
        super(x, y, width, height);
        // TODO: coming soon
    }

    private void loadSoundImgs() {
        // TODO: coming soon
    }

    public void update() {
        // TODO: coming soon
    }

    public void resetBools() {
        // TODO: coming soon
    }

    public void draw(Graphics g) {
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

    public boolean isMuted() {
        // TODO: coming soon
        return false;
    }

    public void setMuted(boolean muted) {
        // TODO: coming soon
    }
}