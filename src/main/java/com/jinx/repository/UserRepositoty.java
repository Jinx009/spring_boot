package com.jinx.repository;

import com.jinx.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoty extends JpaRepository<User,Long>{

    @Query("SELECT t FROM User t WHERE t.name = :name")
    User findByUserName(@Param("name") String name);
}
