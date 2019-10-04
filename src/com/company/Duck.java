public class Duck {
    private double height;  // in cm
    private double weight;  // in g
    private String color;
    private Boolean pointyBeak;
    private Boolean hotDetector;
    private String mood;
    private String name;
    private int distanceSwam;

    public Duck (String n, double h, double w, String c, Boolean p, Boolean hot, String m)
    {
        weight = w;
        height = h;
        color = c;
        pointyBeak = p;
        hotDetector = hot;
        mood = m;
        distanceSwam = 0;   // 0 by default
        name = n;
    }

    public boolean hasPointyBeak(){    //accessor method
        return pointyBeak;
    }
    public void walk(){
        System.out.println("waddle waddle");
    }

    public void swim(int dist){
        distanceSwam += dist;   // distanceSwam = distanceSwam + dist;
    }

    public int getDistance(){   // accessor method
        return distanceSwam;
    }

    public void annoyDuck(){
        mood = "Sad";
    }

    public String getMood(){        //accessor method
        return mood;
    }

    public String talk(String topic){
        String s = "I like " + topic;
        s += " and I feel " + mood + " right now.";
        return s;
    }

    public String toString(){
        String s = "A " + color + " Duck named " + name + ".  ";
        s += "It is " + height + " cm tall and weighs " + weight + " g. ";
        s += "Right now it is in a " + mood + " mood.";
        return s;
    }


    public static void main(String[] args){
        Duck d1 = new Duck("Rita",5, 30, "Red", true, true, "angry");
        Duck d2 = new Duck("Tyler", 2, 15, "Hot Pink", false, false, "mellow");

        d1.swim(30);
        System.out.println(d1.talk("grapes"));
        d1.walk();

        System.out.println(d2.talk("ducks"));

        System.out.println(d1);
        System.out.println(d2);

    }
}