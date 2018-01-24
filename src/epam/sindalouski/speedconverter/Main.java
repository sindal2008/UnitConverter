package epam.sindalouski.speedconverter;
import epam.sindalouski.speedconverter.comparator.SortAscending;
import epam.sindalouski.speedconverter.comparator.SortByUnits;
import epam.sindalouski.speedconverter.comparator.SortDescending;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //читаем файл в коллекцию
        ArrayList<Speed> speeds = QueryParsing.queryParsing();

        //переводим скорости в метры в секунду
        speeds = Converter.convertToMs(speeds);

        //1. выводим исходный список (массив или коллекцию) скоростей в формате
        //value unit = value_in_ms ms где value_in_ms - значение скорости в метрах в секунду.
        for(int i = 0; i < speeds.size(); i++){
            System.out.println(speeds.get(i).toString() + " ms");
        }
        System.out.println();

        //2. выводим упорядоченный по возрастанию список скоростей, учитывая единицы измерения.
        Collections.sort(speeds, new SortAscending());
        for(int i = 0; i < speeds.size(); i++){
            System.out.println(speeds.get(i).getValue() + " " + speeds.get(i).getUnit());
        }
        System.out.println();

        //3. Определяем, есть ли в списке хотя бы одно значение скорости, равное 2 километра в час
        // (выводим на консоль yes или no).
        if(Search2KmH.isContain2kmh(speeds)){
            System.out.println("yes");
        }
            else{
            System.out.println("no");
        }
        System.out.println();

        // 4. Выводим упорядоченный по убыванию список скоростей, сгруппированный по единицам измерения
        // (вначале kmh, затем mph, kn и последними ms).
        Collections.sort(speeds, new SortByUnits().thenComparing(new SortDescending()));
        for(int i = 0; i < speeds.size(); i++){
            System.out.println(speeds.get(i).getValue() + " " + speeds.get(i).getUnit());
        }
    }
}