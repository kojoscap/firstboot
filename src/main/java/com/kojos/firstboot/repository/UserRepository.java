package com.kojos.firstboot.repository;

import com.kojos.firstboot.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
