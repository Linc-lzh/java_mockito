package com.tuling.learnmockito.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MockitoDemoTest {

    //@Mock
    @Spy
    MockitoDemo mockitoDemo;

//    @BeforeEach
//    void setUp(){
//        MockitoAnnotations.openMocks(this);
//    }

    @Test
    void add() {
        //创建mock对象
        MockitoDemo mockitoDemo = Mockito.mock(MockitoDemo.class);
        assertEquals(0,mockitoDemo.add(1,2));
        mockitoDemo.add(1,2);
        mockitoDemo.add(1,2);
        Mockito.verify(mockitoDemo,Mockito.times(3)).add(1,2);

        Mockito.when(mockitoDemo.add(1,2)).thenReturn(10,20);
        assertEquals(10,mockitoDemo.add(1,2));
        assertEquals(20,mockitoDemo.add(1,2));
        assertEquals(20,mockitoDemo.add(1,2));
        assertEquals(20,mockitoDemo.add(1,2));


    }
}