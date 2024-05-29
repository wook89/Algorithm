package mysort;

public class SelectionSort extends Sort {
	
	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		for (int last = sortedData.length-1; last >= 1; last--) {//배열의길이(끝)부터 1번째 까지 하나씩 줄여가며 실행
			int maxIndex = selectMax(sortedData, last);//selectMax메서드의 반환값을 maxIndex에 할당
			if (maxIndex != last)//할당된 maxIndex 가 배열의 끝번째 요소가 아니라면 swap메서드 호출
				swap(sortedData, maxIndex, last);//swap메서드를 호출하여 가장 큰요소를 배열의 마지막 요소와 스왑.
		}
	}
	
	int selectMax(int[] dataList, int last) {
		int max = dataList[0];//배열의 첫번째[0]요소를 맥스값으로 초기화.
		int maxIndex = 0;//맥스값과 함께 증가될 maxIndex도 0으로 초기화해준다.
		
		for (int i = 1 ; i <= last; i++) {//배열의 정렬되지않은 부분의 길이만큼진행
			if (dataList[i] > max) {//조건문을 통하여 요소들을 비교하고, 
				max = dataList[i];//가장 큰 값을 가진 요소를 max에 할당하고,
				maxIndex = i;//가장 큰요소를 가지고있는 인덱스값을 초기화한다.
			}
		}
		return maxIndex;
	}

	
}