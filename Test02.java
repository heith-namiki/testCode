package codeTest01;

import java.util.LinkedList;
import java.util.List;

/**
 * https://programmers.co.kr/skill_checks
 * Date : 2020/06/27 Test : failed
 * (level-1)
 * 
 * @author user
 *
 */
public class Test02 {

	/**
	 * テスト用メインメソッド
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 引数設定
		int[] arr = new int[7];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 3;
		arr[3] = 3;
		arr[4] = 0;
		arr[5] = 1;
		arr[6] = 1;

		// 配列加工メソッド呼び出し
		StringBuilder sb = new StringBuilder();
		for (int val : solution(arr)) {
			sb.append(val);
			sb.append(" , ");
		}

		// 結果確認
		System.out.println("res : " + sb.toString().substring(0, sb.toString().lastIndexOf(",")));
	}

	/**
	 * 引数として渡した配列に同じ値が連続する場合、重複を消す。 
	 * ただ、消した後の配列は本来の順番にする。
	 * 
	 * @param arr 数値配列
	 * @return 加工後の配列
	 */
	public static int[] solution(int[] arr) {

		// 戻り値
		int[] answer = {};

		// 加工用リスト
		List<Integer> tmpList = new LinkedList<Integer>();

		// 重複を除いた値をリストに投入
		for (int ele = 1; ele < arr.length; ele++) {
			if (arr[ele - 1] != arr[ele]) {
				tmpList.add(arr[ele]);
			}
		}

		// 先頭値設定
		tmpList.add(0, arr[0]);

		// キャスト
		answer = tmpList.stream().mapToInt(i -> i).toArray();

		return answer;
	}

}
