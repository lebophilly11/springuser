package co.bw.weblogic.springuser.service;

import co.bw.weblogic.springuser.model.Profile;
import java.util.List;
import java.util.UUID;

public interface ProfileService {
    Profile save(Profile profile);
    List<Profile> findAll();
    Profile findByCity(String city);
    Profile findById(UUID id);
    Void deleteById(UUID id);

}
