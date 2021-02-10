package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
//
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
//	@RequestMapping(path = "/sample", method = RequestMethod.GET)
//	public ModelAndView fetch(ModelAndView mav) {
//		ArrayList<HouseData> houseList = jdbcTemplate.queryForObject("SELECT * FROM houses", new HouseMapper());
//		ArrayList<InquiryData> inquiryList = jdbcTemplate.queryForObject("SELECT * FROM inquiries", new InquiryMapper());
//		ArrayList<String> buyerList = jdbcTemplate.queryForObject("SELECT * FROM buyers", new BuyerMapper());
//
//		mav.setViewName("home");
//		mav.addObject("houseList", houseList);
//		mav.addObject("inquiryList", inquiryList);
//		mav.addObject("buyerList", buyerList);
//
//		return mav;
//	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("mainPage");

		return mav;
	}

	@RequestMapping(value = "/reservation", method = RequestMethod.GET)
	public ModelAndView reserve(ModelAndView mav) {
		mav.setViewName("myPage");

		return mav;
	}
//
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public ModelAndView login(@ModelAttribute("managerAccount") ManagerAccount data, ModelAndView mav) {
//		if (data.getLoginID().equals("田中") && data.getPassword().equals("111")) {
//			mav.setViewName("redirect:/sample");
//			mav.addObject("data", data);
//		} else {
//			mav.setViewName("redirect:/");
//		}
//
//		return mav;
//	}

}
