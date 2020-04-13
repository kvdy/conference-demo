package com.kauvaidy.conferencedemo.repositories;

import com.kauvaidy.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
