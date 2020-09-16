import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class Classroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    /**
     * Constructor for objects of class Classroom.
     * 
     */
    public Classroom()
    {    
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130); 

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
   
     private void prepare()
    {
        // Add three lines to this doc with your class constructor and your row and seat number
        // Make sure to match your first and last name to the class file you created.

        /* Example */
  
        AkhilGiridhar akhilgiridhar = new AkhilGiridhar("Akhil", "Giridhar", 1, 3);
        addObject(akhilgiridhar, 1, 3);
        akhilgiridhar.sitDown();  
         
        EricZheng ericzheng = new EricZheng("Eric", "Zheng", 1, 2);
        addObject(ericzheng, 1, 2);
        ericzheng.sitDown();

        ArvindKumar arvindkumar = new ArvindKumar("Arvind", "Kumar", 1, 1);
        addObject(arvindkumar, 1, 1);
        arvindkumar.sitDown();

    }  
    private setPeriod()
    {
            if (currentPeriod == 2) {
		removeObjects(_objects_); //_objects_ mean the people who are created
		addObjects(_objects_);
            }       
            if (currentPeriod == 3) {
		removeObjects(_objects_); //_objects_ mean the people who are created
		addObjects(_objects_);
            }
    }
}


