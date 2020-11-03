import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input the current seconds");
    int secs = scan.nextInt();
    Time myTime = new Time(secs);
    
    System.out.println("Input the current minutes");
    myTime.setMinute(scan.nextInt());
    
    System.out.println("Input the current hour");
    myTime.setHour(scan.nextInt());

    myTime.formatTime();
    
  }
}

class Time{
  private int hour=0;
  private int minutes=0;
  private int seconds=0;

  public Time(){

  }
  public Time(int sec){
   
   if (sec < 0){
     System.out.printf("The second cannot be less than 0. 0 has been used instead of %d", sec);
     System.out.println();
     seconds = 0;
   }
   else{
     minutes += sec/60;
     seconds = sec%60; 
   }
   
  } 
  
  public int getMinute(){
    return minutes;
  }

  public void setMinute(int min){
   
   if (min < 0){
     System.out.printf("The minute cannot be less than 0. 0 has been used instead of %d", min);
     System.out.println();
     minutes += 0;
   }
   else{
     hour += (minutes+min)/60;
    minutes += (minutes+min)%60;
    
    }
  }

  public int getHour(){
    return hour;
  }

  public void setHour(int hr){
   if (hr+hour > 23){
     System.out.printf("The hour cannot be greater than 23. 23 has been used instead of %d", hr);
     System.out.println();
     hour = 23;
   }
   else if (hr < 0){
     System.out.printf("The hour cannot be less than 0. 0 has been used instead of %d", hr);
     System.out.println();
     hour = 0;
   }
   else
    hour += hr;
    
  }

  
  public void formatTime(){
      System.out.printf("The time format of the details inputed is %d:%d:%d", hour, minutes, seconds);
  }
}