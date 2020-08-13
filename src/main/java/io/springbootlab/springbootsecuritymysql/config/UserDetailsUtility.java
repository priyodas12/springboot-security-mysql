package io.springbootlab.springbootsecuritymysql.config;

import io.springbootlab.springbootsecuritymysql.entity.User;
import io.springbootlab.springbootsecuritymysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("userDetailsService")
public class UserDetailsUtility implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("user loading----------------");
        Optional<User> optUser=userRepository.findByUsername(username);
        optUser.orElseThrow(()->new UsernameNotFoundException("username not found in database"));
        return optUser.map(UserDetailsImpl::new).get();
    }
}
