package com.parse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ��ũ������� �̾Ƴ� �����̷±������� �� ����� �����ͷ� �� �� �ְ� �Ľ��Ѵ�.
 * (�����θ� �ϴ°� �� ������� ���α׷����� �� �� ���� �� ����ϱ�� ��)
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
	public void run(final String url) throws FileNotFoundException {
		final String DEFAULT_PATH = "";
		final String _url = (url == null ? DEFAULT_PATH : url);
		
		final File file = new File(_url);
		final BufferedReader reader = new BufferedReader(new FileReader(file));
	}
	
	/**
	 * ���⿡ ���� ������ �ԾƳ���.
	 * @param list
	 * @return
	 */
	private List<Map<String, Integer>> getListInSpending (String[] list) {
		final List<Map<String, Integer>> resList = new ArrayList<>();
		
		return resList;
	}
	
	private List<Map<String, Integer>> getListInTransfer (String[] list) {
		
	}
	
}
