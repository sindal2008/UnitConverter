package epam.sindalouski.speedconverter.myfilereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * В классе читается полученый файл
 */
public class MyFileReader {

    public static ArrayList<String> getParamsFromFile(String fileName) {

        /** список который будет содержать все параметры для вычислений полученые из файла*/
        ArrayList<String> list = new ArrayList<>();

        /** BufferedReader для чтения текстового файла */
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new java.io.FileReader("test.txt"));
            while (reader.ready()){

                String line = reader.readLine();

                if (!line.equals("")) {
                    list.add(line);
                }
            }
        } catch (FileNotFoundException e){
            System.err.println("Файл не найден, ошибка: " + e);
        } catch (IOException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                }catch (IOException ioException){
                    System.err.println("Ошибка: " + ioException);
                }
            }
        }
        return list;
    }
}
