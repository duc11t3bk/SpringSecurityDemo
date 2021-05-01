package SpringSecurityDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringSecurityDemo.entity.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	AppUser findByUserName(String userName);
}
