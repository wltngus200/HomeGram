package com.green.practiceAlone;

public class BBGLAB {
    public static void main(String[] args) {
        NoOverlap2 no = new NoOverlap2();
        int answer;
        for (int i = 0; i < 30; i++) {
            /*answer = (int) (Math.random() * 1000);
            while (!(answer > 100 && no.overlap(answer))) {
                answer = (int) (Math.random() * 1000);
                //각 자리가 모두 다르고 세자리수
            }
            System.out.printf("%d: %b\n", answer, no.overlap(answer));

            System.out.println("-----------------------");*/

            //각 자리가 모두 다르고 세자리수
            do {
                answer = (int) (Math.random() * 1000);
            } while (!(answer > 100 && no.overlap(answer)));
            System.out.printf("%d: %b\n", answer, no.overlap(answer));

        }

    }
}
class NoOverlap2 {
    boolean overlap(int num) {
        int val_1 = num % 10;
        int val_2 = (num % 100) / 10;
        int val_3 = num / 100;
        return (val_1 != val_2 && val_2 != val_3 && val_3 != val_1);
        //각 자리가 다 다른 값
    }
}