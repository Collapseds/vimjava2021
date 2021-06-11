public class CPU{
  private int clockFrequency;
  private int nuclei;
  public void sizeof(CPU c1){
    System.out.println("CPU 参数:\n" + "ClockFrequentcy: " + this.ClockFrequentcy + "MHz" + "\nNuclei: " + nuclei);
  }
  CPU(){
    clockFrequency = (int)(Math.random()*3000);
    nuclei = (int)(Math.random()*8);
  }
}
