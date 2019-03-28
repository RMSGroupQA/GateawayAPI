package com.qa.gateway;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.qa.gateway.entities.RoomEntityTest;
import com.qa.gateway.entities.UserEntityTest;



@RunWith(Suite.class)

@Suite.SuiteClasses({
   com.qa.gateway.entities.BookingEntityTest.class,RoomEntityTest.class,UserEntityTest.class   
})

public class Runner {

}
