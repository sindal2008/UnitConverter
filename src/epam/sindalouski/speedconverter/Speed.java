package epam.sindalouski.speedconverter;

/**
 * Класс хранит информацию о скорости и единицах ее измерения
 */
public class Speed {

    //значение величины скорости
    private int value;

    //единицы измерения скорости
    private String unit;

    //скорость в ms
    private double speedMs;

    //приоритет вывода(отображения)
    private int priorDisplay;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getSpeedMs() {
        return speedMs;
    }

    public void setSpeedMs(double speedMs) {
        this.speedMs = speedMs;
    }

    public void setPriorDisplay(int priorDisplay) {this.priorDisplay = priorDisplay;}

    public int getPriorDisplay() {return priorDisplay;}

    public Speed(int value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public Speed(int value, String unit, double speedMs, int priorDisplay) {
        this.value = value;
        this.speedMs = speedMs;
        this.unit = unit;
        this.priorDisplay = priorDisplay;
    }

    public String toString() {
        return String.format("%s %s = %.3f", value, unit, speedMs);
    }
}

