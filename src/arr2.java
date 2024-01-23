public class arr2 {public static void main(String[] args) {
    int arr[][]=new int[2][2];
    arr[0][0]=10;
    arr[0][1]=20;
    arr[1][0]=30;
    arr[1][1]=40;

    int arr1[][]=new int[2][2];
    arr1[0][0]=10;
    arr1[0][1]=20;
    arr1[1][0]=30;
    arr1[1][1]=40;

    int result[][]=new int[2][2];

    for(int i=0; i<2;i++){
        for(int j =0; j<2;j++){
            System.out.print((result[i][j]=arr[i][j]+arr1[i][j])+"   ");

        }
        System.out.println();
    }
}
}

