package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int index = 0;
        if (multiplyByAndToInclusive > 0) {
            while (index <= multiplyByAndToInclusive) {
                System.out.println(multiplyByAndToInclusive * index);
                index++;
            }
        } else if (multiplyByAndToInclusive < 0) {
            while (index <= -multiplyByAndToInclusive) {
                System.out.println(multiplyByAndToInclusive * index);
                index++;
            }
        }
    }
}
