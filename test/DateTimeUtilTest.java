import static org.junit.Assert.*;

import java.text.DateFormat;
import java.util.Date;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;
import static com.me.ye.yelib_v1.util.DateTimeUtil.*;

public class DateTimeUtilTest {

	@Test
	public void test() {
		fail("まだ実装されていません");
	}
	
	@Test
	public void toDate_正常系_日付フォーマット1() throws Exception {
		// MEMO actual=実際, expected=期待
		String value = "2014/1/1";
		Date actual = toDate(value);
		Date expected = DateFormat.getDateInstance().parse(value);
		assertEquals(actual, expected);
	}

}
