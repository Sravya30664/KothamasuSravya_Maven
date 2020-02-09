package task1.mavendemo;

public class ChociSweets extends TotalCandies implements CandyInterface {
	public int chocisweetsweight(int choclates[],int sweets[],int choci,int sweetno,int total) {
		for(int i=0;i<choci;i++) {
			total=total+choclates[i];
		}
		for(int i=0;i<sweetno;i++) {
			total=total+sweets[i];
		}
		return total;
	}


}
