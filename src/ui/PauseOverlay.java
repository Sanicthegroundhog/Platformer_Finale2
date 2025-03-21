package ui;

import gamestates.Gamestate;
import gamestates.Playing;
import main.Game;
import ui.AudioOptions;
import ui.PauseButton;
import ui.UrmButton;
import utilz.LoadSave;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import static utilz.Constants.UI.URMButtons.URM_SIZE;

public class PauseOverlay {

    private Playing playing;
    private BufferedImage backgroundImg;
    private int bgX, bgY, bgW, bgH;
    private AudioOptions audioOptions;
    private UrmButton menuB, replayB, unpauseB;

    public PauseOverlay(Playing playing) {
        // TODO: coming soon


    }

    private void createUrmButtons() {
        // TODO: coming soon

    }

    private void loadBackground() {
        // TODO: coming soon

    }

    public void update() {
        // TODO: coming soon


    }

    public void draw(Graphics g) {
        // TODO: coming soon


    }

    public void mouseDragged(MouseEvent e) {
        // TODO: coming soon

    }

    public void mousePressed(MouseEvent e) {
        // TODO: coming soon

    }

    public void mouseReleased(MouseEvent e) {
        // TODO: coming soon


    }

    public void mouseMoved(MouseEvent e) {
        // TODO: coming soon

    }

    private boolean isIn(MouseEvent e, PauseButton b) {
        // TODO: coming soon
        return false;
    }

}