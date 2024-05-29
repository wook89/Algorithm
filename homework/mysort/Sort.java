package mysort;

import java.util.Arrays;

public abstract class Sort {
	int[] orgData;
	int[] sortedData;
	
	public abstract void sort(int[] dataList);
	
	void swap(int[] dataList, int a, int b) { //배열의 요소 a와b를 swap하는 메서드
		if (a == b) return;
		int temp;
		temp = dataList[a];
		dataList[a] = dataList[b];
		dataList[b] = temp;
	}
	
	public void setData(int[] dataList) { //인스턴스로 생성된 Sort객체의 현재 데이터를 셋팅해주는 메서드
		this.orgData = dataList;
		this.sortedData = dataList.clone();//dataList의 복제 생성.
	}
	
	public String getOrgData() {//배열의 요소들을 인덱스의 순서대로 반환
		return Arrays.toString(orgData);
	}
	
	public String getSortedData() {//배열의 정렬된 요소들을 인덱스의 순서대로 반환
		return Arrays.toString(sortedData);
	}

}