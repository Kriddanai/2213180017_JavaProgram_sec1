
public class Time {
//attributes
	private int second;
	private int minute;
	private int hour;
	
	//Contructor method
	public Time() { //default constructor
		this.second = 0;
		this.minute = 0;
		this.hour = 0;
	}
	//Constructor with parameter
	public Time (int second,int minute,int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	//The public 
	public int second() {
		
	}
     //toSrting method in the form of "hh:mm:ss" with leading zeros
	public String toString() {
		//use built-in function String.format()
		return String.format("%02d:%02d:%02d",hour,minute,second); //จัดรูปแบบ
	}
	
	public void setTime(int second,int minute,int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	
	//Advances this Time instance by one second
	public Time nextSecond() {
		++second;
		if(second>=60) {
			second = 0;
			++minute;
			if(minute>=60) {
				minute = 0;
				++hour;
				if(hour>=24) {
					hour = 0;
				}//end if hour
			}//end if minute
		}//end if second
		return this; //Return "this" instance, to support chaining operations
		             //e.g.
	}
}


