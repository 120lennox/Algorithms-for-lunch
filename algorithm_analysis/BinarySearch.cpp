#include <iostream>
using namespace std;

int binarySearch(int arr[], int key, int length){
    int left = 0;
    int right = length - 1;

    while (left != right){
        int mid = (left + right) / 2;

        if (arr[mid] == key){
            return mid;
        }

        if (key > arr[mid]){
            left = mid + 1;
        }

        else{
            right = mid - 1;
        }
    }

    return -1;
}

int main(){
    int arr[] = {1, 3, 4, 5, 7, 8, 21};
    int length = sizeof(arr) / sizeof(arr[0]);
    cout<<"size = "<<length<<endl;
    int key = 8;

    int result = binarySearch(arr, key, length);

    if (result == -1){
        printf("key not found!\n");
    }
    else{
        printf("Key found of position: %d\n", result);
    }
}