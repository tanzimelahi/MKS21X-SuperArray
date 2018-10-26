

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
		   if (size==data.length) {
			   this.resize();
		   }
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
		public boolean contains(String element)  {
			for(int i=0;i<size;i++) {
				if(data[i].equals(element)) {
					return true;
				}
			}return false;
		}
	   public void add(int index,String element) {
		   if(index<0 || index>=size) {
			   System.out.println("error:index of out bound exception");
		   }
		   else {
			   this.size++;
			   this.resize();//incase there isn't enough space in the list
			   String[]newdata=new String[data.length];
			   for(int i=0;i<index;i++) {
				   newdata[i]=data[i];
			   }
			   newdata[index]=element;
			   for(int i=index+1;i<newdata.length;i++) {
				   newdata[i]=data[i-1];
			   }
			   data=newdata;
		   }
	   }
	   public int indexOf(String target) {
		   for(int i=0;i<size;i++) {
			   if(data[i].equals(target)) {
				   return i;
			   }
		   }return -1;
		   
	   }
	   public int lastIndexOf(String target) {
		   int result=-1;
		   for(int i=0;i<size;i++) {
			   if(data[i].equals(target)) {
				   result=i;
			   }
		   }return result;
	   }
	   public String remove(int index) {
		   if(index<0 || index>=size) {
			   System.out.println("error:index of out bound exception");
			   return "";
		   }
		   else {
			   this.size=size-1;
			   String[]newdata=new String[data.length];
			   for(int i=0;i<index;i++) {
				   newdata[i]=data[i];
			   }
			   String result=data[index];
			   for(int i=index;i<newdata.length-1;i++) {
				   newdata[i]=data[i+1];
			   }
			   data=newdata;
			   return result;
	   }
    }
	 public boolean remove(String element) {
		 int index;
		 for(int i=0;i<size;i++) {
			 if (data[i].equals(element)){
				 index=i;
				 this.remove(i);
				 return true;
			 }
		 }return false;
	 }
	   
}

