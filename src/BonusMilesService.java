public class BonusMilesService {
    public int calculate(int cost) {
        int mileCost = 20;
        int milesTotalCount = cost / mileCost;
        return milesTotalCount;
    }
}
