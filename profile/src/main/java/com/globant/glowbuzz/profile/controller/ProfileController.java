package com.globant.glowbuzz.profile.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globant.glowbuzz.profile.Service.ProfileService;
import com.globant.glowbuzz.profile.model.Profile;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {

	@Autowired
	private ProfileService ProfileService;

	@GetMapping("/{id}")
	public Optional<Profile> getProfile(@PathVariable("id") Integer id) {
		return ProfileService.getProfile(id);
	}

	@PostMapping()
	public void deleteProfile(@Valid @RequestBody Profile profile) {
		ProfileService.createProfile(profile);
	}

	@PutMapping("/{id}")
	public void editProfile(@PathVariable Integer id, @Valid @RequestBody Profile profile) {
		profile.setId(id);
		ProfileService.editProfile(profile);
	}

	@DeleteMapping("/{id}")
	public void deleteProfile(@PathVariable Integer id) {
		ProfileService.deleteProfile(id);
	}

}
