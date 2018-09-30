package org.wecancodeit.bookReview;

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;

public class ReviewControllerMockMvcTest {

	@Mock
	private Review firstCourse;
	
	@Mock
	private Review secondCourse;
	
	@MockBean
	private ReviewRepository repository;
	
	@Test
	public void shouldBeOkForAllReviews() {
		
	}
	
	
}
