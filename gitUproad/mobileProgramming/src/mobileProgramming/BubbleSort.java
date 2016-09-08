package mobileProgramming;

public class BubbleSort {
	public static void main(String[] args){
		int [] index = { 1,5,7,2,4,3,9};
		int i, j, temp;
		
		for (i = 0; i < index.length -1; i++){
			for (j = 0; j < index.length - 1 - i; j++){
				if (index[j] > index [j + 1] ){
					temp = index[j];
					index[j] = index [j + 1];
					index [j + 1] = temp;
					
				}
			}
		}
		
	}

}
