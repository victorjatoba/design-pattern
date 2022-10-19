public class VictorianChair implements Chair {

  @Override
  public void hasLags() {
    System.out.println("VictorianChair lags");
  }

  @Override
  public void sitOn() {
    System.out.println("VictorianChair sitOn");
  }
}
