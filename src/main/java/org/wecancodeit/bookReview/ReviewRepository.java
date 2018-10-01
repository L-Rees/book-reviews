package org.wecancodeit.bookReview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository() {
		Review onebook = new Review(1L, "The Woman in the Window", "AJ Finn", "mystery-thriller",
				"	It's good that the narrator/main character is so into Hitchcock movies and noirs that it becomes a plot point, because the story is like Vertigo and Rear Window and Gaslight in particular. It's a not terribly deep but pretty entertaining thriller.\r\n"
						+ "One negative comment: the main character is a woman, but has a habit of describing other women's breasts. I've already returned my copy to the library, but one of the descriptions was something like \"her breasts were perkily embraced by her bra.\" I had to look up whether \"A.J. Finn\" was a man or a woman. To my utter lack of surprise, it's a man!",
				"https://www.goodreads.com/book/photo/34848682-the-woman-in-the-window");
		Review twoBook = new Review(2L, "The Lost City of the Monkey God: A True Story", "Douglas Preston",
				"non-fiction",
				"The engrossing story of the quest for a fabled lost city deep in the jungle of Honduras. I didn't read any blurbs or summaries before reading the book, and I enjoyed having each discovery and different aspect of the story unfold.",
				"https://www.goodreads.com/book/photo/30145126-the-lost-city-of-the-monkey-god");
		Review threeBook = new Review(3L, "Let's Pretend This Never Happened: A Mostly True Memoir", "Jenny Lawson", "memoir",
				"A hilarious and poignant memoir about family, mental illness, and taxidermy.", "https://www.goodreads.com/book/photo/12868761-let-s-pretend-this-never-happened");
		
		Review fourBook = new Review(4L, "Texts From Jane Eyre: And Other Conversations with Your Favorite Literary Characters", "Mallory Ortberg", "humor", "	Hilarious book for the very literate! If you've read a lot of classic lit then this may be the book for you! What if Edgar Allan Poe, Emily Dickinson, or Rene Descartes had been able to text friends? What if the characters from Hamlet, Wuthering Heights, Little Women, The Lorax, or \"The Yellow Wallpaper\" had SMS?", "https://www.goodreads.com/book/photo/20695981-texts-from-jane-eyre");
		reviewList.put(onebook.getId(), onebook);
		reviewList.put(twoBook.getId(), twoBook);
		reviewList.put(threeBook.getId(), threeBook);
		reviewList.put(fourBook.getId(), fourBook);
	}

	public ReviewRepository(Review... reviews) {
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
