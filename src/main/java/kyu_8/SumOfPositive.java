package kyu_8;

/**
 * Instructions:
 * You get an array of numbers, return the sum of all of the positives ones.
 *
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 *
 * Note: if there is nothing to sum, the sum is default to 0.
 * */

class SumOfPositive {

    static int sum(int[] arr){
        int summ = 0;
        for (int i : arr){
            if (i > 0){
                summ += i;
            }
        }
        return summ;
    }
}

/*
*  public static int sum(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
        or
        return IntStream.of(arr).filter(x -> x > 0).sum();
    }
* */
