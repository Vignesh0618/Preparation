class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=arr[0];
        int slargest=-1;
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
        
        if(arr[i]<largest && arr[i]>slargest){
            slargest=arr[i];
        }
        }
        return slargest;
    }
}