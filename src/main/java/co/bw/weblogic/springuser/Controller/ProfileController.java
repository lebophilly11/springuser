package co.bw.weblogic.springuser.Controller;


import co.bw.weblogic.springuser.model.Profile;
import co.bw.weblogic.springuser.model.User;
import co.bw.weblogic.springuser.service.ProfileService;
import co.bw.weblogic.springuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping("/")
    public Profile saveProfile(@RequestBody Profile profile) {
        return profileService.save(profile);
    }

        @GetMapping("/")
        public List<Profile> getAllUsers() {
            return profileService.findAll();
        }

        @GetMapping("/{id}")
        public Profile findProfileById(@PathVariable UUID id) {
            return profileService.findById(id);
        }

        @GetMapping("/find-profile/{city}")
        public Profile findUserByCity(@PathVariable String city) {
            return profileService.findByCity (city);
        }

        @DeleteMapping("/{id}")
        public void deleteUserById(@PathVariable UUID id) {
            profileService.deleteById(id);
        }



}
