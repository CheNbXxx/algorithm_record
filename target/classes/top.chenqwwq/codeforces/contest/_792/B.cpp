//
// Created by chenqwwq on 2022/5/20.
//


#include <iostream>

using namespace std;

int main() {
    int t, a, b, c;
    cin >> t;
    while (t--) {
        cin >> a >> b >> c;
        cout << a + b + c << " " << b + c << " " << c << endl;
    }
    return 0;
}