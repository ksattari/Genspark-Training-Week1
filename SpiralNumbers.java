import java.util.*;

class SpiralNumbers {
    public static  List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> spiralOrder =  new ArrayList<>();
        int index = 0;
        int row = 0;
        int col = 0;
        int i = 0;
        boolean flag = true;
        char state = 'r';

        while(flag){
            flag = false;

            if(state == 'r'){
                // go right and add values to the matrix till you reach the border matrix[0].length - i
                for(; col < matrix[0].length - i ; col++ ){
                    flag = true;
                    spiralOrder.add(matrix[row][col]);
                }
                col--;
                row++;
                if(flag){
                    state = 'd';
                    flag = false;
                }
            }
            if(state == 'd'){
                // go down and add values to the matrix till you reach the border matrix.length - i
                for(; row < matrix.length - i ; row++ ){
                    flag = true;
                    spiralOrder.add(matrix[row][col]);
                }
                row--;
                col--;
                if(flag){
                    state = 'l';
                    flag = false;
                }
            }
            if(state == 'l'){
                // go left and add values to the matrix till you reach the border i
                for(; col > i - 1 ; col-- ){
                    flag = true;
                    spiralOrder.add(matrix[row][col]);
                }
                col++;
                row--;
                if(flag){
                    state = 'u';
                    flag = false;
                }
            }
            if(state == 'u'){
                // go up and add values to the matrix till you reach the border i
                for(; row > i ; row-- ){
                    flag = true;
                    spiralOrder.add(matrix[row][col]);;
                    state = 'r';
                }
                row++;
                col++;
                if(flag){
                    state = 'r';
                }
            }
            i++;
        }
        return spiralOrder;
    }

    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3, }, {5, 6, 7}, {8, 9, 10}, {11, 12, 13} };
        System.out.println(spiralOrder(matrix));

    }
}