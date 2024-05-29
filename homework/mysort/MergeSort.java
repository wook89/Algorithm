package mysort;

public class MergeSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		mergeSort(sortedData, 0, sortedData.length-1);//배열,인덱스의시작,인덱스의끝요소를 인자로 mergeSort호출
	}
	
	void mergeSort(int[] dataList, int start, int end) {
		if (start >= end) return;//시작값인덱스값이 끝인덱스값보다 크거나 같아질경우 반환.
		
		int mid = (start + end) / 2;//strat와end의 변수를 연산하여 mid값을 초기화.
		mergeSort(dataList, start, mid);//start값과mid값을 인자로 재귀호출. 
		mergeSort(dataList, mid+1, end);//mid+1과 end값을 인자로 재귀호출.
		merge(dataList, start, mid, end);//위mergeSort메서드의 호출이 끝나는 단계에서 merge호출.
	}
	
	void merge(int[] dataList, int start, int mid, int end) {
		int[] tempList = new int[end-start + 1];//정렬된 인자값을 담을 tempList생성.
		int i = start, j = mid + 1, k = 0;
		while (i <= mid && j <= end) {//mid값,mid+1값을 기준으로 왼쪽과 오른쪽구간을 탐색 할 수 있는지에 대한 조건문.
			if (dataList[i] <= dataList[j])//mid이전의요소와 mid이후의 요소를 비교해서 이전값이 더 작다면,
				tempList[k++] = dataList[i++];//tempList에 dataList의 왼쪽값 할당 후 / 후위연산으로 두 배열모두 인덱스증가
			else
				tempList[k++] = dataList[j++];
		}
		
		while (i <= mid) tempList[k++] = dataList[i++];//첫번째 while문의 조건을 만족하지못한경우 
		while (j <= end) tempList[k++] = dataList[j++];//두가지 예외처리로 남아있는 요소들 tempList에 할당.
		
		//for (i = start, k = 0; k < tempList.length; i++, k++)
		//	dataList[i] = tempList[k];
		
		System.arraycopy(tempList, 0, dataList, start, end-start+1);//dataList[]에 tempList[]의 요소들을 순차적으로 할당
	}

}