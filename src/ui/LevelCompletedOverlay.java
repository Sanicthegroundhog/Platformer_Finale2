package ui;

import gamestates.Gamestate;
import gamestates.Playing;
import main.Game;
import ui.UrmButton;
import utilz.LoadSave;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import static utilz.Constants.UI.URMButtons.URM_SIZE;

public class LevelCompletedOverlay {

    private Playing playing;
    private UrmButton menu, next;
    private BufferedImage img;
    private int bgX, bgY, bgW, bgH;

    public LevelCompletedOverlay(Playing playing) {
        // TODO: coming soon

    }

    private void initButtons() {
        // TODO: coming soon

    }

    private void initImg() {
        // TODO: coming soon

    }

    public void draw(Graphics g) {
        // TODO: coming soon

    }

    public void update() {
        // TODO: coming soon

    }

    private boolean isIn(UrmButton b, MouseEvent e) {
        return b.getBounds().contains(e.getX(), e.getY());
    }

    public void mouseMoved(MouseEvent e) {
        // TODO: coming soon

    }

    public void mouseReleased(MouseEvent e) {
        // TODO: coming soon

    }

    public void mousePressed(MouseEvent e) {
        // TODO: coming soon

    }

}