package racingcar;

import java.util.Arrays;
import java.util.List;

public class Cars {
    private List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public void createCars(String carNames) {
        List<String> names = Arrays.asList(carNames.split(","));
        this.carList = names.stream()
                .map(name -> new Car(name.trim()))
                .toList();
    }
}
