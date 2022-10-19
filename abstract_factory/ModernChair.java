public class ModernChair implements Chair {

  @Override
  public void hasLags() {
    System.out.println("ModernChair lags");
  }

  @Override
  public void sitOn() {
    System.out.println("ModernChair sitOn");
  }
}
