#include<iostream>
using namespace std;
void pattern(int num){
      for(int row = 0; row<num;row++){
        for(int space = 0; space<num-row-1;space++){
            cout<<" ";
        }
        for(int column = 0; column<2*row+1;column++){
            cout<<"*";
        }
        cout<<endl;
    }
    for(int row = 0; row<num;row++){
        for(int space = 0; space<row;space++){
            cout<<" ";
        }
        for(int column = 0; column<2*(num-row)-1;column++){
            cout<<"*";
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