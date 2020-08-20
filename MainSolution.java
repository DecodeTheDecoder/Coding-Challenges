import java.util.HashMap;
import java.util.Map;

public class MainSolution {
	 public int solution(int A, int B) {
		int lovelyCount=0;
		for(int i = A;i<=B;i++ ) {
			if (isLovely(i)) lovelyCount++;
			
		}  
		return lovelyCount;
	        // write your code in Java SE 8

	 }

	// is lovely when same digits occur leaa than 3 times
	public boolean isLovely(int num) {
	Map<Integer,Integer> digitCount= new HashMap<>();
	boolean lovelyResult=true;
	while (num!=0) {
		int rem= num%10;

		Integer currentDigit = new Integer(rem);
		if (digitCount.get(currentDigit)==null) {
			digitCount.put(currentDigit,1);
		}
		else {
			int currentCount= digitCount.get(currentDigit);
			if(currentCount>=2) {
				lovelyResult=false;
				break;
			}
			else {
				digitCount.put(new Integer(rem),++currentCount);
			}
		}
		num=num/10;
	}
		return lovelyResult;
	} 
}
