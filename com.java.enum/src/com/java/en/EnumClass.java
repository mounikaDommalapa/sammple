package com.java.en;

enum Day{
	MON,TUE,WD,THU,FRI,SAT
}
public class EnumClass {

	Day day;
	public EnumClass(Day day)
	{
		this.day=day;
	}
	public void daydisplay()
	{
		switch(day)
		{
		case MON:System.out.println("monday");
					break;

		case TUE:System.out.println("tuesday");
				break;
		case WD:System.out.println("wednesdday");
		break;
		case THU:System.out.println("thursday");
break;
		case FRI:System.out.println("friday");
		}
	}

}
