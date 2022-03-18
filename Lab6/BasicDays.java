public class BasicDays { 
	private String day_1 = "Monday"; 
	private String day_2 = "Tuesday"; 
	private String day_3 = "Wednesday"; 
	private String day_4 = "Thursday"; 
	private String day_5 = "Friday"; 
	private String day_6 = "Saturday"; 
	private String day_7 = "Sunday";
	private String lol= day_1 + " " + day_2 + " " + day_3 + " " + day_4 + " " + day_5 + " " + day_6 + " " + day_7; 
	
	public BasicDays(){
		this.lol=lol;
		this.day_1=day_1;
		this.day_2=day_2;
		this.day_3=day_3;
		this.day_4=day_4;
		this.day_5=day_5;
		this.day_6=day_6;
		this.day_7=day_7;
	}

	public String getBasicDays(){
		return lol;
	}
}
