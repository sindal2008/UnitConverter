package epam.sindalouski.speedconverter.comparator;
import epam.sindalouski.speedconverter.Speed;
import java.util.Comparator;

/**
 * Класс для сортировки скоростей по единицам измерения,
 * согласно переменной приоритета отображения для задания 4
 */
public class SortByUnits implements Comparator<Speed> {

    @Override
    public int compare(Speed speed1, Speed speed2) {

        int prior1 = speed1.getPriorDisplay();
        int prior2 = speed2.getPriorDisplay();

        if (prior1 > prior2) {
            return 1;
        } else if (prior1 < prior2) {
            return -1;
        } else {
            return 0;
        }
    }
}
