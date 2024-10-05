class ArrayD3{
    public static void main(String[] args) {
        int arr[][] = {
            {5, 4, 3},
            {2, 6, 8},
            {1, 3, 4}
        };
        
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[r].length; c++){
                System.out.print(arr[r][c] + " ");

            } System.out.println();
            }
            for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[r].length; c++){
                
            if (r>c){
                System.out.print(arr[r][c]);
            }
        
    }
}
}
}
