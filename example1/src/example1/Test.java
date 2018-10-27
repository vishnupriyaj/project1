package example1;
class Animal{
  public void run(){
           System.out.println("Animal");
   }
  }
  class Tiger extends Animal{
  final public void jump(){
                   System.out.println("Animal is running");
          }
  public void run(){
	      System.out.println("monkey");
  }
  }

public class Test extends Tiger {


	public static void main(String[] args)
	 {
		Tiger i=new Tiger();
       i.run();
       i.jump();

	}
}