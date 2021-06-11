import java.util.function.Function;
import coma.Rectangle;

public class rectangle{
  public void test1() {
    Rectangle r1 = new Rectangle(5.32, 6.09, 3.42, 4.17);
    Function<Rectangle, Double> bi = (Rectangle x) -> Math.abs((x.getLdy() - x.getRuy()) * (x.getLdx() - x.getRux()));
    System.out.println(bi.apply(r1));
  }
  public static void main(String[] args) {
    new rectangle().test1();
  }
}
