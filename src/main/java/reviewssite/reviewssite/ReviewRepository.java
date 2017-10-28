package reviewssite.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<Long, Review>();

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Review findOne(long id) {
		return reviews.get(id);
	}

	public ReviewRepository() {
		Review dirtyFranks = new Review(1, "The Glenn Beck ($3.00)", "images/hotdog.jpg", "American",
				"This place was hoppin at the lunch hour! A few people looked like they were on lunch break from work, but most people seemed like they were trying it for the first time. I saw families, young adults, older folks. It definitely attracts all kinds of people!",
				"Dirty Frank\'s", 4);
		reviews.put(1L, dirtyFranks);
		Review fortune = new Review(2, "Pad Thai Lunch Special ($6.95)", "images/padthai.jpg", "Asian",
				"This place has the best lunch special in town.  Pay only $6.95 for an entree, eggroll, bowl of soup, and a drink for lunch.  This deal is one of the few that is valid 7 days a week!  Of course, the more authentic (and tastier) dishes are on the dinner menu for a few more dollars, but this is a definite go-to!  The Pad Thai comes with chicken, shrimp, or beef.  The chef makes his own chili sauce--definitely worth a try if you are a fan of spicy food.",
				"Fortune", 5);
		reviews.put(2L, fortune);
		Review spaghettiWarehouse = new Review(3, "15 Layer Lasagna ($8.69)", "images/lasagna.jpg", "American",
				"Spaghetti Warehouse is the best value Italian in Columbus.  The 15 Layer Lasagna gets you a great bang for your buck.  I've never finished an entire portion of this lasagna.  It is cheesy and saucy.  It is a great lasagna for the price and you don't have to clean the lasagna pan.",
				"Spaghetti Warehouse", 5);
		reviews.put(3L, spaghettiWarehouse);
		Review beechwoldBurger = new Review(4, "Beechwold Burger ($6.75) ", "images/hamburger.jpg", "American",
				"The service was fast and friendly.  A few moments after I sat down, I was sipping on an ice tea.  You know how sometimes you get served ice tea that has been sitting around too long?  Welp, not here.  The ice tea was great.",
				"Beechwold Diner", 5);
		reviews.put(4L, beechwoldBurger);
		Review carvery = new Review(5, "Bacon & Chicken Panini ($7.49)", "images/sandwich.jpg", "American",
				"You gotta go in for the full experience.  You walk in and the smell of everything delicious just hits you in the face and makes your mouth water.  I enjoyed every bite of the sandwich, and my side was the Pork Fat Roasted Potatoes (Yukon gold potatoes  and roasted directly under the Porchetta). The potatoes had a spicy kick in my mouth.",
				"Carvery", 4);
		reviews.put(5L, carvery);
		Review dkDiner = new Review(6, "Grilled Cheese BS ($6.00)", "images/bsandwich.jpg", "American",
				"This is my go-to place in Columbus. The food is great and I love the self-serve pop. My favorite item on the menu is the Grilled Cheese BS.  It is a hard fried egg on texas toast with bacon and cheese.  It is buttery, toasted, and melted.  My favorite breakfast or breakfast for dinner in Columbus and for a great price - only $6.00.",
				"DK Diner", 5);
		reviews.put(6L, dkDiner);

	}
}
