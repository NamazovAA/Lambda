import java.util.Arrays;
import java.util.List;
public class asd {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 1};
        Integer[] arr = {8, 10, 24, 12, 16};
        String[] words = {"ans","Wood", "kill", "any"}; // Без этого
//        List<String> words1 = Arrays.asList(words);
        List<Integer> list = Arrays.asList(arr);
        
        Maximum maximum = a ->{
            Integer maximumS = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (maximumS < arr[i]) {
                        maximumS = arr[i];
                    }
                }
                return maximumS;
        };
        Reverse reverseSS = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;

        };
//        System.out.println("Pilot " + reverseS.reverseStr("Pilot"));

        ReturnIndex indx = (a,b) -> {
            for (int i = 0; i < array.length; i++) {
                if (b[i] == a) {
                    return i;
                }
            }
            return -1;
        };
        Average x = ava -> {
            double avg = 0;
            for (int i = 0; i < ava.length; i++) {
                avg += (double) ava [i]/ava.length;
            }
            return avg;
        };
//        Stringer humster = fer ->{
//            String sd = " ";
//            for (int i = 0; i < fer.length ; i++) {
//                if (fer[i].equals()) {
//                    sd += words[i];
//
//                }
//            }
//            return String.valueOf(fer);


//        };
//        System.out.println(humster.search(words1));

        System.out.println(returnNum(indx, 5,array));

        System.out.println(returnMax(maximum, list));

        System.out.println(reverseS (reverseSS,"Pilot"));

        System.out.println(AvarageMeth(x,arr));
    }

    public static int returnNum (ReturnIndex indx, int number, int [] arr){

        return indx.returnIndex(number,arr);
    }
    public static Integer returnMax (Maximum maximum, List<Integer> list){

        return maximum.action(list);
    }

    public static String reverseS (Reverse x, String str) {
        return x.reverseStr(str);
    }
    public static Double AvarageMeth (Average average, Integer[] a){
        return average.average(a);
    }
    public String search(Stringer searcher, String [] name){
        return searcher.search(name);
    }


}