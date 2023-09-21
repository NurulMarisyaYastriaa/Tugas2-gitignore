import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Boom extends Actor {
    private int frame = 0;

    /**
     * Act - do whatever the Boom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animateBoom();
    }
    
    private void animateBoom() {
        if (frame == 0) {
            GreenfootImage image = new GreenfootImage("boom1.png");
            image.scale(image.getWidth() / 2, image.getHeight() / 2);
            setImage(image);
        } else if (frame == 10) {
            
        } else if (frame == 20) {
            
        } else if (frame == 30) {
            getWorld().removeObject(this);
        }
        
        frame++;
    }
}
