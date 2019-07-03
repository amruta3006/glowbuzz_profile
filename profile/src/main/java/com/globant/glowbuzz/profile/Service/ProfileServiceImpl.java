package com.globant.glowbuzz.profile.Service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globant.glowbuzz.profile.model.Profile;
import com.globant.glowbuzz.profile.repository.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	ProfileRepository profileRepository;

	@Override
	public Optional<Profile> getProfile(Integer id) {
		return profileRepository.findById(id);
	}

	@Override
	public void createProfile(@Valid Profile profile) {
		profileRepository.save(profile);

	}

	@Override
	public void editProfile(@Valid Profile profile) {
		profileRepository.save(profile);

	}

	@Override
	public void deleteProfile(Integer id) {
		profileRepository.deleteById(id);

	}

}
