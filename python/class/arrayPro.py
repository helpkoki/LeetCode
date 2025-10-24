class LittleArray:
    @staticmethod
    def create_little_array(nums, value):
        mex = 0
        for i in range(len(nums)):
            # mimic the while loop logic
            while nums[i] > mex and nums[i] > value:
                if nums[i] > value:
                    nums[i] = -value
                    print(f"less: {nums[i]}")
                else:
                    nums[i] = +value
                    print(f"more: {nums[i]}")
                mex += 1
        return mex


# Example usage
arr = [5, 2, 7]
result = LittleArray.create_little_array(arr, 3)
print("Result:", result)
print("Modified array:", arr)
