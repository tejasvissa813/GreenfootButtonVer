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
    private ArrayList<Student> list_of_students = new ArrayList<Student>();
    /**
     * Constructor for objects of class Classroom.
     * 
     */
    protected int currentPeriod;
    public TogglePeriodBtn tpb = new TogglePeriodBtn();
    public Classroom()
    {    
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130);
        currentPeriod = 2;
        prepare();
        moveStudents();
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
        
        addObject(tpb,0,0);
  
        AkhilGiridhar akhilgiridhar = new AkhilGiridhar("Akhil", "Giridhar", 1, 1, 3);
        addObject(akhilgiridhar, 1, 1);
        akhilgiridhar.sitDown();
        list_of_students.add(akhilgiridhar);
         
        EricZheng ericzheng = new EricZheng("Eric", "Zheng", 1, 2, 3);
        addObject(ericzheng, 1, 2);
        ericzheng.sitDown();
        list_of_students.add(ericzheng);

        ArvindKumar arvindkumar = new ArvindKumar("Arvind", "Kumar", 1, 1, 2);
        addObject(arvindkumar, 1, 1);
        arvindkumar.sitDown();
        list_of_students.add(arvindkumar);
        
        KilgoreTrout kilgoretrout = new KilgoreTrout("Kilgore", "Trout", 1, 2, 2);
        addObject(kilgoretrout, 1, 2);
        kilgoretrout.sitDown();
        list_of_students.add(kilgoretrout);

    }
    public void moveStudents(){
        for(Student student : list_of_students){
            if(tpb.getCurrentPeriod() == student.getPeriod()){
                student.setLocation(student.myRow, student.mySeat);
                student.setImage(student.portraitFile);
            }
            else{
                student.setLocation(1000, 1000);
                student.setImage(new GreenfootImage(1,1));
            }
        }
    }
}


