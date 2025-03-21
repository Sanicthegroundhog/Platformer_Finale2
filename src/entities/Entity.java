package entities;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public abstract class Entity {

    protected float x, y;
    protected int width, height;
    protected Rectangle2D.Float hitbox;
    protected int aniTick, aniIndex;
    protected int state;
    protected float airSpeed;
    protected boolean inAir = false;
    protected int maxHealth;
    protected int currentHealth;
    protected Rectangle2D.Float attackBox;
    protected float walkSpeed;

    public Entity(float x, float y, int width, int height) {
        // TODO: coming soon

    }

    protected void drawAttackBox(Graphics g, int xLvlOffset) {
        // TODO: coming soon

    }

    protected void drawHitbox(Graphics g, int xLvlOffset) {
        // TODO: coming soon

    }

    protected void initHitbox(int width, int height) {
        // TODO: coming soon

    }

    public Rectangle2D.Float getHitbox() {
        // TODO: coming soon
        return null;
    }

    public int getState() {
        // TODO: coming soon
        return 0;
    }

    public int getAniIndex() {
        // TODO: coming soon
        return 0;
    }

    public int getCurrentHealth() {
        // TODO: coming soon
        return 0;
    }

}