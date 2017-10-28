package reviewssite.reviewssite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsController {

	@Resource
	private ReviewRepository reviews;

	@RequestMapping("/review")
	public String findOne(@RequestParam("id") long id, Model model) {
		model.addAttribute("modelReview", reviews.findOne(id));
		return "review-template";
	}

	@RequestMapping("/allreviews")
	public String showAll(Model model) {
		model.addAttribute("modelReviews", reviews.findAll());
		return "reviews-template";
	}

}
