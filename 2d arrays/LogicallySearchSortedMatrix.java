public class LogicallySearchSortedMatrix {
    public static boolean searchSortedArray(int matrix[][], int key) {
        for(int i = 0; i < matrix.length; i++) {
            int start = 0; 
            int end = matrix[0].length - 1; 
            while(start <= end) {
                int mid = (start + end) / 2; 
                if(key == matrix[i][mid]) {
                    return true;
                } 
                else if(key < matrix[i][mid]) {
                    end = mid - 1;
                } 
                else if(key > matrix[i][mid]) {
                    start = mid + 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        int key = 45;
        System.out.println(searchSortedArray(matrix, key));
    }
}