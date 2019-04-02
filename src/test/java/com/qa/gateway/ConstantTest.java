package com.qa.gateway;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConstantTest {
	
	Constants constant = new Constants();
	
	@Test
	public void ConstantOneTest() {
		assertEquals("http://localhost:8083/createEmployee",Constants.CREATEEMPLOYEE);
	}
	
	@Test
	public void ConstantTwoTest() {
		assertEquals("http://localhost:8082/readEmployee/",Constants.READEMPLOYEE);
	}
	
	@Test
	public void ConstantThreeTest() {
		assertEquals("http://localhost:8082/updateEmployeeRole/",Constants.UPDATEEMPLOYEEROLE);
	}
	
	@Test
	public void ConstantFourTest() {
		assertEquals("http://localhost:8082/updateEmployeePassword/",Constants.UPDATEEMPLOYEEPASS);
	}
	
	@Test
	public void ConstantFiveTest() {
		assertEquals("http://localhost:8082/deleteEmployee/",Constants.DELETEEMPLOYEE);
	}
	
	@Test
	public void ConstantSixTest() {
		assertEquals("http://localhost:8082/createRoom",Constants.CREATEROOM);
	}
	
	@Test
	public void ConstantSevenTest() {
		assertEquals("http://localhost:8082/readRoom/",Constants.READROOM);
	}
	
	@Test
	public void ConstantEightTest() {
		assertEquals("http://localhost:8082/updateRoom/",Constants.UPDATEROOM);
	}
	
	@Test
	public void ConstantNineTest() {
		assertEquals("http://localhost:8082/deleteRoom/",Constants.DELETEROOM);
	}
	
	@Test
	public void ConstantTenTest() {
		assertEquals("http://localhost:8082/getAllRooms",Constants.GETALLROOM);
	}
	
	@Test
	public void ConstantElevenTest() {
		assertEquals("http://localhost:8082/createBooking",Constants.CREATEBOOKING);
	}
	
	@Test
	public void ConstantTwelveTest() {
		assertEquals("http://localhost:8082/readBooking/",Constants.READBOOKING);
	}
	
	@Test
	public void ConstantThirteenTest() {
		assertEquals("http://localhost:8082/updateBooking/",Constants.UPDATEBOOKING);
	}
	
	@Test
	public void ConstantFourteenTest() {
		assertEquals("http://localhost:8082/deleteBooking/",Constants.DELETEBOOKING);
	}

}
