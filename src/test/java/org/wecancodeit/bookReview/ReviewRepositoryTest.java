package org.wecancodeit.bookReview;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {

	private Review firstReview = new Review(1L, "book title", "book author", "cover image", "book category", "content");
	private Review secondReview = new Review(2L, "book title", "book author", "cover image", "book category", "content");

	@Test
	public void shouldFindAReview() {
		ReviewRepository underTest = new ReviewRepository(firstReview);
		Review result = underTest.findOne(1L);
		assertThat(result, is(firstReview));
	}
	@Test
	public void shouldFindAllReviews() {
		ReviewRepository underTest = new ReviewRepository(firstReview, secondReview);
		Collection <Review> results = underTest.findAll();
		assertThat(results, containsInAnyOrder(firstReview, secondReview));
	}
	
	
	
	
}
