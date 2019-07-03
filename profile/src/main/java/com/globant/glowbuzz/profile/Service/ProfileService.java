package com.globant.glowbuzz.profile.Service;

import java.util.Optional;

import javax.validation.Valid;

import com.globant.glowbuzz.profile.model.Profile;

public interface ProfileService {

	public Optional<Profile> getProfile(Integer id);

	public void createProfile(@Valid Profile profile);

	public void editProfile(@Valid Profile profile);

	public void deleteProfile(Integer id);

}
