package SpringSecurityDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringSecurityDemo.entity.AppRole;
import SpringSecurityDemo.entity.AppUser;
import SpringSecurityDemo.entity.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long>{
	List<UserRole> findByAppUser(AppUser appUser);
}
