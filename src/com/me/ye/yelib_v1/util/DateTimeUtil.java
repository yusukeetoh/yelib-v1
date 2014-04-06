package com.me.ye.yelib_v1.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * 日付や時刻に関するユーティリティクラス
 */
public class DateTimeUtil {
	private static final long OneDayTime = 1000 * 60 * 60 * 24; 
	
	/**
	 * 指定した二つの日付文字列から日数を計算します。日数はtoからfromを引いた結果を返します。
	 * @param from 日付文字列(から)
	 * @param to 日付文字列(まで)
	 * @return 日数を返します。
	 * @throws Exception 
	 */
	public static int calclateDays(String from, String to) throws Exception {
		return calclateDays(toDate(from), toDate(to));
	}
	
	/**
	 * 指定した二つのDateオブジェクトから日数を計算します。日数はtoからfromを引いた結果を返します。
	 * @param from
	 * @param to
	 * @return
	 * @throws ParseException
	 */
	public static int calclateDays(Date from, Date to) throws ParseException {
		long fromTime = from.getTime();
		long toTime = to.getTime();
		long days = (toTime - fromTime) / OneDayTime;
		return (int)days;
	}
	
	/**
	 * 日付文字列をDateオブジェクトに変換します。
	 * @param dateStr 日付文字列
	 * @return Dateオブジェクト
	 * @throws ParseException 指定した文字列を変換できなかった場合はParseExceptionをスローします。
	 */
	public static Date toDate(String dateStr) throws ParseException {
		return DateFormat.getDateInstance().parse(dateStr);
	}
}
