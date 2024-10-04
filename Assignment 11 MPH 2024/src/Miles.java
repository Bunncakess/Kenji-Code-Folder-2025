// Kenji
// Mr Fox
// 10/3/2024
// Miles converstion

public final class Miles {

    private int distance, hours, minutes;
    private double mph;


    //////I FINALLY SEEEEEEEE WHY THERES TWO MILES ITS JUST A WAY TO INITIALIZE OBJECTS BY OVERLOADING METHODS TO MAKE THE ENTIRE THING FLEXIBLE PAOSDJOAISHJDIOUASHNDIUA
   
    public void setvariables(int dist, int hrs, int mins){
        distance = dist;
        hours = hrs;
        minutes = mins;
    }

    public Miles(){
        setvariables(0, 0, 0);
        mph = 0;
    }

    public Miles(int dist, int hours, int minutes){
        
        setvariables(dist, hours, minutes);

    }
    
    public void calculator(){
        mph = Math.round((distance)/(hours + (minutes/60.0)));
    }

    public void print(){
        System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + mph + "MPH.");
    }



}