#include <iostream>
using namespace std;

void algorithm(long n){
    for (long i = 2; i <= n/i; i++){
        while (n % i == 0){
            cout<<i<<" \n";
            n = n/i;
        } 
        cout<<i++;
    }
}

int main(){
    int num = 193;
    algorithm(num);
    return 0;
}