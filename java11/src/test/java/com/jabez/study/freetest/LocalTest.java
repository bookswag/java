package com.jabez.study.freetest;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class LocalTest {

	@Test
	public void testBasic() {
		Assert.assertTrue("assertTrue success", StringUtils.equals("TEST", "TEST"));
		Assert.assertFalse("assertFalse success", StringUtils.equals("TEST", "TEST1"));
	}
}
