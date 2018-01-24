package epam.sindalouski.speedconverter;
import java.util.ArrayList;

/**
 * Класс содержит метод для определения
 * есть ли в списке хотя бы одно значение скорости, равное 2 километра в час
 */
public class Search2KmH {

    //переменная-счетчик для подсчета количества встреч "2 kmh" в данных
    static int a = 0;
    public static boolean isContain2kmh(ArrayList<Speed> speeds) {

        for (int i = 0; i < speeds.size(); i++) {
            if (speeds.get(i).getValue() == 2 && speeds.get(i).getUnit().equals("kmh")) {
                a++;
                //т.к. необходимо определить, есть ли в списке хотя бы одно значение скорости,
                // равное 2 километра в час, то после первой встречи выходим из цикла поиска
                break;
            }
        }
        if (a > 0) {
            return true;}
        else
            return false;
    }
}
