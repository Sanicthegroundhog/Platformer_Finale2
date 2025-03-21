package entities;

import audio.AudioPlayer;
import gamestates.Playing;
import utilz.Constants;
import utilz.LoadSave;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import static utilz.Constants.*;
import static utilz.Constants.ANI_SPEED;
import static utilz.Constants.GRAVITY;
import static utilz.Constants.PlayerConstants.*;
import static utilz.HelpMethods.*;

public class Player extends Entity {

    private BufferedImage[][] animations;
    private boolean moving = false, attacking = false;
    private boolean left, right, jump;
    private int[][] lvlData;
    private float xDrawOffset = 21 * Game.SCALE;
    private float yDrawOffset = 4 * Game.SCALE;

    // Jumping / Gravity
    private float jumpSpeed = -2.25f * Game.SCALE;
    private float fallSpeedAfterCollision = 0.5f * Game.SCALE;

    // StatusBarUI
    private BufferedImage statusBarImg;

    private int statusBarWidth = (int) (192 * Game.SCALE);
    private int statusBarHeight = (int) (58 * Game.SCALE);
    private int statusBarX = (int) (10 * Game.SCALE);
    private int statusBarY = (int) (10 * Game.SCALE);

    private int healthBarWidth = (int) (150 * Game.SCALE);
    private int healthBarHeight = (int) (4 * Game.SCALE);
    private int healthBarXStart = (int) (34 * Game.SCALE);
    private int healthBarYStart = (int) (14 * Game.SCALE);
    private int healthWidth = healthBarWidth;

    private int powerBarWidth = (int) (104 * Game.SCALE);
    private int powerBarHeight = (int) (2 * Game.SCALE);
    private int powerBarXStart = (int) (44 * Game.SCALE);
    private int powerBarYStart = (int) (34 * Game.SCALE);
    private int powerWidth = powerBarWidth;
    private int powerMaxValue = 200;
    private int powerValue = powerMaxValue;

    private int flipX = 0;
    private int flipW = 1;

    private boolean attackChecked;
    private Playing playing;

    private int tileY = 0;

    private boolean powerAttackActive;
    private int powerAttackTick;
    private int powerGrowSpeed = 15;
    private int powerGrowTick;

    public Player(float x, float y, int width, int height, Playing playing) {
        super(x, y, width, height);
        // TODO: coming soon

    }

    public void setSpawn(Point spawn) {
        // TODO: coming soon

    }

    private void initAttackBox() {
        // TODO: coming soon

    }

    public void update() {
        // TODO: coming soon

    }

    private void checkSpikesTouched() {
        // TODO: coming soon

    }

    private void checkPotionTouched() {
        // TODO: coming soon
    }

    private void checkAttack() {
        // TODO: coming soon

    }

    private void updateAttackBox() {
        // TODO: coming soon

    }

    private void updateHealthBar() {
        // TODO: coming soon
    }

    private void updatePowerBar() {
        // TODO: coming soon

    }

    public void render(Graphics g, int lvlOffset) {
        // TODO: coming soon

    }

    private void drawUI(Graphics g) {
        // TODO: coming soon

    }

    private void updateAnimationTick() {
        // TODO: coming soon

    }

    private void setAnimation() {
        // TODO: coming soon

    }

    private void resetAniTick() {
        // TODO: coming soon

    }

    private void updatePos() {
        // TODO: coming soon

    }

    private void jump() {
        // TODO: coming soon

    }

    private void resetInAir() {
        // TODO: coming soon

    }

    private void updateXPos(float xSpeed) {
        // TODO: coming soon

    }

    public void changeHealth(int value) {
        // TODO: coming soon

    }

    public void kill() {
        // TODO: coming soon
    }

    public void changePower(int value) {
        // TODO: coming soon

    }

    private void loadAnimations() {
        // TODO: coming soon

    }

    public void loadLvlData(int[][] lvlData) {
        // TODO: coming soon

    }

    public void resetDirBooleans() {
        // TODO: coming soon

    }

    public void setAttacking(boolean attacking) {
        // TODO: coming soon
    }

    public boolean isLeft() {
        // TODO: coming soon
        return false;
    }

    public void setLeft(boolean left) {
        // TODO: coming soon
    }

    public boolean isRight() {
        // TODO: coming soon
        return false;
    }

    public void setRight(boolean right) {
        // TODO: coming soon
    }

    public void setJump(boolean jump) {
        // TODO: coming soon
    }

    public void resetAll() {
        // TODO: coming soon

    }

    private void resetAttackBox() {
        // TODO: coming soon

    }

    public int getTileY() {
        // TODO: coming soon
        return 0;
    }

    public void powerAttack() {
        // TODO: coming soon


    }

}