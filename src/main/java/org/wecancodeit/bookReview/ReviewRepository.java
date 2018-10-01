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
				"/images/womanInTheWindow.jpg");
		Review twoBook = new Review(2L, "The Lost City of the Monkey God: A True Story", "Douglas Preston",
				"non-fiction",
				"The engrossing story of the quest for a fabled lost city deep in the jungle of Honduras. I didn't read any blurbs or summaries before reading the book, and I enjoyed having each discovery and different aspect of the story unfold.",
				"/images/lostCityOfTheMonkeyGod.jpg");
		Review threeBook = new Review(3L, "Let's Pretend This Never Happened: A Mostly True Memoir", "Jenny Lawson",
				"memoir", "A hilarious and poignant memoir about family, mental illness, and taxidermy.",
				"/images/letsPretendThisNeverHappened.jpg");

		Review fourBook = new Review(4L,
				"Texts From Jane Eyre: And Other Conversations with Your Favorite Literary Characters",
				"Mallory Ortberg", "humor",
				"Hilarious book for the very literate! If you've read a lot of classic lit then this may be the book for you! What if Edgar Allan Poe, Emily Dickinson, or Rene Descartes had been able to text friends? What if the characters from Hamlet, Wuthering Heights, Little Women, The Lorax, or \"The Yellow Wallpaper\" had SMS?",
				"/images/textsFromJaneEyre.jpg");
		Review fiveBook = new Review(5L, "Kaufman Field Guide to Nature of the Midwest",
				"Kenn Kaufman, Kimberly Kaufman, Jeff Sayre", "reference",
				"I would give this book six stars if I could! I've had this for a couple of years and it has become the one book to bring anytime I go out in a natural setting. In one easy to carry and easy to use volume it covers the nature of the Midwest (defined for the purpose of the book as Minnesota, Wisconsin, Iowa, Illinois, Michigan, Indiana, Ohio). It has sections on birds, mammals, trees, wildflowers, insects, reptiles, amphibians, fish, spiders, mushrooms, ferns, grasses, rocks, and constellations! Obviously this one book does not have the depth that a book on each of those subjects would have, but that's kind of the point. I have a broad interest in nature so when I set out for the woods there's no telling what will catch my eye. To be truly prepared I would need 10+ books in my bag, or else shrug my shoulders at whatever unexpected thing I found. Kaufman Field Guide to the Nature of the Midwest is a fantastic all-around field guide!",
				"/images/fieldGuide.jpg");
		Review sixBook = new Review(6L, "Artemis", "Andy Weir", "science fiction",
				"	A fun-ish romp, but I didn't buy the protagonist as a woman. Take away the male characters' lust for her, the sex jokes and there would be nothing to make her female. She felt like a teenage boy. Also, there were very few female characters in the book, and none of them were Jazz's friends.",
				"/images/artemis.jpg");
		Review sevenBook = new Review(7L, "The Orphan Keeper", "Camron Wright", "realish fiction",
				"Nice story and all, but the writing is terrible. An editor really needed to fix this. \r\n"
						+ "AS A SINGLE EXAMPLE from page 199, filled with things put in to be a fancy writer:\r\n"
						+ "Fred was reading on the couch when Linda burst in. \"I have news,\" she announced, but in lieu of eager eyes, she was packing worry.\r\n"
						+ "Fred lowered his newspaper.\r\n" + "\"I quit my job,\" she said.\r\n"
						+ "Her words drained shamefully onto the carpet. She looked as if she were admitting guilt to capital murder.\r\n"
						+ "Fred arched forward, cupped his ears. She loved her job. He must have misunderstood.\r\n"
						+ "\"Say what?\"\r\n"
						+ "If he sounded gruff, he didn't mean it. His tone, like his face, often wore its angry coat. It was more comfortable.",
				"/images/orphanKeeper.jpg");
		Review eightBook = new Review(8L, "Eloquence", "Mark Forsyth", "non-fiction",
				"From the chapter on Hyperbation (putting words in an odd order):\r\n"
						+ "\". . .adjectives in English absolutely have to be in this order: opinion-size-age-shape-colour-origin-material-purpose-Noun. So you can have a lovely little old rectangular green French silver whittling knife. But if you mess with that word order in the slightest you'll sound like a maniac. [. . . ] There are other rules that everybody obeys without noticing. Have you ever heard that patter-pitter of tiny feet? Or the dong-ding of a bell? Or hop-hip music? That's because, when you repeat a word with a different vowel, the order is always I A O. Bish bash bosh. So politicians may flip-flop, but they can never flop-flip.\"\r\n"
						+ "Mark Forsyth blows my mind for the thousandth time. ",
				"/images/eloquence.jpg");
		Review nineBook = new Review(9L, "The Psychopath Test: A Journey Through the Madness Industry", "Jon Ronson",
				"non-fiction",
				"Fascinating and humorous, eye-opening, and full of irony, this book follows Jon Ronson's exploration of madness. What is a psychopath? How can they be treated, if at all? Does the media pander to people who are just mad enough to be interesting, reassure us we aren't crazy, and don't make us pity them? I'm going to have to read his other books, too.",
				"/images/psychopathTest.jpg");
		reviewList.put(onebook.getId(), onebook);
		reviewList.put(twoBook.getId(), twoBook);
		reviewList.put(threeBook.getId(), threeBook);
		reviewList.put(fourBook.getId(), fourBook);
		reviewList.put(fiveBook.getId(), fiveBook);
		reviewList.put(sixBook.getId(), sixBook);
		reviewList.put(sevenBook.getId(), sevenBook);
		reviewList.put(eightBook.getId(), eightBook);
		reviewList.put(nineBook.getId(), nineBook);
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
