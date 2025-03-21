package entities;


import utilz.Constants;
import utilz.Constants.Game;

import java.awt.geom.Rectangle2D;

import static utilz.Constants.ANI_SPEED;
import static utilz.Constants.Directions.LEFT;
import static utilz.Constants.Directions.RIGHT;
import static utilz.Constants.EnemyConstants.*;
import static utilz.Constants.GRAVITY;
import static utilz.HelpMethods.*;

public abstract class Enemy extends Entity {
    protected int enemyType;
    protected boolean firstUpdate = true;
    protected int walkDir = LEFT;
    protected int tileY;
    protected float attackDistance = Game.TILES_SIZE;
    protected boolean active = true;
    protected boolean attackChecked;

    public Enemy(float x, float y, int width, int height, int enemyType) {
        super(x, y, width, height);
        // TODO: coming soon

    }

    protected void firstUpdateCheck(int[][] lvlData) {
        // TODO: coming soon

    }

    protected void updateInAir(int[][] lvlData) {
        // TODO: coming soon

    }

    protected void move(int[][] lvlData) {
        // TODO: coming soon

    }

    protected void turnTowardsPlayer(Player player) {
        // TODO: coming soon

    }

    protected boolean canSeePlayer(int[][] lvlData, Player player) {
        // TODO: coming soon
        return false;
    }

    protected boolean isPlayerInRange(Player player) {
        // TODO: coming soon
        return false;
    }

    protected boolean isPlayerCloseForAttack(Player player) {
        // TODO: coming soon
        return false;
    }

    protected void newState(int enemyState) {
        // TODO: coming soon

    }

    public void hurt(int amount) {
        // TODO: coming soon

    }

    protected void checkPlayerHit(Rectangle2D.Float attackBox, Player player) {
        // TODO: coming soon


    }

    protected void updateAnimationTick() {
        // TODO: coming soon

    }

    protected void changeWalkDir() {
        // TODO: coming soon

    }

    public void resetEnemy() {
        // TODO: coming soon

    }


    public boolean isActive() {
        // TODO: coming soon
        return false;
    }

}