package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class RectangleTest {
    @Test
    void shouldReturnAreaWhenLengthAndBreadthAreGiven(){
        Rectangle rectangle = new Rectangle(5,5);

        int area = rectangle.area();

        assertThat(area, is(equalTo(25)));
    }
}
