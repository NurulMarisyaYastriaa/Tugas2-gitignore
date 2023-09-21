import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower extends Actor
{
    /**
     * Act - do whatever the Tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkCollision();
    }
    
    private void checkCollision() {
        Actor pesawat = getOneIntersectingObject(pesawat.class);
        if (pesawat != null) {
            int pesawatX = pesawat.getX();
            int pesawatY = pesawat.getY();
            World world = getWorld();
            if (world != null) {
                world.removeObject(this);
                world.addObject(new Boom(), pesawatX, pesawatY);
            }
        }
    }
}
