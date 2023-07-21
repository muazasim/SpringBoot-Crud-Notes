package com.example.demo.repository;
import com.example.demo.entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NotesRepository extends JpaRepository<Notes,Integer> {
    
    
}


