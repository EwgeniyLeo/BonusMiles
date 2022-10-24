public class BonusMilesService {

    public int calculate(int price) {
        int milesCount = price / 20;
        return milesCount;
    }
}
