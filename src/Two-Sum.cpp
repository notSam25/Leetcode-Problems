#include <cstdlib>
#include <ctime>
#include <iostream>
#include <stdio.h>
#include <vector>

std::vector<int> TwoSum(const std::vector<int> &nums, int target) {
  
  const int middle = (nums.size() - 1) / 2;
  int index = middle;
  while (index <= nums.size()) {

    if (index == nums.size())
      index = 0;
      
    int temp = index + 1;
    while (temp != nums.size() && temp <= nums.size()) {
      if (nums[index] + nums[temp] == target) {
        return {index, temp};
      }
      temp++;
    }
    index++;
  }
  return { 0, 0 };
}

int main() {

  const std::vector<int> Input = {3, 2, 4};
  srand(time(0));
  const int TargetNumber = 6;

  printf("Two Sum problem details(target, arr size) -> [ %i, %i]\n",
         TargetNumber, (int)Input.size());

  auto Solution = TwoSum(Input, TargetNumber);
  printf("Result -> [ %i, %i ]\n", Solution[0], Solution[1]);
  return 0;
}