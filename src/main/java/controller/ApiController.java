package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@RequestMapping(value="PST")
	public String Api() {
		return "Mssv:20047921, PhamSyThai";
	}
}
