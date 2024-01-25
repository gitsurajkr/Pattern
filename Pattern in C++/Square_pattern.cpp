#include<iostream>
using namespace std;
void pattern(int num){
    for(int row = 0; row<num;row++){
        for(int column = 0; column<num;column++){
            cout<<" * ";
        }
        cout<<endl;
    }
}
int main(){
    int rows;
    cout<<"Enter Number of rows:";
    cin>>rows;
    pattern(rows);
}