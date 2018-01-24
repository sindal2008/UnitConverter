package epam.sindalouski.speedconverter.comparator;
import epam.sindalouski.speedconverter.Speed;
import java.util.Comparator;

/**
 * Класс для сортировки скоростей по убыванию
 */
public class SortDescending  implements Comparator<Speed> {

    @Override
    public int compare(Speed obj1, Speed obj2) {

        double speedMs1 = obj1.getSpeedMs();
        double speedMs2 = obj2.getSpeedMs();

        if(speedMs1 > speedMs2) {
            return -1;
        } else if(speedMs1 < speedMs2) {
            return 1;
        } else {
            return 0;
        }
    }


}
