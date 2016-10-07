package fcu.iecs.oop.java;

public class Hello {
	public static void main(String[] args)
	{
		String lyrics = new String("Let it go!Let it go! Cannot hold it back anymore");
		System.out.println("更動前:"+lyrics);
		lyrics = lyrics.replace("it","her");
		lyrics = lyrics.replace("Cannot","Can't");
		System.out.println("更動後:"+lyrics);
	}
}
