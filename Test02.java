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
	 * �e�X�g�p���C�����\�b�h
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �����ݒ�
		int[] arr = new int[7];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 3;
		arr[3] = 3;
		arr[4] = 0;
		arr[5] = 1;
		arr[6] = 1;

		// �z����H���\�b�h�Ăяo��
		StringBuilder sb = new StringBuilder();
		for (int val : solution(arr)) {
			sb.append(val);
			sb.append(" , ");
		}

		// ���ʊm�F
		System.out.println("res : " + sb.toString().substring(0, sb.toString().lastIndexOf(",")));
	}

	/**
	 * �����Ƃ��ēn�����z��ɓ����l���A������ꍇ�A�d���������B 
	 * �����A��������̔z��͖{���̏��Ԃɂ���B
	 * 
	 * @param arr ���l�z��
	 * @return ���H��̔z��
	 */
	public static int[] solution(int[] arr) {

		// �߂�l
		int[] answer = {};

		// ���H�p���X�g
		List<Integer> tmpList = new LinkedList<Integer>();

		// �d�����������l�����X�g�ɓ���
		for (int ele = 1; ele < arr.length; ele++) {
			if (arr[ele - 1] != arr[ele]) {
				tmpList.add(arr[ele]);
			}
		}

		// �擪�l�ݒ�
		tmpList.add(0, arr[0]);

		// �L���X�g
		answer = tmpList.stream().mapToInt(i -> i).toArray();

		return answer;
	}

}
