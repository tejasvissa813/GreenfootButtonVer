import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ToggleButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class TogglePeriodBtn extends Actor{  //2 possible image states for actor are box with 1 and 2
    protected int currentPeriod;
    protected String imageFile;
    public TogglePeriodBtn(){
        setLocation(50, 50); //can be any location
        currentPeriod = 2;
        imageFile = "Period" +currentPeriod+ ".jpg";
        }
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            changePeriod();
          }
        setImage(imageFile);
    }
    public void changePeriod(){
        if(currentPeriod == 2){
               setCurrentPeriod(3);
        }
        else setCurrentPeriod(2);
        imageFile = "Period"+currentPeriod+".jpg";
        ((Classroom)getWorld()).moveStudents();
    }
    public int getCurrentPeriod(){
        return currentPeriod;
    }
    public void setCurrentPeriod(int newCurrentPeriod){
        if(newCurrentPeriod == 2 || newCurrentPeriod == 3)
            currentPeriod = newCurrentPeriod;
    }
}
