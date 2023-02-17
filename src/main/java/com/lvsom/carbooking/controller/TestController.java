package com.lvsom.carbooking.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "Chào mừng đến với trang chủ.";
	}

	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('OWNER') or hasRole('ADMIN')")
	public String userAccess() {
		return "Chào mừng đến với trang người dùng";
	}

	@GetMapping("/owner")
	@PreAuthorize("hasRole('OWNER')")
	public String moderatorAccess() {
		return "Chào mừng đến với trang owner";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Chào mừng đến với trang admin";
	}
}
