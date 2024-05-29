package mysort;

public class InsertionSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		
		for (int i = 1; i < sortedData.length; i++) {//배열의 index[1]부터 배열의 길이만큼 순차반복
			int loc = findLessFromLast(sortedData, sortedData[i], i-1);//메서드호출(index와 index-1)
			if (loc != i-1)//전위에 정렬된 값들보다 현재 인덱스값이 작다면 조건문에 들어간다.
				insertData(sortedData, loc+1, i);
		}

	}
	private int findLessFromLast(int[] dataList, int data, int last) {
		for (int i = last; i >= 0; i--) {
			if (dataList[i] <= data) return i; //현재index의 data와 이전index의 값들을 비교하여 
		}									   //이전값이 더 작다면 i를 반환하고 
		return -1;//이전값보다 현재값이 작다면 -1반환.
	}
	private void insertData(int[] dataList, int target, int source) {
		int temp = dataList[source];//temp에 현재요소값 저장(가장 작은값)
		for (int i = source; i > target; i--) {//index를 하나씩 내려가면서
			dataList[i] = dataList[i-1];//하나씩 덮어씌운다
		}
		dataList[target] = temp;//index[0]에 temp값(가장 작은값) 할당.
	}

	
	
	 

}