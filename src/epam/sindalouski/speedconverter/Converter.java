package epam.sindalouski.speedconverter;
import java.util.ArrayList;

    //Класс содержит методы для конвертации величин скорости
    public class Converter {

        /*метод принимает список скоростей в произвольных единицах, и конвертирует их в ms*/
        public static ArrayList<Speed> convertToMs(ArrayList<Speed> speeds){

            //начальные(пользовательские) единицы измерения скорости
            String initUnit;
            int initValue;

            //переменная хранит приоритет отображения
            int priorDisplay = 0;

            //коэффициент для перевода в ms
            double ratio;

            //список сохраняет все скорости, переведнные в ms;
            ArrayList<Speed> speedMs = new ArrayList<Speed>();

            for (int i = 0; i < speeds.size(); i++) {
                initUnit = speeds.get(i).getUnit();
                initValue = speeds.get(i).getValue();

                switch(initUnit) {
                    case "ms":
                        ratio = 1.0;
                        priorDisplay = 4;
                        break;
                    case "kmh":
                        ratio = 0.278;
                        priorDisplay = 1;
                        break;
                    case "mph":
                        ratio = 0.447;
                        priorDisplay = 2;
                        break;
                    case "kn":
                        ratio = 0.514;
                        priorDisplay = 3;
                        break;
                    default:
                        ratio = 1.0;
                        break;
                }
                //добавляем в коллекцию объекты Speed с указанием скорости в ms, перемножая
                //на нужный коэффициент ratio, а также приоритет отображения
                speedMs.add(new Speed(initValue, initUnit, initValue*ratio, priorDisplay));
            }
            return speedMs;
        }
    }


