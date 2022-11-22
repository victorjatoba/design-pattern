package factories;
import entities.Sofa;
import entities.Chair;
import entities.CoffeeTable;

public interface FurnitureFactory {
  Chair createChair();
  CoffeeTable createCoffeeTable();
  Sofa createSofa();
}
