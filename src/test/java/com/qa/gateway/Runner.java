package com.qa.gateway;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.qa.gateway.entities.BookingEntityTest;
import com.qa.gateway.entities.EmployeeEntityTest;
import com.qa.gateway.entities.RoomEntityTest;
import com.qa.gateway.ConstantTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   BookingEntityTest.class,
   RoomEntityTest.class,
   EmployeeEntityTest.class,
   ConstantTest.class
})

public class Runner {

}
