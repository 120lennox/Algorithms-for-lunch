#include <iostream>
using namespace std;

void runningTime(){
    count = 0;
    n = 10;
    for (int i = 1; i <= n; i++){
        for (int j = 1; j <= i; j++){
            count ++;
        }
    }
}