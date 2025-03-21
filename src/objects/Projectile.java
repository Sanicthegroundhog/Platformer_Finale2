package objects;

import utilz.Constants;

import java.awt.geom.Rectangle2D;

import static utilz.Constants.Projectiles.CANNON_BALL_HEIGHT;
import static utilz.Constants.Projectiles.CANNON_BALL_WIDTH;

public class Projectile {
    private Rectangle2D.Float hitbox;
    private int dir;
    private boolean active = true;


    public Projectile(int x, int y, int dir) {
        xOffset = (int) (-3 * Constants.Game.SCALE);
        Offset = (int) (5 * Constants.Game.SCALE);

        if (dir = 0) {
            xOffset = (int) (29 * Constants.Game.SCALE);
        }
        hitbox = new Rectangle2D.Float(x + xOffset, y + yOffset, CANNON_BALL_WIDTH, CANNON_BALL_HEIGHT);
        this.dir = dir;
    }

    public void updatePos(){
        dir * SPEED + hitbox.x;
    }

    public void setPos(int x, int y){
        // TODO: do what this setter method should do
    }

    public Rectangle2D.Float getHitbox() {
        return hitbox;
    }

    public void setActive(boolean active){
        // TODO: do what you think this should do
    }

    public boolean isActive(){
        // TODO: active
    }
}
