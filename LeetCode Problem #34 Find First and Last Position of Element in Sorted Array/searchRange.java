public class searchRange{
	/* input = [1,2,3,4,5,8,8,8,8,8,9,13]
				0 1 2 3 4 5 6 7 8 9 10 11
		output = [5,9]
	*/

		public int[] searchRange(int[] nums, int target){
			int [] result = new int[2];
			result[0] = findStartingIndex(nums,target);
			result[1] = findEndingIndex(nums,target);
			return result;
		}

		public int findStartingIndex(int[] nums, int target){
			int index = -1;
			int start = 0;
			int end = nums.length -1;
			while(start<=end){
				int midpoint = start+(end-start)/2;
				if(nums[midpoint]>=target){
					end = midpoint-1;
				}
				else{
					start = midpoint+1;
				}
				if(nums[midpoint] == target){
					index = midpoint;
				}
			}
			return index;
		}


		public int findEndingIndex(int[] nums, int target){
				int index = -1;
				int start = 0;
				int end = nums.length-1;
				while(start<=end){
					int midpoint = start+(end-start)/2;
					if(nums[midpoint]<=target){
						start=midpoint+1;
					}
					else{
						end = midpoint-1;
					}
					if(nums[midpoint]==target){
						index = midpoint;
					}
				}
				return index;

		}
}