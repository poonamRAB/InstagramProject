package com.geekster.Instagram.repository;

import com.geekster.Instagram.model.AuthenticationToken;
import com.geekster.Instagram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IAuthenticationTokenRepo extends JpaRepository<AuthenticationToken,Long> {

    AuthenticationToken findByUser(User user);

    AuthenticationToken findFirstByToken(String token);
}
