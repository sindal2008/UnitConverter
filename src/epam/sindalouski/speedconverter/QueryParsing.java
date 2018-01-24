package epam.sindalouski.speedconverter;
import epam.sindalouski.speedconverter.myfilereader.MyFileReader;
import java.util.ArrayList;

/**Класс содержит методы для анализа и подготовки информации из входящего файла для дальнейшей обработки*/
public class QueryParsing {

    static int value;
    public static String unit;

    /*Метод возвращает список объектов Speed которые содержат единицы измерения и их значения*/
    public static ArrayList<Speed> queryParsing() {

        /** список будет содержать все параметры, прочитанные из файла в виде строк типа "1 ms"*/
        ArrayList<String> speedsFromFile = MyFileReader.getParamsFromFile("test.txt");

        /*Список содержит объекты класса Speed, которые хранят единицы измерения скоростей и их значения*/
        ArrayList<Speed> speeds = new ArrayList<Speed>();

        /*разбиваем каждую строку списка speedsFromFile на элементы массива, отделяя их значения
        *друг от друга с помощью пробелов.
        *таким образом, четные элементы массива - строки значения, нечетные - единицы измерения скорости*/
        for (int i = 0; i < speedsFromFile.size(); i++) {
            String[] str = speedsFromFile.get(i).split(" ");

           //берем значения скоростей из четных элементов массива
            for (int v = 0; v < str.length; v=+2){
                value = Integer.parseInt(str[v]);
            }
            //берем единицы из нечетных элементов массива
            for (int u = 1; u < str.length; u=+2){
                unit = str[u];
            }

            //добавляем полученные скорости в список
            speeds.add(new Speed(value, unit));
        }
        return speeds;
    }
}


