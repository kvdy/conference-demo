package com.kauvaidy.conferencedemo.repositories;

import com.kauvaidy.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
