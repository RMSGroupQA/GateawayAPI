package com.qa.gateway;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.qa.gateway.entities.EmployeeEntityTest;
import com.qa.gateway.entities.RoomEntityTest;


@RunWith(Suite.class)

@Suite.SuiteClasses({
   com.qa.gateway.entities.BookingEntityTest.class,RoomEntityTest.class,EmployeeEntityTest.class   
})

public class Runner {

}
