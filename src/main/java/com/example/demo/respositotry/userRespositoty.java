package com.example.demo.respositotry;

import com.example.demo.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRespositoty extends JpaRepository<user,Integer> {
}
