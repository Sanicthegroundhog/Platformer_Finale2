package objects;

import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import entities.Player;
import gamestates.Playing;
import levels.Level;
import utilz.Constants;
import utilz.LoadSave;
import static utilz.Constants.ObjectConstants.*;
import static utilz.HelpMethods.CanCannonSeePlayer;
import static utilz.HelpMethods.IsProjectileHittingLevel;
import static utilz.Constants.Projectiles.*;

public class ObjectManager {

    private Playing playing;
    // TODO: add these fields.  note Playing, Player, and Level don't exist yet.
    private BufferedImage[][] potionImgs, containerImgs;
    private BufferedImage[] cannonImgs;
    private BufferedImage spikeImg, cannonBallImg;
    private ArrayList<Potion> potions;
    private ArrayList<GameContainer> containers;
    private ArrayList<Spike> spikes;
    private ArrayList<Cannon> cannons;
    private ArrayList<Projectile> projectiles = new ArrayList<>();
    private ArrayList<Playing> playings;
    private ArrayList<Player> players;
    private ArrayList<Level> levels;

    public ObjectManager(Playing playing) {
        this.playing = playing;
        loadImgs();
    }

    public void checkSpikesTouched(Player p) {
        for (Spike s : spikes) {
            if (s.getHitbox().intersects(p.getHitbox())) {
                p.kill();
            }
        }

        public void checkObjectTouched (Rectangle2D.Float hitbox){
            // TODO: loop through all of the potions like you did for spikes
            for (Potion p : potions) {
                if (p.isActive()) {
                    if (hitbox().intersects(p.getHitbox)) {
                        p.setActive(false);
                        applyEffectToPlayer(p);
                    }

                }
            }

            public void applyEffectToPlayer (Potion p){
                // TODO: simple if else statement each block has one line of code
                if (p.getObjType = RED_POTION) {
                    playing.getPlayer(RED_POTION_VALUE);
                } else {
                    playing.getPlayer(BLUE_POTION_VALUE);
                }
            }

            public void checkObjectHit (Rectangle2D.Float attackbox){
                // TODO: loop through all of the GameContainer's :  starting to see a pattern here.
                // for start
                // TODO: check if gc.isActive and !gc.doAnimation
                // if start
                // TODO: check if (gc.getHitbox(attackbox))
                // if start
                // TODO: call gc's setAnimation method passing in true
                // TODO: create an int called type and set to 0
                // TODO: check if gc.getObjType is BARREL
                // if start
                // TODO: set type to 1
                // if end
                // TODO: add a new Potion() to potions.  You'll pass the following arguments to the new Potion constructor
                // arguments for new Potion()
                //(int) (gc.getHitbox().x + gc.getHitbox().width / 2),
                // (int) (gc.getHitbox().y - gc.getHitbox().height / 2),
                // type)
                // TODO: call return
                // end of if
                // end of if
                // end of for
            }

            public void loadObjects (Level newLevel){
                // TODO: set potions to a new ArrayList of postions passing in newLevel.getPotions()
                // TODO: same idea for contains
                // TODO: set spikes to newLevel.getSpikes()
                // TODO: same idea for cannons
                // TODO: call projectiles clear method
            }

            private void loadImgs () {
                BufferedImage potionSprite = LoadSave.GetSpriteAtlas(LoadSave.POTION_ATLAS);
                potionImgs = new BufferedImage[2][7];

                for (int j = 0; j < potionImgs.length; j++) {
                    for (int i = 0; i < potionImgs[j].length; i++) {
                        potionImgs[j][i] = potionSprite.getSubimage(12 * i, 16 * j, 12, 16);
                    }
                }

                BufferedImage containerSprite = LoadSave.GetSpriteAtlas(LoadSave.CONTAINER_ATLAS);
                containerImgs = new BufferedImage[2][8];

                for (int j = 0; j < containerImgs.length; j++) {
                    for (int i = 0; i < containerImgs[j].length; i++) {
                        containerImgs[j][i] = containerSprite.getSubimage(40 * i, 30 * j, 40, 30);
                    }
                }

                spikeImg = LoadSave.GetSpriteAtlas(LoadSave.TRAP_ATLAS);

                cannonImgs = new BufferedImage[7];
                BufferedImage temp = LoadSave.GetSpriteAtlas(LoadSave.CANNON_ATLAS);

                for (int i = 0; i < cannonImgs.length; i++) {
                    cannonImgs[i] = temp.getSubimage(i * 40, 0, 40, 26);
                }

                cannonBallImg = LoadSave.GetSpriteAtlas(LoadSave.CANNON_BALL);

            }

            public void update ( int[][] lvlData, Player player){
                // TODO: loop through all of the potions, like you've done before.  use p as the loop variable.  check if its active.
                // call p's update method if so.
                // end of if
                // end of for

                // TODO: repeat but use GameContainer gc : containers instead for the loop
                // end of if
                // end of for

                // TODO: call updateCannons (lvlData, player)
                // TODO: same for updateProjectiles
            }

            private void updateProjectiles ( int[][] lvlData, Player player){
                for (Projectile p : projectiles) {
                    if (p.isActive()) {
                        p.updatePos();
                        if (p.getHitbox().intersects(player.getHitbox())) {
                            player.changeHealth(-25);
                            p.setActive(false);
                        } else if (IsProjectileHittingLevel(p, lvlData)) {
                            p.setActive(false);
                        }
                    }
                }
            }

            private boolean isPlayerInRange (Cannon c, Player player){
                (int) Math.abs(player.getHitbox().x - c.getHitbox().x) = (int) absValue;
                return absValue <= Constants.Game.TILES_SIZE * 5;
            }

            private boolean isPlayerInfrontOfCannon (Cannon c, Player player){
                // TODO: simple if, else if, else condition
                if (c.getObjType = CANNON_LEFT) {
                    if (c.getHitbox().x > player.getHitbox().x) {
                        return true;
                    }
                    if (c.getHitbox.x < player.getHitbox().x) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }

            private void updateCannons ( int[][] lvlData, Player player){
                for (Cannon c : cannons) {
                    // TODO: a for Cannon c: cannons loop followed by 5 nested ifs each doing nothing but calling
                    // another if statement until the deepest one call's c.setAnimation() passing in true.
                    if (!c.doAnimation){
                    if (c.getTileY() = player.getTileY){
                    if (isPlayerInRange (c, player){
                    if (isPlayerInfrontOfCannon(c, player) {
                                if (CanCannonSeePlayer(lvlData, player.getHitbox, c.getHitbox, c.getTileY))
                                    c.setAnimation(true);
                            }
                        }
                    }
                    }
                    c.update;
                    if (c.getAniIndex() == 4 && c.getAniTick() == 0) {
                        shootCannon(c);
                    }
                }


            }

            private void shootCannon (Cannon c){
                int(dir = 1);
                // TODO: check if c.getObjType is the CANNON_LEFT and set dir to -1 if it is.  all done with if
                // add a new Projectile to projectiles.  new Projectile's args are
                // (int) c.getHitbox().x, (int) c.getHitbox().y, dir
            }

            public void draw (Graphics g,int xLvlOffset){
                g.xLvlOffset(drawPotions, drawContainers, drawTraps, drawCannons, drawProjectiles);
            }

            private void drawProjectiles (Graphics g,int xLvlOffset){
                for (Projectile p : projectiles)
                    if (p.isActive())
                        g.drawImage(cannonBallImg, (int) (p.getHitbox().x - xLvlOffset), (int) (p.getHitbox().y), CANNON_BALL_WIDTH, CANNON_BALL_HEIGHT, null);

            }

            private void drawCannons (Graphics g,int xLvlOffset){
                for (Cannon c : cannons) {
                    int x = (int) (c.getHitbox().x - xLvlOffset);
                    int width = CANNON_WIDTH;

                    if (c.getObjType() == CANNON_RIGHT) {
                        x += width;
                        width *= -1;
                    }

                    g.drawImage(cannonImgs[c.getAniIndex()], x, (int) (c.getHitbox().y), width, CANNON_HEIGHT, null);
                }

            }

            private void drawTraps (Graphics g,int xLvlOffset){
                for (Spike s : spikes)
                    g.drawImage(spikeImg, (int) (s.getHitbox().x - xLvlOffset), (int) (s.getHitbox().y - s.getyDrawOffset()), SPIKE_WIDTH, SPIKE_HEIGHT, null);

            }

            private void drawContainers (Graphics g,int xLvlOffset){
                for (GameContainer gc : containers)
                    if (gc.isActive()) {
                        int type = 0;
                        if (gc.getObjType() == BARREL)
                            type = 1;
                        g.drawImage(containerImgs[type][gc.getAniIndex()], (int) (gc.getHitbox().x - gc.getxDrawOffset() - xLvlOffset), (int) (gc.getHitbox().y - gc.getyDrawOffset()), CONTAINER_WIDTH,
                                CONTAINER_HEIGHT, null);
                    }
            }

            private void drawPotions (Graphics g,int xLvlOffset){
                for (Potion p : potions)
                    if (p.isActive()) {
                        int type = 0;
                        if (p.getObjType() == RED_POTION)
                            type = 1;
                        g.drawImage(potionImgs[type][p.getAniIndex()], (int) (p.getHitbox().x - p.getxDrawOffset() - xLvlOffset), (int) (p.getHitbox().y - p.getyDrawOffset()), POTION_WIDTH, POTION_HEIGHT,
                                null);
                    }
            }

            public void resetAllObjects () {
                loadObjects(playing.getLevelManager().getCurrentLevel);
                for (Potion p : potions)
                    p.reset();
                for (GameContainer gc : containers)
                    gc.reset();
                for (Cannon c : cannons)
                    c.reset();
            }
        }
    }
}