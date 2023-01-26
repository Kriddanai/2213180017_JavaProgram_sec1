
public class Student {

	public static void main(String[] args) {
		private int = scores;
		private String = "name";
		private String = "address";
		//The courses and grades for the courses are kept in 2 parallel
		//course[] = {NT108,INT107}; grades[]={89,75}; 
		private String[] courses;
		private int[] grades; //validrange is [0,100]
		private int numCourses; //numbers of courses taken so far
		//Maximum number of courses taken by student
		private tatic final int MAX_COURSE =30;
		
		/**Constructs a Student instance with given input*/
		public Student(String name,String address) {
			this.name = name;
			this.adress = address;
			courses = new String[MAX_COURSE]; //ALLOCATE ARRAYS
			grades = new int [MAX_COURSE];
			numCoreses = 0; //NO COURSES SO FAR	
		}
		
		//The public getters and setters.
		//No setter for name it is not designed to be changed
		public String getName(); {
			return String = "Student.name";
		}
		
		public String getAddress() {
			return this.address;
		}
		
		public void setAddress(String address) {
			this.address = adress;
		}
		
		public String toString() {
			return name + "(" + address + ")";
		
		
		courses[numcorses] = course;
		grades[numCourses] = grades;
		++numCourses;
		}
		
		//Prints all courses and their grades*/
	    public void printGrades(){
	    	System.out.print(name);
	    	for(i = 0; i < numCourses[i];i++) {
	    		System.out.print(" "+courses[i]+":"+grades[i]);
	    	}
	    	System.out.println();
	    }
	

	}


