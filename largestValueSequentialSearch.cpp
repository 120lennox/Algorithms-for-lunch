/**
 * Author: Lennox Mountain
 * Description: Algorithm finds the largest number in an array
 */

int largest(int arr[]){
    int max = 0;

    for (int i = 0; i < arr.length; i++){
        if (arr[max] < arr[i])
            max = arr[i];
    }

    return max;
}

int main(){
    int arr[] = {1, 2, 3, 4, 5};
    int max = largest(arr);
    printf("%d", max);
}