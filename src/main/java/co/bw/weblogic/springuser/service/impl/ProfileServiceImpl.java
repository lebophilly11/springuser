package co.bw.weblogic.springuser.service.impl;

import co.bw.weblogic.springuser.model.Profile;
import co.bw.weblogic.springuser.repository.ProfileRepository;
import co.bw.weblogic.springuser.repository.UserRepository;
import co.bw.weblogic.springuser.service.ProfileService;
import jakarta.persistence.Entity;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional

public class ProfileServiceImpl implements ProfileService {
    @Autowired
    private ProfileRepository profileRepository;
    @Autowired
    private UserRepository userRepository;


    @Override
    public Profile save(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public List<Profile> findAll() { return profileRepository.findAll();}

    @Override
    public Profile findByCity(String city) {
        return profileRepository.findByCity(city).orElse(null);
    }

    @Override
    public Profile findById(UUID id) {
        return profileRepository.findById(id).orElse(null);
    }

    @Override
    public Void deleteById(UUID id) {
        profileRepository.deleteById(id);
        return null;
    }
}
