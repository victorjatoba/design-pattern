import entities.Chair;
import entities.CoffeeTable;
import entities.Sofa;
import entities.VictorianChair;
import entities.VictorianCoffeeTable;
import entities.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {

  @Override
  public Chair createChair() {
    VictorianChair vc = new VictorianChair();
    return vc;
  }

  @Override
  public CoffeeTable createCoffeeTable() {
    return new VictorianCoffeeTable();
  }

  @Override
  public Sofa createSofa() {
    return new VictorianSofa();
  }
}
