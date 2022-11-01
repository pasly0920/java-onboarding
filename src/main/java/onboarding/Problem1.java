package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        int pobiScore = getPersonalHighestValue(pobi);
        int crongScore = getPersonalHighestValue(crong);

        return answer;
    }

    private static int getPlusValue(Integer pageNum){
        int result = 0;
        String pageNumString = pageNum.toString();

        for(int i=0; i<pageNumString.length(); i++){
            result += Integer.parseInt(pageNumString.substring(i, i+1));
        }
        return result;
    }

    private static int getMultiplyValue(Integer pageNum){
        int result = 1;
        String pageNumString = pageNum.toString();

        for(int i=0; i<pageNumString.length(); i++){
            result *= Integer.parseInt(pageNumString.substring(i, i+1));
        }
        return result;
    }

    private static int getPersonalHighestValue(List<Integer> person){
        int leftPageHighestValue = Math.max(getPlusValue(person.get(0)), getMultiplyValue(person.get(0)));
        int rightPageHighestValue = Math.max(getPlusValue(person.get(1)), getMultiplyValue(person.get(1)));

        return Math.max(leftPageHighestValue, rightPageHighestValue);
    }
}