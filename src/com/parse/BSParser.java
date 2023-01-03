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
 * 뱅크샐러드로 뽑아낸 엑셀이력기준으로 내 가계부 데이터로 쓸 수 있게 파싱한다.
 * (엑셀로만 하는게 좀 어려워서 프로그램으로 한 번 정제 후 사용하기로 함)
 * 
 * 범위 현재 년도/월
 * 지출 -> [금융 -> 이자/대출] 제외
 * 이체 -> 
 * 
 * 년도 만들기 : https://hianna.tistory.com/607
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
	
	final static int COND_YEAR  = 2022; // 기준년 값이 없으면, 현재 년도로 가져온다.  
	final static int COND_MONTH = 0;    // 기준월 값이 없으면, 현재 월로 가져온다. 
	final static int MIN_AMT = -100;    // 한계 금액 (-100보다 작아야 함)
	
	/**
	 * 파싱을 시작한다.
	 * @param url [선택] 파일경로
	 * @throws FileNotFoundException 
	 */
	public void run(final String url) {
		final String DEFAULT_PATH = "";
		final String _url = (url == null ? DEFAULT_PATH : url);
		
		final File file = new File(_url);
		final List<String> allList = new ArrayList<>();
		
		try(final BufferedReader reader = new BufferedReader(new FileReader(file))) {
			// 목록을 전부 읽는다.
			// allList // TODO reader값을 전부 여기로 넣음.
			
			reader.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("에러 발생 [FileNotFoundException]" + e.getMessage());
		} catch (IOException e) {
			System.out.println("에러 발생 [IOException]" + e.getMessage());
		};
		
		final List<Map<String, Integer>> spendList    = this.getListInSpending(allList);
		final List<Map<String, Integer>> transferList = this.getListInTransfer(allList);
		
		// 추출한 List 병합 및 파일로 출력처리
	}
	
	/**
	 * 지출에 대한 내용을 솎아낸다.
	 * @param list
	 * @return
	 */
	private List<Map<String, Integer>> getListInSpending (List<String> list) {
		final List<Map<String, Integer>> resList = new ArrayList<>();
		
		return resList;
	}
	
	/**
	 * 이체에 대한 내용을 솎아낸다.
	 * @param list
	 * @return
	 */
	private List<Map<String, Integer>> getListInTransfer (List<String> list) {
		final List<Map<String, Integer>> resList = new ArrayList<>();
		
		return resList;		
	}
}
