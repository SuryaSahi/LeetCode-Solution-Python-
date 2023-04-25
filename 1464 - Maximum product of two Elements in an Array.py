        temp = []
        min = 0
        min2 = 0
        index = 0
        if len(nums) > 2:
            for i in range(0,len(nums)-1):
                if nums[i] > min:
                    min = nums[i]
                    index = i
            nums.pop(index)        
            for j in nums:
                if j > min2  and j <= min:
                    min2 = j
            return (min - 1)*(min2 - 1)        
        else:
            nums = sorted(nums)
            return (nums[0] - 1)*(nums[1] - 1)
