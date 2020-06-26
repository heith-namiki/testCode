package codeTest01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://programmers.co.kr/skill_checks
 * Date : 2020/06/26
 * Test : failed (level-1)
 * 
 * @author user
 *
 */
public class Test01 {

	/**
	 * for compile
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// parameter : array
		int[] arr = new int[5];
		arr[0] = 50;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 200;
		arr[4] = 15;
		// parameter : divider
		int divisor = 157;

		// call solution method
		StringBuilder sb = new StringBuilder();
		for (int val : solution(arr, divisor)) {
			sb.append(val);
			sb.append(" , ");
		}
		
		// output
		System.out.println("res : " + sb.toString().substring(0, sb.toString().lastIndexOf(",")));
	}

	/**
	 * ��1�����̔z��̃G�������g���2�����Ŋ���Z���A�c�肪0�ɂȂ�ꍇ�A���̃G�������g���u�����v�ɏo�͂���B
	 * �����A��2�����Ƃ̊���Z��0�ɂȂ�G�������g��1���Ȃ��ꍇ�́A-1�����^�[������B
	 * @param arr�@�����̔z��
	 * @param divisor�@����
	 * @return�@��������
	 */
	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};

		// ��java8 : cast int[] array to List<Integer>
		List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());

		// temporary list
		List<Integer> tmpList = new ArrayList<Integer>();

		// check divide by parameter
		for (int ele : arrList) {
			if (ele % divisor == 0) {
				tmpList.add(ele);
			}
		}

		// if no exists
		if (tmpList.isEmpty()) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			// sort
			Collections.sort(tmpList);
			// ��java8 : cast List<Integer> to int[] array
			answer = tmpList.stream().mapToInt(i -> i).toArray();
		}
		
		return answer;
	}

}
