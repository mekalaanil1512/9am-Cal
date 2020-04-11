package com.ravi.cal.Calculator;

import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;


public class CalculatorTest {

	@Test
	public void twoandThreeisFive () throws Exception  {
		
		 final long result = new Calculator().addFunc(2,3);
		 assertThat(result,is(5L));
	}
		 
    @Test
	public void twoandThreeisSix () throws Exception  {
				
		 final long result = new Calculator().ProdFunc(2,3);
		 assertThat(result,is(6L)); 		 
		  
	}
}
