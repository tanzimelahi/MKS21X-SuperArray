

public class Driver {
      public static void main (String[]args) {
    	  SuperArray a=new SuperArray();
    	  for(int i=0;i<9;i++) {
    		  a.add("aba");
    	  }
    	  //first phase
    	  System.out.println("should print 9 abas");
    	  System.out.println(a);
    	  System.out.println("shoud also print 9 abas plus one null");
    	  System.out.println(a.toStringDebug());
    	  System.out.println("should print one aba");
    	  System.out.println(a.get(7));
    	  a.set(6,"suraj");
    	  System.out.println("should print suraj");
    	  System.out.println(a.get(6));
    	  //second phase
      }
}

