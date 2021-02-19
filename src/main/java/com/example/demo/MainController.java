package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.AccountRepository;


@Controller
public class MainController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

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

	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public ModelAndView menu(ModelAndView mav) {
		mav.setViewName("menuPage");

		return mav;
	}

	@RequestMapping(value = "/reservation", method = RequestMethod.GET)
	public ModelAndView reserve(ModelAndView mav) {
		mav.setViewName("myPage");
		mav.addObject("account" , new AccountRepository());
		mav.addObject("pageMode", true);

		return mav;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("login") AccountRepository data, ModelAndView mav) {
		if (data.getName().equals("田中") && data.getPassword().equals("111")) {
			data.setId(5);
			data.setIsOwner(false);
			mav.setViewName("myPage");
			mav.addObject("pageMode", false);
			mav.addObject("loginAccount", data);
			mav.addObject("alert", true);
			mav.addObject("alertMessege", "ログインしました");
		} else {
			mav.setViewName("myPage");
			mav.addObject("account" , new AccountRepository());
			mav.addObject("pageMode", true);
			mav.addObject("alert", true);
			mav.addObject("alertMessege", "ログインに失敗しました");
		}

		return mav;
	}

}
