/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    let result = [];

    // Step 1: Sort the array
    nums.sort((a, b) => a - b);

    // Step 2: Iterate through the array
    for (let i = 0; i < nums.length - 2; i++) {
        // Skip duplicate numbers for the fixed element
        if (i > 0 && nums[i] === nums[i - 1]) continue;

        // Step 3: Use two pointers
        let left = i + 1;
        let right = nums.length - 1;

        while (left < right) {
            let sum = nums[i] + nums[left] + nums[right];

            if (sum === 0) {
                result.push([nums[i], nums[left], nums[right]]);
                // Move both pointers and skip duplicates
                while (left < right && nums[left] === nums[left + 1]) left++;
                while (left < right && nums[right] === nums[right - 1]) right--;
                left++;
                right--;
            } else if (sum < 0) {
                left++; // Increase the sum
            } else {
                right--; // Decrease the sum
            }
        }
    }

    return result;
};
