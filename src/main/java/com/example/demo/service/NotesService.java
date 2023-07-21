package com.example.demo.service;
import com.example.demo.entity.Notes;
import com.example.demo.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class NotesService {
    @Autowired
    private NotesRepository repository;

    public Notes saveNotes(Notes notes)
    {
        return repository.save(notes);
    }

     public List<Notes> getAllNotes()
    {
        return repository.findAll();
    }
      public Notes getNotesbyId(int id)
    {
        return repository.findById(id).orElse(null);
    }
       public String deleteNotes(int id)
    {
        repository.deleteById(id);
        return "Notes With ID : "+ id + " Deleted !";
    }
    public Notes updatebNotes(Notes notes){
        Notes existingNotes = repository.findById(notes.getId()).orElse(null);

        existingNotes.setAuthor(notes.getAuthor());
        existingNotes.setDiscription(notes.getDiscription());
        existingNotes.setTitle(notes.getTitle());
        existingNotes.setAuthorId(notes.getAuthorId());

        return repository.save(existingNotes);

    }
}
