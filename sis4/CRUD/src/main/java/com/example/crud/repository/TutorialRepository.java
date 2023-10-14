package com.example.crud.repository;

import com.example.crud.domain.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TutorialRepository  extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);
}