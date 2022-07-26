package ru.netology.sqr;

public class SQRService {

    public int numberOfSquares (int num10, int num99) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= num10) {
                if (sqr <= num99) {
                    counter++;
                }
            }

        }
        return counter;
    }
}
