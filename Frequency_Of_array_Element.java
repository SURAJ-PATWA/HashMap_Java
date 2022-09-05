import java.util.HashMap;
import java.util.Map;

public class Frequency_Of_array_Element {
    public static void countFreq(int arr[],int n){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }






    public static void main(String[] args) {
        int arr[]={50,50,10,40,10};
        int n = arr.length;

        countFreq(arr, n);

    }
}
