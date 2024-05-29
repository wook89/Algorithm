package mysort;

public class BubbleSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		setData(dataList);
		for (int last = sortedData.length - 1; last >= 1; last--) {//배열의 길이-1 회만큼 반복하겠음.
			for (int i = 0; i <= last - 1; i++) {//배열의 길이만큼 순차탐색
				if (sortedData[i] > sortedData[i+1])//현재요소보다 바로다음의 요소의 값이 작다면.
					swap(sortedData, i, i+1);//두 요소값 스왑
			}
		}
	}

}