#include<iostream>
#include<string.h>
#include <cstdlib>
#define MAX_NUM 6
using namespace std;
int randomfunc(int &score);
int main()
{
int p1_score=0,p2_score=0;
cout<<endl;
cout<<endl;
cout<<"=============================================================="<<endl;
cout<<endl;
cout<<"\t\tSNAKE AND LADDER GAME \t\t\t\t"<<endl;
cout<<endl;
cout<<"=============================================================="<<endl;
cout<<endl;
cout<<"\t\tRahuL Nagpure\t\t\t"<<endl;
cout<<endl;
cout<<"=============================================================="<<endl;

string player1,player2;

cout<<"Enter the Name of  Player 1 :"<<endl;
cin>>player1;
cout<<"Enter the Name of the Player 2 : "<<endl;
cin>>player2;
cout<<"The Position of Player 1 and Player 2 is 0 Initially"<<endl;

while(p1_score<100 && p2_score<100)
{
cout<<player1<<" It is Your Turn 'Press 'ENTER' to Play' "<<endl;
cin.get();
randomfunc(p1_score);
cout<<"Your Score is: "<<p1_score<<endl;
cout<<player2<<" It is Your Turn Press 'ENTER' to Play'"<<endl;
cin.get();
randomfunc(p2_score);
cout<<"Your Score is: "<<p2_score<<endl;

}
if(p1_score>p2_score)
{
cout<<player1<<"is the Winner!!!"<<endl;
}
if(p2_score>p1_score)
{
cout<<player2<<"is the Winner!!!"<<endl;
}
if(p1_score==p2_score)
{
cout<<"Match is Draw"<<endl;
}
}
int randomfunc(int &score)
{
int random;
random=rand()%MAX_NUM;
cout<<"your number is "<<random<<endl;
score=random+score;
switch(score)
{
case 98 :score=28;
     cout<<"Oops! You Ran into a Snake!"<<endl;

    break;
case 95 :score=24;
cout<<"Oops! You Ran into a Snake!"<<endl;

break;
case 92 :score=51;
cout<<"Oops! You Ran into a Snake!!"<<endl;

break;
case 83 :score=19;
cout<<"Oops! You Ran into a Snake!!"<<endl;

break;
case 73 :score=1;
cout<<"Oops! You Ran into a Snake!"<<endl;

break;
case 69 :score=33;
cout<<"Oops! You Ran into a Snake!"<<endl;

break;
case 64 :score=36;
cout<<"Oops! You Ran into a Snake!"<<endl;

break;
case 59 :score=17;
cout<<"Oops! You Ran into a Snake!"<<endl;

break;
case 55 :score=7;
cout<<"Oops! You Ran into a Snake!"<<endl;

break;
case 52 :score=11;
cout<<"Oops! You Ran into a Snake!"<<endl;

break;
case 48 :score=9;
cout<<"Oops! You Ran into a Snake!"<<endl;

break;
case 46 :score=5;
cout<<"Oops! You Ran into a Snake!"<<endl;

break;
case 44 :score=22;
cout<<"Oops! You Ran into a Snake!"<<endl;

break;
case 1 :score=75;
cout<<"Oops! You Ran into a Snake!"<<endl;

break;
case 8 :score=26;
cout<<"Lucky! You Got Ladder"<<endl;

break;
case 17 :score=54;
cout<<"Lucky! You Got Ladder"<<endl;

break;
case 21 :score=82;
cout<<"Lucky! You Got Ladder"<<endl;

break;
case 43 :score=77;
 cout<<"Lucky! You Got Ladder"<<endl;

break;
case 50 :score=91;
cout<<"Lucky! You Got Ladder"<<endl;

break;
case 54 :score=93;
cout<<"Lucky! You Got Ladder"<<endl;

break;
case 62 :score=96;
cout<<"Lucky! You Got Ladder"<<endl;

break;
case 66 :score=87;
cout<<"Lucky! You Got Ladder"<<endl;

break;
case 80 :score=100;
cout<<"Lucky! You Got Ladder"<<endl;

}
return score;
}

