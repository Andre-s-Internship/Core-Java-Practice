package org.example;

public class Array2D {


    static int findSumHourglass(int[][] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if((i == 1 && j == 0) || (i == 1 && j == 2)){
                    continue;
                }
                sum += arr[i][j];
            }
        }
        return sum;
    }

    static int[][] findHourGlass(int[][] bigArray, int row, int column) {
        int[][] arr = new int[3][3];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = bigArray[row + i][column + j];
            }
        }
        return arr;
    }

    static int findMaxHourGlass(int[][] bigArray) {
        int max = 0;
        int col = 0;
        int row = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(findSumHourglass(findHourGlass(bigArray, i, j)) > max){
                    max = findSumHourglass(findHourGlass(bigArray, i, j));
                    row = i;
                    col = j;
                }
            }
        }
        int[][] array = findHourGlass(bigArray, row, col);
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println(row + " " + col);
        return max;
    }
}
