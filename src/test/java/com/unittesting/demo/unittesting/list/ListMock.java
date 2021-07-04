package com.unittesting.demo.unittesting.list;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ListMock {

    @Mock
    private List list;

    @Test
    public void shouldReturnFiveWhenSizeIsCalled() {
        when(list.size()).thenReturn(5);
        assertEquals(5, list.size());
    }

    @Test
    public void shouldReturnStringWhenGetIsCalled() {
        when(list.get(0)).thenReturn("Sample String");
        assertEquals("Sample String", list.get(0));
    }
}
