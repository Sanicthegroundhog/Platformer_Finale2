package gamestates;

import entities.EnemyManager;
import entities.Player;
import levels.LevelManager;
import main.Game;
import objects.ObjectManager;
import ui.GameOverOverlay;
import ui.LevelCompletedOverlay;
import ui.PauseOverlay;
import utilz.Constants;
import utilz.LoadSave;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import static utilz.Constants.Environment.*;

public class Playing extends State implements Statemethods {
    private Player player;
    private LevelManager levelManager;
    private EnemyManager enemyManager;
    private ObjectManager objectManager;
    private PauseOverlay pauseOverlay;
    private GameOverOverlay gameOverOverlay;
    private LevelCompletedOverlay levelCompletedOverlay;
    private boolean paused = false;

    private int xLvlOffset;
    private int leftBorder = (int) (0.2 * Constants.Game.GAME_WIDTH);
    private int rightBorder = (int) (0.8 * Constants.Game.GAME_WIDTH);
    private int maxLvlOffsetX;

    private BufferedImage backgroundImg, bigCloud, smallCloud;
    private int[] smallCloudsPos;
    private Random rnd = new Random();

    private boolean gameOver;
    private boolean lvlCompleted;
    private boolean playerDying;

    public Playing(Game game) {
        super(game);
        // TODO: coming soon
    }

    public void loadNextLevel() {
        // TODO: coming soon
    }

    private void loadStartLevel() {
        // TODO: coming soon
    }

    private void calcLvlOffset() {
        // TODO: coming soon
    }

    private void initClasses() {
        // TODO: coming soon
    }

    @Override
    public void update() {
        // TODO: coming soon
    }

    private void checkCloseToBorder() {
        // TODO: coming soon
    }

    @Override
    public void draw(Graphics g) {
        // TODO: coming soon
    }

    private void drawClouds(Graphics g) {
        // TODO: coming soon
    }

    public void resetAll() {
        // TODO: coming soon
    }

    public void setGameOver(boolean gameOver) {
        // TODO: coming soon
    }

    public void checkObjectHit(Rectangle2D.Float attackBox) {
        // TODO: coming soon
    }

    public void checkEnemyHit(Rectangle2D.Float attackBox) {
        // TODO: coming soon
    }

    public void checkPotionTouched(Rectangle2D.Float hitbox) {
        // TODO: coming soon
    }

    public void checkSpikesTouched(Player p) {
        // TODO: coming soon
    }

    @Override
    public void mouseClicked(MouseEvent e) {
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

    public void setLevelCompleted(boolean levelCompleted) {
        // TODO: coming soon
    }

    public void setMaxLvlOffset(int lvlOffset) {
        // TODO: coming soon
    }

    public void unpauseGame() {
        // TODO: coming soon
    }

    public void windowFocusLost() {
        // TODO: coming soon
    }

    public Player getPlayer() {
        // TODO: coming soon
        return null;
    }

    public EnemyManager getEnemyManager() {
        // TODO: coming soon
        return null;

    }

    public ObjectManager getObjectManager() {
        // TODO: coming soon
        return null;

    }

    public LevelManager getLevelManager() {
        // TODO: coming soon
        return null;

    }

    public void setPlayerDying(boolean playerDying) {
        // TODO: coming soon

    }

}