/**
 * 
 */
package com.housingly.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author deepak
 *
 */
@RestController
public class IndexController {

	@RequestMapping(value = "/api/welcome")
	public String getIndexPage() {
		return "Welcome";
	}
}
