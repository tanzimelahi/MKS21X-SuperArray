

public class SuperArray {

	   private int size;//variable
	   private String[]data;
	   public SuperArray() {
		   data=new String[10];
		   
	   }
	   public void clear() {
		   size=0;
	   }
	   public int size() {// method overloading
		   return this.size;
	   }
	   public boolean isEmpty() {
		   if(size==0) {
			   return true;
		   }
		   else {
			   return false;
		   }
	   }
	   public boolean add(String element) {
		   data[size]=element;
		   size++;
		   return true;
	   }
	   public String toString() {
		   if (size==0) {
			   return "[]";
		   }
		   String result="[";
		   for(int i=0;i<size-1;i++) {
			   result+=data[i]+",";
		   }
		   result+=data[size-1]+"]";
		   return result;
	   }
	   public String toStringDebug() {// same algorithm as toString
		   String result="{";
		   for(int i=0;i<data.length-1;i++) {
			   result+=data[i]+",";
		   }
		   result+=data[data.length-1]+"}";
		   return result;
	   }
	   public String get(int index) {
		  
		   if (index>=0 && index<size) {
		   return data[index];
		   }
		   else {
			 System.out.println("Error! index out of bound:it is either less than zero or grater than equal to size");
			 return "";
		   }
			   
       }
	   public String set(int index,String element) {
		   if(index>=0 && index<size) {
			   String result=this.get(index);
			   data[index]=element;
			   return result;
		   }
		   else {
			   System.out.println("error;index out of range");
			   return "";
		   }
	   }
	   private void resize() {
		   String[]newdata=new String[data.length*2];
		   for(int i=0;i<data.length;i++) {
			   newdata[i]=data[i];
		   }
		   this.data=newdata;
	   }
		   
	   
		   
}

