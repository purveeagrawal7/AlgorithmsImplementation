
public class KadaneAlgorithm {
	public static void main(String[] args) {
		int[] array= {2,-1,2,3,4,-5};
		System.out.println("Maximum contiguous sum is " + 
                maxSubArraySum(array)); 
		System.out.println("Maximum sum is " + 
				maxSum(array)); 
		
	}
	
	static int maxSubArraySum(int[] a) {
		int max_so_far=0;
		int max_here=0;
		for(int i=0;i<a.length;i++) {
			max_here=max_here+a[i];
			if(max_here<0) {
				max_here=0;
			}
			if(max_so_far<max_here) {
				max_so_far=max_here;
			}
		}
		return max_so_far;
	}
	static int maxSum(int[] a) {
		int maxSum=0;
		int max=0;
		for(int i=0;i<a.length;i++) {
			maxSum=maxSum+a[i];
			if(max>maxSum) {
				maxSum=maxSum-a[i];
				max=maxSum;
			}
			max=maxSum;
		}
		return max;
	}
	
	
}
