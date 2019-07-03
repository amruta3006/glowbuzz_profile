package com.globant.glowbuzz.profile.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.globant.glowbuzz.profile.model.Profile;

public interface ProfileRepository extends MongoRepository<Profile, Integer>{

}
