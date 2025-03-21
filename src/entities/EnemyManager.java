package entities;

import gamestates.Playing;
import levels.Level;
import utilz.LoadSave;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import static utilz.Constants.EnemyConstants.*;

public class EnemyManager {

    private Playing playing;
    private BufferedImage[][] crabbyArr;
    private ArrayList<Crabby> crabbies = new ArrayList<>();

    public EnemyManager(Playing playing) {
        // TODO: coming soon

    }

    public void loadEnemies(Level level) {
        // TODO: coming soon
    }

    public void update(int[][] lvlData, Player player) {
        // TODO: coming soon

    }

    public void draw(Graphics g, int xLvlOffset) {
        // TODO: coming soon
    }

    private void drawCrabs(Graphics g, int xLvlOffset) {
        // TODO: coming soon

    }

    public void checkEnemyHit(Rectangle2D.Float attackBox) {
        // TODO: coming soon

    }

    private void loadEnemyImgs() {
        // TODO: coming soon

    }

    public void resetAllEnemies() {
        // TODO: coming soon

    }

}