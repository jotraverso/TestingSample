package com.saiyandev.tiolavara;

import junit.framework.TestCase;

import com.saiyandev.TioLaVara;

public class TioLaVaraTestCase extends TestCase {
	
	private final int NIVEL_IMPETU = 4;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Override
	protected void runTest() throws Throwable {
		// TODO Auto-generated method stub
		super.runTest();
	}

	public void testCascala() {
		String result = new TioLaVara().cascala();
		assertTrue("El método cascala no te manda a cascarla", result!=null && result.toLowerCase().contains("cascas"));
	}

	public void testImpetuInvocar() {
		String result = new TioLaVara().invocar();
		assertTrue("El metodo de invocación no pone suficiente ímpetu", result!=null && result.toLowerCase().replaceAll("[^!]", "").length()>=NIVEL_IMPETU);
	}

}
