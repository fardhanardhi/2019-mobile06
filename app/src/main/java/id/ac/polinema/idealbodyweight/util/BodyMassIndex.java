package id.ac.polinema.idealbodyweight.util;

public class BodyMassIndex {

    private int weight;
    private int height;
    private float index;

    public BodyMassIndex(int weight, int height) {
        this.weight = weight;
        this.height = height;
        this.index = calculate();
    }

    public float getIndex() {
        return index;
    }

    private float calculate() {
        float a = (float)height / 100;
        System.out.println(a);
        float b = (float)a*a;
        System.out.println(b);
        float c = (float)weight / b;
        System.out.println(c);

        return c;
//        return (weight) / ((height * height) * 100);
    }
}
