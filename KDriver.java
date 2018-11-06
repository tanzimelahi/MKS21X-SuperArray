public class KDriver {
  public static boolean even(int i) {
	  if(i%2==0) {
		  return true;
	  }
	  return false;
  }
  public static void  Print(String args) {
	  System.out.println(args);
  }
  public static void Print(int a) {
	  System.out.println(a);
  }
  public static void main(String[]args) {

	  SuperArray test= new SuperArray();
	  System.out.println(test);
	  System.out.println(test);
	  for(int i=0;i<3000;i++) {
		  if(even(i)) {
			  test.add("even");
		  }
		  else {
			  test.add("odd");
		  }
	  }
	  System.out.println(test.size());
	  System.out.println(test.get(1));
	  System.out.println(test.remove(200));
	  Print(test.size());
	  test.add(0,"pokemon");
	  Print(test.size());
	  test.add(0,"go");
	  Print(test.size());
	  test.add(0,"can");
	  Print(test.size());
	  Print(test.indexOf("even"));
	  Print(test.indexOf("odd"));
	  Print(test.set(280,"lucario"));
	  for(int i=0;i<3000;i++) {
		  test.add("go");
		  if(i==1499) {
			  test.clear();
		  }
	  }
	  Print(test.size());
	  for(int i=0;i<100;i++) {
		  test.set(100,"100");
	  }
	  Print(test.get(100));
	  for(int i=0;i<590;i++) {
		  test.set(500,"200000000000000000000000000000000000");
	  }
	  // the return types
	  Print("should be an int"+test.size());
	  Print("shoudl be a booelan"+test.isEmpty());
	  Print("should be a boolean"+test.add("go"));
	  Print("should be a string "+test.get(2));
	  Print("shoudl be a string "+test.set(0,"yeah"));
	  Print("should be false "+test.contains("yeah"));
	  Print("should be int"+test.indexOf("yeah"));
	  Print("should be an int"+test.lastIndexOf("go"));
	  Print("shoudld be an str"+test.remove(3));
	  Print("should be a boolean"+test.remove("go"));
  }
}
