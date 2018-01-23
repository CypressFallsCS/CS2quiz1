//© A+ Computer Science  -  www.apluscompsci.com

//ArrayList Quiz 2 KEY

import static java.lang.System.*;
import java.util.ArrayList;

class Cat
{
   private double age;
   private String name;
   
   public Cat(String n, double a)
   {
   	name=n;
      age=a;
   }

   public String getName()
   {
   	return name;
   }
   
   public String toString()
   {
      return name + " - " + age;
   }
}

public class ArrayListQuiz2ABKEY
{
	public static void main(String[] args)
	{
	  
// ------ Instantiate the ArrayList ------ 
    
      ArrayList<Cat> cats = new ArrayList<Cat>();
		
	
		
// ------ Add three Cat objects ------ 
 
      cats.add(new Cat("Fluffy", 6.0));
      cats.add(new Cat("Tiger", 2.5));
      cats.add(new Cat("Ziggy", 0.1));
      
/*
 *		for(int spot=0; spot<3; spot++)
		{
		   cats.add(new Cat("cat-"+spot,spot*3));
		}		
*/	
	
	

// ------ Print out all the cat objects ------ 
 
      for(Cat cat : cats)
      {
         out.println(cat);
      }
/*      
		for(int spot=0; spot<cats.size(); spot++)
		{
		   out.println(cats.get(spot));
		}		
*/		

//    out.println(cats);

      out.println();
      



// ------ Print their names ------
      
      for(Cat cat : cats)
      {
         out.println(cat.getName());
      }
      
/*      
		for(int spot=0; spot<cats.size(); spot++)
		{
		   out.println(cats.get(spot).getName());
		}
*/		
	}
}