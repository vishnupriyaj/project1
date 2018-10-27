package example1;

import java.util.regex.Pattern;

class donkey{
    static public void run(){
           System.out.println("Animal");
   }
  }
  class tractor extends donkey{
  final public void jump(){
                   System.out.println("Animal is running");
          }
  static public void run(){
	      System.out.println("monkey");
  }
  }

public class Pattern2 extends tractor {
	public static void main(String[] args)
	 {
		tractor i=new tractor();
       i.run();
       i.jump();

	 }}                                                                                                                                     