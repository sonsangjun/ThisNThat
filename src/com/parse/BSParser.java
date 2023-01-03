package com.parse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ��ũ������� �̾Ƴ� �����̷±������� �� ����� �����ͷ� �� �� �ְ� �Ľ��Ѵ�.
 * (�����θ� �ϴ°� �� ������� ���α׷����� �� �� ���� �� ����ϱ�� ��)
 * 
 * ���� ���� �⵵/��
 * ���� -> [���� -> ����/����] ����
 * ��ü -> 
 * 
 * �⵵ ����� : https://hianna.tistory.com/607
 * @author san90
 *
 */
public class BSParser {
	private BSParser() { }
	private static class BSParserSingleTon {
		final static BSParser bSParser = new BSParser();
	}
	
	public static BSParser getInstance() {
		return BSParserSingleTon.bSParser;
	}
	
	final static int COND_YEAR  = 2022; // ���س� ���� ������, ���� �⵵�� �����´�.  
	final static int COND_MONTH = 0;    // ���ؿ� ���� ������, ���� ���� �����´�. 
	final static int MIN_AMT = -100;    // �Ѱ� �ݾ� (-100���� �۾ƾ� ��)
	
	/**
	 * �Ľ��� �����Ѵ�.
	 * @param url [����] ���ϰ��
	 * @throws FileNotFoundException 
	 */
	public void run(final String url) {
		final String DEFAULT_PATH = "";
		final String _url = (url == null ? DEFAULT_PATH : url);
		
		final File file = new File(_url);
		final List<String> allList = new ArrayList<>();
		
		try(final BufferedReader reader = new BufferedReader(new FileReader(file))) {
			// ����� ���� �д´�.
			// allList // TODO reader���� ���� ����� ����.
			
			reader.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("���� �߻� [FileNotFoundException]" + e.getMessage());
		} catch (IOException e) {
			System.out.println("���� �߻� [IOException]" + e.getMessage());
		};
		
		final List<Map<String, Integer>> spendList    = this.getListInSpending(allList);
		final List<Map<String, Integer>> transferList = this.getListInTransfer(allList);
		
		// ������ List ���� �� ���Ϸ� ���ó��
	}
	
	/**
	 * ���⿡ ���� ������ �ԾƳ���.
	 * @param list
	 * @return
	 */
	private List<Map<String, Integer>> getListInSpending (List<String> list) {
		final List<Map<String, Integer>> resList = new ArrayList<>();
		
		return resList;
	}
	
	/**
	 * ��ü�� ���� ������ �ԾƳ���.
	 * @param list
	 * @return
	 */
	private List<Map<String, Integer>> getListInTransfer (List<String> list) {
		final List<Map<String, Integer>> resList = new ArrayList<>();
		
		return resList;		
	}
}
