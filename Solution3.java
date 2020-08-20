// Gambler Problem 
public class Solution3 {
    public int solution(int N, int K) {
    	int numberOfRounds=0;
    	
    	while(N!=0) {
    	if(isEven(N)) {
    		if (K>0) {
    		K--;
    		N=N/2;
    		}
    		else {
    			N=N-1;
    		}
    	}
    	else {
    		N=N-1;
    	}
    	numberOfRounds++;
    	}
    	
    	return numberOfRounds-1;
    }
    public boolean isEven(int num) {
    	return num%2==0; 
    }
}
