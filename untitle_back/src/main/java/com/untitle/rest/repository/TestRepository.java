package com.untitle.rest.repository;

import com.untitle.rest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<User,Long> {
//    Entity save(Entity entity);
}
