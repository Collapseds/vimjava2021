package coma;
import java.util.Scanner;

public class Rectangle{
  private double ld_axis_x;
  private double ld_axis_y;

  private double ru_axis_x;
  private double ru_axis_y;

  public Rectangle (){}
  public Rectangle (double ld_x, double ld_y, double ru_x, double ru_y){
    ld_axis_x = ld_x;
    ld_axis_y = ld_y;
    ru_axis_x = ru_x;
    ru_axis_y = ru_y;
  }

  public double getLdx(){
    return ld_axis_x;
  }
  public double getLdy(){
    return ld_axis_x;
  }
  public double getRux(){
    return ru_axis_x;
  }
  public double getRuy(){
    return ru_axis_y;
  }
  public void setLdx(double Ldx){
    ld_axis_x = Ldx;
  }
  public void setLdy(double Ldy){
    ld_axis_y = Ldy;
  }
  public void setRux(double Rux){
    ru_axis_x = Rux;
  }
  public void setRuy(double Ruy){
    ru_axis_x = Ruy;
  }

  public double getArea(){
    return (this.ld_axis_x - this.ru_axis_x) * (this.ld_axis_y - this.ru_axis_y);
  }
}
