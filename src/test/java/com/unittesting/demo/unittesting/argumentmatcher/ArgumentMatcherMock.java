package com.unittesting.demo.unittesting.argumentmatcher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ArgumentMatcherMock {

    @Mock
    private List listMock;

    @Test
    public void ShouldReturnString() {
        when(listMock.get(anyInt())).thenReturn("Sample String");
        assertEquals("Sample String", listMock.get(0));
        assertEquals("Sample String", listMock.get(2));
    }

    @Test
    public void testForVerifyTheCall() {
        listMock.get(0);
        listMock.get(1);

        verify(listMock).get(0); //Has it called or not.
        verify(listMock, times(1)).get(0);
        verify(listMock, times(2)).get(anyInt());
    }
}
