package com.evolution.util;

import org.junit.Test;

public class EncodingUtilTest {
	@Test
	public void test() {
		float[] floats = EncodingUtil.decodeEcgSignal("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");
		for (float f : floats) {
			System.out.println(f);
		}
	}
}
