from typing import List

class solution:
    def findClosestNumber(self, nums:List[int]):
        closest = nums[0]
        for nums in nums:
            if abs(nums) < abs(closest):
                closest = nums
                
        if closest < 0 and abs(closest) in nums:
            return abs(closest)
        else:
            return closest
        