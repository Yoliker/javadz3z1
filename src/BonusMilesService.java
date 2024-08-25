public class BonusMilesService {
    public int calculate(int price) {
        int oneMiles = 20;
//        int bonus;
//        if (oneMiles >= 20) {
//            bonus = price / oneMiles;
//        } else {
//            bonus = 0;
//        }
        int bonus = oneMiles >= 20 ? price / oneMiles : 0;   /* тернарный оператор*/

        return bonus;
    }
}
