package com.codebind;

import org.junit.Test;
import static org.junit.Assert.*;
public class Apptest {

	@Test
	public void shoudReturnTrue() {
		App ap=new App();
		assertTrue(ap.getbool());
	}

}
