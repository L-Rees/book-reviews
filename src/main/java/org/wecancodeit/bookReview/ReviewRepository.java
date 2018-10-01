package org.wecancodeit.bookReview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {
	
	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review onebook = new Review(1L, "", "", "", "", "");
		Review twoBook = new Review(2L, "", "", "", "", "");
		Review threeBook = new Review(3L, "", "", "", "", "");
		reviewList.put(onebook.getId(), onebook);
		reviewList.put(twoBook.getId(), twoBook);
		reviewList.put(threeBook.getId(), threeBook);
	}
	
	public ReviewRepository(Review...reviews) {
		for (Review review : reviews) {
			reviewList.put(review.getId(), review);
		}
	}

	public Review findOne(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

}
