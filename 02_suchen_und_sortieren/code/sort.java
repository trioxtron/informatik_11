public class Sort{
    public int[]num = new int[5];
    int[]num = {4, 6, 3, 7, 2};

    public void bubbleSort(){
        int progress = num.length - 1;
        while(progress > 0){
            for(int i=0; i < progress; i++){
                if(num[i] > num[i+1]) {
                    int temp = num[i];
                    num[i] = num[i+1];
                    num[i+1] = temp;
                }
            }
            grenze--;
        }

    }
}