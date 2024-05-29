class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean isValid=false;
        Arrays.sort(nums);//dizinin elemanlarını küçükten büyüğe sıraladım.

        for(int i=1; i<nums.length; i++){//eğer bir önceki elemanla şu anki eleman birbirine eşitse aynı elemandan iki tane olduğu için ispatladım ve döngüyü bitirdim.
                if(nums[i]== nums[i-1]){
                    isValid=true;
                    break;
                }
        }
        return isValid;
    }
}
