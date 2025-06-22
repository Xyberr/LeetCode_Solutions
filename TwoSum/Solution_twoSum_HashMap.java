package org.example;

class Solution_twoSum_HashMap {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i); // Заполнение мапы
        }

        for(int j = 0; j < nums.length; j++){
            int complement = target - nums[j];
            if(map.containsKey(complement) && map.get(complement) != j) {
                return new int[] {j, map.get(complement)};
            }
        }
        return new int[] {};
	}
}