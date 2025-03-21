package gamestates;

import main.Game;
import ui.AudioOptions;
import ui.PauseButton;
import ui.UrmButton;
import utilz.Constants;
import utilz.LoadSave;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import static utilz.Constants.UI.URMButtons.URM_SIZE;

public class GameOptions extends State implements Statemethods {

    private AudioOptions audioOptions;
    private BufferedImage backgroundImg, optionsBackgroundImg;
    private int bgX, bgY, bgW, bgH;
    private UrmButton menuB;

    public GameOptions(Game game) {
        super(game);
        // TODO: coming soon
    }

    private void loadButton() {
        // TODO: coming soon
    }

    private void loadImgs() {
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

    public void mouseDragged(MouseEvent e) {
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
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    private boolean isIn(MouseEvent e, PauseButton b) {
        // TODO: coming soon
        return false;
    }

}