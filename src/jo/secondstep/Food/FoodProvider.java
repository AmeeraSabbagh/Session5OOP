package jo.secondstep.Food;

import java.util.List;

public interface FoodProvider {
	void requestOrder(List<Items> items);
	double calculateBill();
	void viewMenue();
}
