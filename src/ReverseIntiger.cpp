#include <iostream>
#include <stdio.h>

/* Problem
Reverse a signed integer. If int is outside INT_MIN/INT_MAX bounds, return 0.
*/

#define INT_MIN -2147483648 
#define INT_MAX 2147483647

class Solution {
public:
  Solution() = default;
  virtual int ReverseInteger(int num = 0);
};

int Solution::ReverseInteger(int num) {

  int ret = 0;
  
  if(ret > INT_MAX || ret < INT_MIN)
    return 0;

  return ret;
}

int main(int args, char* argv[]) {

  Solution* solution = new Solution();
  std::cout << solution->ReverseInteger(args) << std::endl;
  delete solution;
  return 0;
}