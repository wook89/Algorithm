package mysort;

public class QuickSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		quickSort(sortedData, 0, sortedData.length-1);//quickSort메서드호출
	}
	
	void quickSort(int[] dataList, int start, int end) {
		if (start >= end) return;
		int p = partition(dataList, start, end);//파티션메서드 호출
		
		quickSort(dataList, start,  p-1);//index[0]부터~index[pivot-1]값을 인자로 한 재귀호출.(전위) 
		quickSort(dataList, p+1, end);//index[pivot+1]부터~index[end]값을 인자로 한 재귀호출.(후위)
	}
	
	
	int partition(int[] dataList, int start, int end) {
		int pivot = dataList[end];//pivot값을 배열의 끝번째 요소로 초기화
		int leftEnd = start - 1;	// leftEnd는 시작값-1로 초기화
		for (int i = start; i <= end - 1; i++) {//할당된 구간의 시작점부터 pivot요소 전까지 순차적탐색
			if (dataList[i] < pivot) {//현재인덱스의 요소값이 pivot의 요소값보다 작을경우
				swap(dataList, ++leftEnd, i);//전위연산된 leftEnd값과 i값을 swap한다.
			}
		}//for문이 끝나면 pivot보다 작은값은 전위에, 큰 값은 후위에 정렬된다.
		swap(dataList, leftEnd + 1, end);//pivot과 비교하여 작았던 요소들중 마지막인덱스+1값(leftEnd)과 pivot간의 swap
										 //(pivot값이 전위와 후위 사이에 위치하여,pivot을 중심으로 구간이 나뉘운다.
		return leftEnd + 1; //pivot의 인덱스값 반환.
	}

}