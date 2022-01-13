package class_object.Bai_tap.Fan;

public class Fan {
   final int slow=1;
   final int medium=2;
   final int fast=3;
   int speed = slow;
   private boolean on = false;
   private double radius = 5;
   private String color = "blue";

   public Fan (int speed, double radius, String color, boolean on) {
      this.speed =speed;
      this.radius = radius;
      this.color = color;
      this.on = on;
   }
   public int getSpeed () {
      return this.speed;
   }
   public void setSpeed (int speed) {
      this.speed = speed;
   }
   public boolean getOn () {
      return this.on;
   }
   public String getColor () {
      return this.color;
   }
   public double getRadius () {
      return this.radius;
   }






}
